package eugene.structural.composite;

import java.util.List;

/**
 * Created by Jian on 2015/7/28.
 */
public class Word extends LetterComposite {
    public Word(List<Letter> letters){
        for (Letter l : letters) {
            this.add(l);
        }
    }

    @Override
    protected void printThisBefore() {
        System.out.print(" ");
    }

    @Override
    protected void printThisAfter() {

    }
}
