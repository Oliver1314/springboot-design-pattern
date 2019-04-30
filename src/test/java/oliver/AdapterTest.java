package oliver;

import oliver.adapter.adapterForObject.Adapter;
import oliver.adapter.adapterForObject.Ps2;
import oliver.adapter.adapterForObject.Usber;

/**
 * Created by Oliver on 2018/7/17.
 */
public class AdapterTest {

    public static void main(String[] args) {
//        Ps2 ps2=new Adapter();
//        ps2.isPs2();

        Ps2 ps2=new Adapter(new Usber());
        ps2.isPs2();
    }
}
