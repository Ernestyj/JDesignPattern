package eugene.structural.facade;

/**
 * Created by Jian on 2015/7/28.
 */
/**
 *
 * DwarvenCartOperator is one of the goldmine subsystems.
 *
 */
public class DwarvenCartOperator extends DwarvenMineWorker{
    public DwarvenCartOperator(){

    }
    @Override
    public void work(){
        System.out.println(name() + " moves gold chunks out of the mine.");
    }
    @Override
    public String name(){
        return "Dwarf cart operator";
    }
}
