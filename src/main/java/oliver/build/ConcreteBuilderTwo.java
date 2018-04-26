package oliver.build;

import org.springframework.stereotype.Component;

/**
 * Created by Oliver on 2018/4/26.
 */
@Component("builder2")
public class ConcreteBuilderTwo implements Builder {

    private Computer computer=new Computer();

    @Override
    public void buildCpu() {
        computer.add("二号CPU");
        System.out.println("具体建造者二号建造CPU");
    }

    @Override
    public void buildMainboard() {
        computer.add("二号主板");
        System.out.println("具体建造者二号建造主板");
    }

    @Override
    public void buildHD() {
        computer.add("二号硬盘");
        System.out.println("具体建造者二号建造硬盘");
    }

    @Override
    public Computer getComputer() {
        buildCpu();
        buildMainboard();
        buildHD();
        return computer;
    }
}
