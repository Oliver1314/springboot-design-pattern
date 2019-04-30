package oliver.factory;

/**
 * Created by Oliver on 2018/7/16.
 */
public interface IFactory<T> {

     T create(Class<? extends T> c);
}
