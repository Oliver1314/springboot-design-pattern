package oliver.lombok;

import lombok.Data;

/**
 * @auhor Oliver
 * @date 2019/4/30 11:01
 */
@Data(staticConstructor = "getInstance")
public class LomBokDemo2 {

    private String name;
    private Integer age;
}
