package eugene.structural.composite;

/**
 * Created by Jian on 2015/7/28.
 */

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Composite interface.
 *
 */
abstract public class LetterComposite {
    private List<LetterComposite> children = new ArrayList<LetterComposite>();
    public LetterComposite(){

    }
    public void add(LetterComposite letterComposite){
        children.add(letterComposite);
    }
    public int count(){
        return children.size();
    }
    abstract protected void  printThisBefore();
    abstract protected void printThisAfter();
    public void print(){
        printThisBefore();
        for (LetterComposite letter : children) {
            letter.print();
        }
        printThisAfter();
    }
}
