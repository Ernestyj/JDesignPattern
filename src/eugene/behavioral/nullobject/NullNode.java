package eugene.behavioral.nullobject;

/**
 * Created by Jian on 2015/8/12.
 */
/**
 *
 * Null Object implementation for binary tree node.
 *
 * Implemented as Singleton, since all the NullNodes are the same.
 *
 */
public class NullNode implements Node {
    private static NullNode instance = new NullNode();

    private NullNode() {
    }

    public static NullNode getInstance(){
        return instance;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getTreeSize() {
        return 0;
    }

    @Override
    public Node getLeft() {
        return null;
    }

    @Override
    public Node getRight() {
        return null;
    }

    @Override
    public void walk() {

    }
}
