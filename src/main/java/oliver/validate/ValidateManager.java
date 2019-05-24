package oliver.validate;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Map;

/**
 * @auhor Oliver
 * @date 2019/5/24 15:21
 */
public class ValidateManager {

    public static void valid(ValidProvider provider, Object object) throws ValidException {
        try {

            ValidStore store = provider.getProvider().get(object.getClass());
            for (ValidModel valid : store.valids()) {
                Field field = store.getField(valid.getFieldName());
                if (!field.isAccessible()) {
                    field.setAccessible(true);
                }
                Object value = field.get(object);

                // 系统默认校验规则
                for (IValid mValid : provider.getValids()) {
                    if (!mValid.valid(value, valid)) {
                        throw new ValidException(mValid.getMsg(valid));
                    }
                }

            }
        } catch (IllegalAccessException | NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }

    public static void valid(ValidProvider provider, Object object,Map<String,Object> map) throws ValidException {
        try {

            ValidStore store = provider.getProvider().get2(object,map);
            for (ValidModel valid : store.valids()) {
                Field field = store.getField(valid.getFieldName());
                if (!field.isAccessible()) {
                    field.setAccessible(true);
                }
                Object value = field.get(object);

                // 系统默认校验规则
                for (IValid mValid : provider.getValids()) {
                    if (!mValid.valid(value, valid)) {
                        throw new ValidException(mValid.getMsg(valid));
                    }
                }

            }
        } catch (IllegalAccessException | NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }




//    public static void valid(Object object) throws ValidException {
//        valid(object, null);
//    }

    public static void valid(Object object, Map<String,Object> map) throws ValidException {
        valid(IProviderHolder.provider,object,map);
    }

//    public static void valid(Object object, String id) throws ValidException {
//        valid(IProviderHolder.provider, object);
//    }

    /**
     * 懒加载{@link IProvider}
     */
    private static final class IProviderHolder {
        private static final ValidProvider provider = new DefaultValidProvider();
    }

}
