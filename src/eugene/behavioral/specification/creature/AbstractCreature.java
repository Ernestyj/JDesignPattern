package eugene.behavioral.specification.creature;

import eugene.behavioral.specification.property.Color;
import eugene.behavioral.specification.property.Movement;
import eugene.behavioral.specification.property.Size;

/**
 * Created by Jian on 2015/8/12.
 */
/**
 *
 * Base class for concrete creatures.
 *
 */
abstract public class AbstractCreature implements Creature{
    private String name;
    private Size size;
    private Movement movement;
    private Color color;

    public AbstractCreature(String name, Size size, Movement movement, Color color) {
        this.name = name;
        this.size = size;
        this.movement = movement;
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("%s [size=%s, movement=%s, color=%s]",
                name, size, movement, color);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Size getSize() {
        return size;
    }

    @Override
    public Movement getMovement() {
        return movement;
    }

    @Override
    public Color getColor() {
        return color;
    }
}
