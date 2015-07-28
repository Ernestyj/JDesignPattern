package eugene.structural.composite;

import java.util.List;

/**
 * Created by Jian on 2015/7/28.
 */
public class Sentence extends LetterComposite{
    public Sentence(List<Word> words){
        for (Word w : words) {
            this.add(w);
        }
    }

    @Override
    protected void printThisBefore() {

    }

    @Override
    protected void printThisAfter() {
        System.out.print(".");
    }
}
