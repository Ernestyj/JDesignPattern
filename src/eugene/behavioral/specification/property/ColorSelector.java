package eugene.behavioral.specification.property;

import eugene.behavioral.specification.creature.Creature;

import java.util.function.Predicate;

/**
 * Created by Jian on 2015/8/12.
 */
public class ColorSelector implements Predicate<Creature> {

    private final Color c;

    public ColorSelector(Color c) {
        this.c = c;
    }

    @Override
    public boolean test(Creature t) {
        return t.getColor().equals(c);
    }
}
