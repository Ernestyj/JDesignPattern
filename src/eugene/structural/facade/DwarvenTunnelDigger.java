package eugene.structural.facade;

/**
 * Created by Jian on 2015/7/28.
 */
public class DwarvenTunnelDigger extends DwarvenMineWorker{
    public DwarvenTunnelDigger(){

    }
    @Override
    public void work(){
        System.out.println(name() + " creates another promising tunnel.");
    }
    @Override
    public String name(){
        return "Dwarven tunnel digger";
    }
}
