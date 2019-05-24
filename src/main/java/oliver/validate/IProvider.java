package oliver.validate;


import java.util.Map;

public interface IProvider {

    ValidStore get(Class<?> cls);

    ValidStore get2(Object obj, Map<String,Object> map) throws IllegalAccessException;

}
