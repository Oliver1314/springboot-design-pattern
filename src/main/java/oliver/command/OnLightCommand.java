package oliver.command;

/**
 * @auhor Oliver
 * @date 2019/2/28 15:14
 */
public class OnLightCommand implements Command {

    private Receiver receiver;

    public OnLightCommand(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.dosomething();
    }
}
