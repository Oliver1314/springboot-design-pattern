package oliver.validate;


import org.springframework.util.StringUtils;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class DefaultProvider implements IProvider {

    @Override
    public ValidStore get(Class<?> cls) {

        //首先遍历类上的注解，给类的全部属性设置规则,如果属性上有注解，以属性上的注解为主

        Valid allVaid = cls.getAnnotation(Valid.class);

        Field[] fields = ValidUtils.getAllFields(cls);

        List<ValidModel> validModels = new ArrayList<>();
        for (Field field : fields) {


            Valid validAnn = field.getAnnotation(Valid.class);
            if (validAnn != null) {
                addValid(validAnn, field.getName(), field.getName(), validModels);
            }else if(null != allVaid){
                addValid(allVaid, field.getName(), field.getName(), validModels);
            }
        }
        return new DefaultValidStore(fields, validModels);
    }

    /**
     * 将类型的属性赋值同时进行校验
     * @param obj
     * @return
     */
    public ValidStore get2(Object obj, Map<String,Object> map) throws IllegalAccessException {

        //首先遍历类上的注解，给类的全部属性设置规则,如果属性上有注解，以属性上的注解为主

        Class<?> cls = obj.getClass();

        RequestValid allVaid = cls.getAnnotation(RequestValid.class);

        Field[] fields = ValidUtils.getAllFields(cls);

        List<ValidModel> validModels = new ArrayList<>();
        for (Field field : fields) {


            RequestValid validAnn = field.getAnnotation(RequestValid.class);
            if (validAnn != null) {

                if(!StringUtils.isEmpty(validAnn.value())){
                    field.setAccessible(true);
                    field.set(obj,map.get(validAnn.value()));
                }

                addValid2(validAnn, field.getName(), field.getName(), validModels);
            }else if(null != allVaid){
                field.setAccessible(true);
                field.set(obj,map.get(field.getName()));
                addValid2(allVaid, field.getName(), field.getName(), validModels);
            }
        }
        return new DefaultValidStore(fields, validModels);
    }

    private void addValid(Valid validAnn, String name, String fieldName, List<ValidModel> validModels) {
        ValidModel model = new ValidModel();
        model.setName(validAnn.name().length() > 0 ? validAnn.name() : name);
        model.setMin(validAnn.min());
        model.setMax(validAnn.max());
        model.setNullable(validAnn.nullable());
        model.setPattern(validAnn.pattern());
        model.setPatternMsg(validAnn.patternMsg());
        model.setScale(validAnn.scale());
        model.setFieldName(fieldName);
        validModels.add(model);
    }

    private void addValid2(RequestValid validAnn, String name, String fieldName, List<ValidModel> validModels) {

        ValidModel model = new ValidModel();
        model.setName(validAnn.name().length() > 0 ? validAnn.name() : name);
        model.setMin(validAnn.min());
        model.setMax(validAnn.max());
        model.setNullable(validAnn.nullable());
        model.setPattern(validAnn.pattern());
        model.setPatternMsg(validAnn.patternMsg());
        model.setScale(validAnn.scale());
        model.setFieldName(fieldName);
        validModels.add(model);
    }
}
