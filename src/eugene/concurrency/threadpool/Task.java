package eugene.concurrency.threadpool;

/**
 * Created by Jian on 2015/8/13.
 */
/**
 *
 * Abstract base class for tasks
 *
 */
abstract public class Task {
    private static int nextId = 1;
    private final int id;
    private final int timeMs;

    public int getNextId() {
        return nextId;
    }

    public int getTimeMs() {
        return timeMs;
    }

    protected Task(final int timeMs) {
        this.id = nextId++;
        this.timeMs = timeMs;
    }

    @Override
    public String toString() {
        return String.format("id=%d timeMs=%d", id, timeMs);
    }
}
