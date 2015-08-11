package eugene.creational.objectpool;

/**
 * Created by Jian on 2015/8/11.
 */
/**
 *
 * Oliphaunts are expensive to create
 *
 */
public class Oliphaunt {
    private static int counter = 1;
    private final int id;

    public Oliphaunt() {
        id = counter++;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int getId(){
        return id;
    }

    @Override
    public String toString() {
        return String.format("Oliphaunt id=%d", id);
    }
}
