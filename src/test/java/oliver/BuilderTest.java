package oliver;

import oliver.build.Director;
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
public class BuilderTest {

    @Autowired
    private Director director;


    @Test
    public void testBuilder() throws InterruptedException {

        director.sellComputer("builder2");
    }

}
