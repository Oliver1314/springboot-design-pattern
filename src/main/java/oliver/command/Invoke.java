package oliver.command;

/**
 * @auhor Oliver
 * @date 2019/2/28 15:12
 */
public class Invoke {

    private Command command;

    public Invoke(Command command){
        this.command = command;
    }

    //执行命令
    public void action(){
        command.execute();
    }
}
