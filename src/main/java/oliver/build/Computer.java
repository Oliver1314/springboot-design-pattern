package oliver.build;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Oliver on 2018/4/26.
 */
public class Computer {

    private List<String> parts=new ArrayList<>();

    private String cpu;

    private String mainboard;

    private String hd;

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMainboard() {
        return mainboard;
    }

    public void setMainboard(String mainboard) {
        this.mainboard = mainboard;
    }

    public String getHd() {
        return hd;
    }

    public void setHd(String hd) {
        this.hd = hd;
    }


    public void add(String part){
        this.parts.add(part);
    }
}
