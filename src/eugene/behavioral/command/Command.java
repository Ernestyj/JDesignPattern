package eugene.behavioral.command;

/**
 * Created by Jian on 2015/8/2.
 */
/**
 *
 * Interface for Commands.
 *
 */
abstract public class Command {
    abstract public void execute(Target target);
    abstract public void undo();
    abstract public void redo();

    @Override
    abstract public String toString();
}
