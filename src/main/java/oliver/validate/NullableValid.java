package oliver.validate;

/**
 * @author Kail
 * @version 1.0
 * @date 19-4-14
 * @description 空值校验
 */
public class NullableValid implements IValid {

    @Override
    public boolean valid(Object value, ValidModel valid) {
        return valid.isNullable() || !ValidUtils.isEmpty(value);
    }

    @Override
    public String getMsg(ValidModel valid) {
        return valid.getName() + "不能为空";
    }

}
