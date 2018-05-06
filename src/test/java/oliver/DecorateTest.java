package oliver;

import oliver.concrete.Decorate;
import oliver.concrete.DecorateA;
import oliver.concrete.DecorateB;
import oliver.concrete.Java;
import oliver.concrete.Language;

/**
 * Created by Oliver on 2018/4/25.
 */


public class DecorateTest {

    public static void main(String[] args) {
        Language language=new Java();

        new Decorate(new DecorateA(new DecorateB(language))).desc();
    }

}
