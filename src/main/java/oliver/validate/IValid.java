package oliver.validate;



public interface IValid {

    /**
     * @param value 值
     * @param valid {@link ValidModel}
     * @return true则验证通过，fasle验证不通过
     */
    boolean valid(Object value, ValidModel valid);

    String getMsg(ValidModel valid);
}
