package eugene.behavioral.iterator;

/**
 * Created by Jian on 2015/8/2.
 */
public class Item {
    private String name;
    private ItemType type;

    public Item(ItemType type, String name) {
        this.setType(type);
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public ItemType getType(){
        return type;
    }

    public void setType(ItemType type){
        this.type = type;
    }
}
