package oliver.concrete;

/**
 * Created by Oliver on 2018/5/6.
 */
public class DecorateB extends Decorate {

    public DecorateB(Language language) {
        super(language);
    }

    @Override
    public void desc() {
        decorateB();
        super.desc();
    }

    private void decorateB(){
        System.out.println("我是装饰B.........");
    }
}
