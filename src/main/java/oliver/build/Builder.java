package oliver.build;

/**
 * Created by Oliver on 2018/4/26.
 *
 * 说明:建造者模式,以组装电脑为例子
 */
public interface Builder {

    void buildCpu();

    void buildMainboard();

    void buildHD();

    Computer getComputer();

}
