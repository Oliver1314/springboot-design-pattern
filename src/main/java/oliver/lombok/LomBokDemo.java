package oliver.lombok;

import lombok.*;

/**
 * @auhor Oliver
 * @date 2019/4/30 10:48
 *
 * 学习使用Lombok
 */

@Getter
@Setter
@Builder
public class LomBokDemo {

    @NonNull
    private String name;

    private Integer age;

    private Boolean sex;


}
