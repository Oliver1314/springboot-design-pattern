package oliver;

import oliver.proxy.Middleman;
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
public class ProxyTest {

    @Autowired
    private Middleman middleman;


    @Test
    public void testProxy() throws InterruptedException {


        middleman.getClothingProxy("market");

        Thread.sleep(5000);
    }

}
