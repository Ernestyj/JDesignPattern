package eugene.structural.facade;

/**
 * Created by Jian on 2015/7/28.
 */
/**
 *
 * DwarvenGoldDigger is one of the goldmine subsystems.
 *
 */
public class DwarvenGoldDigger extends DwarvenMineWorker{
    public DwarvenGoldDigger(){

    }

    @Override
    public void work(){
        System.out.println(name() + " digs for gold.");
    }

    @Override
    public String name() {
        return "Dwarf gold digger";
    }

}
