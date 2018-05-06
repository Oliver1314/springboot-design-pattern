package oliver.concrete;

/**
 * Created by Oliver on 2018/5/6.
 */
public class Decorate implements Language {

    private Language language;


    public Decorate(Language language){
        this.language=language;
    }

    @Override
    public void desc() {
        language.desc();
    }
}
