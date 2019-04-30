package oliver.command;

/**
 * @auhor Oliver
 * @date 2019/2/28 15:18
 */
public class TestCommand {

    public static void main(String[] args) {
        //开灯命令
        OnLightCommand onLightCommand = new OnLightCommand(new OnLightReceiver());

        //关灯命令
        OffLightCommand offLightCommand = new OffLightCommand(new OffLightReceiver());

        Invoke invoke = new Invoke(onLightCommand);
        invoke.action();


        Invoke invoke1 = new Invoke(offLightCommand);
        invoke1.action();
    }
}
