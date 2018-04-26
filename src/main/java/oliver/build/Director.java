package oliver.build;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Oliver on 2018/4/26.
 */
@Component
public class Director {

    private final Map<String,Builder> builderMap=new ConcurrentHashMap<>();

    @Autowired
    public Director(Map<String,Builder> builderMap){
       builderMap.forEach((k,v) -> {
           this.builderMap.put(k,v);
       });
    }

    public void sellComputer(String computerKey){
        this.builderMap.get(computerKey).getComputer();
    }

}
