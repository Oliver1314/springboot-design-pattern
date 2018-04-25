package oliver.strategy;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * Created by Oliver on 2018/4/25.
 */
@Component("general")
public class GeneralCalculator implements Calculator {

    @Override
    public BigDecimal calculatePrice() {
        return new BigDecimal("100");
    }
}
