package oliver.lombok;

import lombok.extern.slf4j.Slf4j;

/**
 * @auhor Oliver
 * @date 2019/4/30 10:49
 */

@Slf4j
public class LomBokMain {

    public static void main(String[] args) {

        //@Getter @Setter

        LomBokDemo lomBokDemo = LomBokDemo.builder().name("测试").build();
        System.out.println(lomBokDemo.getName());

        lomBokDemo.setName(null);

        log.info("测试。。。。。。。。。。。。。");


/*********************************************************************************************/

        LomBokDemo2 lomBokDemo2 = LomBokDemo2.getInstance();
    }
}
