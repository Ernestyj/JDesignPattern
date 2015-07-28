package eugene.structural.adapter;

/**
 * Created by Jian on 2015/7/28.
 */
/**
 *
 * GnomeEngineering manager uses Engineer to operate devices.
 *
 */
public class GnomeEngineeringManager implements Engineer{
    private Engineer engineer;

    public GnomeEngineeringManager(){
        engineer = new GnomeEngineer();
    }

    @Override
    public void operateDevice() {
        engineer.operateDevice();
    }
}
