package oliver.adapter.adapterForObject;

/**
 * Created by Oliver on 2018/7/17.
 */
public class Adapter implements Ps2 {

    private Usb usb;

    public Adapter(Usb usb){
        this.usb=usb;
    }

    @Override
    public void isPs2() {
       usb.isUsb();
    }
}
