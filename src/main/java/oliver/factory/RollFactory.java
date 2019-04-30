package oliver.factory;

/**
 * Created by Oliver on 2018/7/16.
 */
public class RollFactory implements IFactory<Roll> {

    @Override
    public Roll create(Class<? extends Roll> c) {
        Roll roll=null;
        try {
            roll= (Roll) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return roll;
    }
}
