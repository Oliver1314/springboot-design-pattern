package oliver.command;

/**
 * @auhor Oliver
 * @date 2019/2/28 15:17
 */
public class OnLightReceiver implements Receiver {
    @Override
    public void dosomething() {
        System.out.println("打开灯。。。。。。。。。。。。。");
    }
}
