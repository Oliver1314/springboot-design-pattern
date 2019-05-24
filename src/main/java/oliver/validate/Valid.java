package oliver.validate;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD,ElementType.TYPE})
public @interface Valid {

    /**
     * 字段简称
     *
     * @return
     */
    String name() default "";

    /**
     * 是否为空
     *
     * @return
     */
    boolean nullable() default false;

    /**
     * 最小长度
     *
     * @return
     */
    int min() default 0;

    /**
     * 最大长度
     *
     * @return
     */
    int max() default Integer.MAX_VALUE;

    /**
     * 小数保留位数
     *
     * @return
     */
    int scale() default -1;

    /**
     * 正则校验
     *
     * @return
     */
    String pattern() default "";

    /**
     * 正则校验信息
     *
     * @return
     */
    String patternMsg() default "#{name}校验失败";

}
