package eugene.structural.servant;

/**
 * Created by Jian on 2015/8/11.
 */
public class Queen implements Royalty {
    private boolean isDrunk = true;
    private boolean isHungry;
    private boolean isHappy;
    private boolean isFlirty = true;
    private boolean complimentReceived;

    public void setFlirtiness(boolean f) {
        this.isFlirty = f;
    }

    @Override
    public void getFed() {
        isHungry = false;
    }

    @Override
    public void getDrink() {
        isDrunk = true;
    }

    @Override
    public void changeMood() {
        if (complimentReceived && isFlirty && isDrunk) isHappy = true;
    }

    @Override
    public void receiveCompliments() {
        complimentReceived = true;
    }

    @Override
    public boolean getMood() {
        return isHappy;
    }
}
