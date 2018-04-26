package oliver.build;

import org.springframework.stereotype.Component;

/**
 * Created by Oliver on 2018/4/26.
 */
@Component("builder1")
public class ConcreteBuilderOne implements Builder {


   private  Computer computer=new Computer();

    @Override
    public void buildCpu() {
        computer.add("一号CPU");
        System.out.println("具体建造者一号建造CPU");
    }

    @Override
    public void buildMainboard() {
        computer.add("一号主板");
        System.out.println("具体建造者一号建造主板");
    }

    @Override
    public void buildHD() {
        computer.add("一号硬盘");
        System.out.println("具体建造者一号建造硬盘");
    }

    @Override
    public Computer getComputer() {
        buildCpu();
        buildMainboard();
        buildHD();
        return computer;
    }
}
