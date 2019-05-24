package oliver.validate;


import java.util.ArrayList;
import java.util.List;


public class DefaultValidProvider implements ValidProvider {

    private static final IProvider provider = new DefaultProvider();
    private static List<IValid> valids = new ArrayList<>();

    static {
        valids.add(new NullableValid());
        valids.add(new PatternValid());
        valids.add(new LengthValid());
        valids.add(new DecimalValid());
    }

    @Override
    public List<IValid> getValids() {
        return valids;
    }

    @Override
    public IProvider getProvider() {
        return provider;
    }


}
