package oliver;

import oliver.factory.AnimalFactory;
import oliver.factory.AnimalToy;
import oliver.factory.CatToy;
import oliver.factory.FootBall;
import oliver.factory.IFactory;
import oliver.factory.Roll;
import oliver.factory.RollFactory;

/**
 * Created by Oliver on 2018/7/16.
 */
public class FactoryTest {
    public static void main(String[] args) {

        IFactory<Roll> rollFactory=new RollFactory();
        Roll footBall=rollFactory.create(FootBall.class);
        footBall.creat();

        IFactory<AnimalToy> animalToyIFactory=new AnimalFactory();
        AnimalToy catToy=animalToyIFactory.create(CatToy.class);
        catToy.cry();

    }
}
