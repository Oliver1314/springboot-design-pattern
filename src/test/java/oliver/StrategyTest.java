package oliver;

import oliver.strategy.StrategyContext;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Oliver on 2018/4/25.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class StrategyTest {

    @Autowired
    private StrategyContext strategyContext;


    @Test
    public void testStrategy() throws InterruptedException {



        System.out.println(strategyContext.calculatePrice("vip").toString() + "=============================<><><>");


        Thread.sleep(5000);
    }

}
