package eugene.behavioral.iterator;

import java.util.List;

/**
 * Created by Jian on 2015/8/2.
 */
public class TreasureChestItemIterator implements ItemIterator {
    private int idx;
    private TreasureChest treasureChest;
    private ItemType itemType;

    public TreasureChestItemIterator(TreasureChest treasureChest, ItemType itemType) {
        this.treasureChest = treasureChest;
        this.itemType = itemType;
        this.idx = -1;
    }

    @Override
    public boolean hasNext() {
        return findNextIdx() != -1;
    }

    @Override
    public Item next() {
        idx = findNextIdx();
        if (idx != -1) {
            return treasureChest.getItems().get(idx);
        }
        return null;
    }

    private int findNextIdx(){
        List<Item> items = treasureChest.getItems();
        boolean found = false;
        int tempIdx = idx;
        while (!found) {
            tempIdx++;
            if (tempIdx >= items.size()) {
                tempIdx = -1;
                break;
            }
            if (itemType.equals(ItemType.ANY) || items.get(tempIdx).getType().equals(itemType)) {
                break;
            }
        }
        return tempIdx;
    }
}
