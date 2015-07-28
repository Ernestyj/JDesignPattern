package eugene.structural.composite;

/**
 * Created by Jian on 2015/7/28.
 */
public class Letter extends LetterComposite{
    private char c;
    public Letter(char c){
        this.c = c;
    }

    @Override
    protected void printThisBefore() {
        System.out.print(c);
    }

    @Override
    protected void printThisAfter() {

    }

}
