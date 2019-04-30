package oliver.factory;

/**
 * Created by Oliver on 2018/7/16.
 */
public class AnimalFactory implements IFactory<AnimalToy>{

    @Override
    public  AnimalToy create(Class<? extends AnimalToy> c) {
        AnimalToy animalToy=null;

        try {
            animalToy= (AnimalToy) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
        }
        return animalToy;
    }
}
