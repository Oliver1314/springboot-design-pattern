package oliver.validate;

import java.util.List;

/**
 * @auhor Oliver
 * @date 2019/5/24 15:22
 */
public interface ValidProvider {

    /**
     * 得到校验规则
     * @return
     */
    List<IValid> getValids();


    IProvider getProvider();
}
