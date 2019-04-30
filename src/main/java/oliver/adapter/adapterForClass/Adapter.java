package oliver.adapter.adapterForClass;

/**
 * Created by Oliver on 2018/7/17.
 */
public class Adapter extends Usber implements Ps2 {

    @Override
    public void isPs2() {
        isUsb();
    }
}
