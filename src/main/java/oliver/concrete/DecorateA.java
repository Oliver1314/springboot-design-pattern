package oliver.concrete;

/**
 * Created by Oliver on 2018/5/6.
 */
public class DecorateA extends Decorate {

    public DecorateA(Language language) {
        super(language);
    }

    @Override
    public void desc() {
        decorateA();
        super.desc();
    }

    private void decorateA(){
        System.out.println("我是装饰A.........");
    }
}
