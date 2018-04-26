package oliver.proxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Oliver on 2018/4/26.
 */
@Component
public class Middleman {

    private final Map<String,ClothingProxy> clothingProxyMap=new ConcurrentHashMap<>();

    private ClothingProxy clothingProxy;

    @Autowired
    public Middleman(Map<String,ClothingProxy> clothingProxyMap){
        clothingProxyMap.forEach((k,v) ->this.clothingProxyMap.put(k,v));
    }

    private void proxy() {
        System.out.println("代理增强开始。。。。。。");

        clothingProxy.sellClothing();

        System.out.println("代理增强结束。。。。。。");
    }

    public void getClothingProxy(String proxyKey){
        this.clothingProxy=this.clothingProxyMap.get(proxyKey);
        proxy();
    }


}
