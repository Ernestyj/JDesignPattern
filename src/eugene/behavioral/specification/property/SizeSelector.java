package eugene.behavioral.specification.property;

/**
 * Created by Jian on 2015/8/12.
 */

import eugene.behavioral.specification.creature.Creature;

import java.util.function.Predicate;

/**
 *
 * Size selector.
 *
 */
public class SizeSelector implements Predicate<Creature> {

    private final Size s;

    public SizeSelector(Size s) {
        this.s = s;
    }

    @Override
    public boolean test(Creature t) {
        return t.getSize().equals(s);
    }
}