package eugene.structural.servant;

import java.util.ArrayList;

/**
 * Created by Jian on 2015/8/11.
 */
public class Servant {
    public String name;

    public Servant(String name) {
        this.name = name;
    }

    public void feed(Royalty r){
        r.getFed();
    }

    public void giveWine(Royalty r){
        r.getDrink();
    }

    public void giveCompliments(Royalty r){
        r.receiveCompliments();
    }

    public boolean checkIfYouWillBeHanged(ArrayList<Royalty> tableGuests){
        boolean anotherDay = true;
        for( Royalty r : tableGuests )
            if( !r.getMood() ) anotherDay = false;

        return anotherDay;
    }
}
