package eugene.structural.servant;

/**
 * Created by Jian on 2015/8/11.
 */
public class King implements Royalty {
    private boolean isDrunk, isHungry = true, isHappy, complimentReceived;

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
        if (!isHungry && isDrunk) isHappy = true;
        if (complimentReceived) isHappy = false;
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
