package oliver.proxy;

import org.springframework.stereotype.Component;

/**
 * Created by Oliver on 2018/4/26.
 */
@Component
public class Shop implements ClothingProxy {

    @Override
    public void sellClothing() {
        System.out.println("商店想卖服装。。。。。。");
    }
}
