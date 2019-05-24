package oliver.validate;


import com.sun.istack.internal.Nullable;

import java.lang.reflect.Field;
import java.util.List;

public interface ValidStore {

    /**
     * 根据字段名获取字段
     *
     * @param fieldName
     * @return
     */
    Field getField(String fieldName) throws NoSuchFieldException;

    /**
     * 获取当前需要验证的对象
     *
     * @return
     */
    List<ValidModel> valids();


}
