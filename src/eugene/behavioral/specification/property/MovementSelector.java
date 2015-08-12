package eugene.behavioral.specification.property;

/**
 * Created by Jian on 2015/8/12.
 */

import eugene.behavioral.specification.creature.Creature;

import java.util.function.Predicate;

/**
 *
 * Movement selector.
 *
 */
public class MovementSelector implements Predicate<Creature> {

    private final Movement m;

    public MovementSelector(Movement m) {
        this.m = m;
    }

    @Override
    public boolean test(Creature t) {
        return t.getMovement().equals(m);
    }
}
