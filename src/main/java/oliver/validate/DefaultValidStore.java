package oliver.validate;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;
import java.util.Map;


public class DefaultValidStore implements ValidStore {

    private Field[] fields;
    private List<ValidModel> validModels ;

    public DefaultValidStore(Field[] fields, List<ValidModel> validModels) {
        this.fields = fields;
        this.validModels = validModels;
    }

    @Override
    public Field getField(String fieldName) throws NoSuchFieldException {
        for (Field field : fields) {
            if (field.getName().equals(fieldName)) {
                return field;
            }
        }
        throw new NoSuchFieldException("Not found field by name[" + fieldName + "]");
    }

    @Override
    public List<ValidModel> valids() {
        return this.validModels;
    }
}
