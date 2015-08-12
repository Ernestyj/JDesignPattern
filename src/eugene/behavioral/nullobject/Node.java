package eugene.behavioral.nullobject;

/**
 * Created by Jian on 2015/8/12.
 */
/**
 *
 * Interface for binary tree node.
 *
 */
public interface Node {

    String getName();
    int getTreeSize();
    Node getLeft();
    Node getRight();
    void walk();
}
