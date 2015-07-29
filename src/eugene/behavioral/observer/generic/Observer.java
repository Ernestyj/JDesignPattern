package eugene.behavioral.observer.generic;

/**
 * Created by Jian on 2015/7/29.
 */
public interface Observer<S extends Observable<S, O, A>, O extends Observer<S, O, A>, A> {
    void update(S subject, A argument);
}
