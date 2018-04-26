package oliver.proxy;

import org.springframework.stereotype.Component;

/**
 * Created by Oliver on 2018/4/26.
 */
@Component
public class Market implements ClothingProxy {

    @Override
    public void sellClothing() {
        System.out.println("超市想卖服装。。。。。。");
    }
}
