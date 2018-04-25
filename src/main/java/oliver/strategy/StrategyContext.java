package oliver.strategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Oliver on 2018/4/25.
 */
@Component
public class StrategyContext {

    /**
     *使用线程安全的ConcurrentHashMap存储所有实现Calculator接口的Bean
     *key:beanName
     *value：实现Calculator接口Bean
     */

    private final Map<String,Calculator> strategyMap=new ConcurrentHashMap<>();

    private final List<Calculator> calculators=new ArrayList<>();

    /**
     * 注入所有实现Calculator接口的Bean
     * @param strategyMap
     */

    @Autowired
    public StrategyContext(Map<String,Calculator> strategyMap){
        this.strategyMap.clear();
        strategyMap.forEach((k,v) -> {
            this.strategyMap.put(k,v);
        });

    }


//    @Autowired
//    public StrategyContext(List<Calculator> calculators){
//        calculators.stream().forEach(cal -> {
//            this.calculators.add(cal);
//        });
//
//        System.out.println(this.calculators+"-------------------------->>>");
//
//    }


    public BigDecimal calculatePrice(String level){
        BigDecimal bigDecimal=null;
        if(!StringUtils.isEmpty(level)){
            bigDecimal=this.strategyMap.get(level).calculatePrice();
        }
        return bigDecimal;
    }



}
