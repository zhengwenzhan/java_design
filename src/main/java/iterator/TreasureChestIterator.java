package iterator;

import java.util.List;

/**
 * Created by zhengwenzhan on 2019-03-10
 */
public class TreasureChestIterator implements ItemIterator {

    private TreasureChest treasureChest;
    private ItemType itemType;
    private int itemIndex;

    public TreasureChestIterator(TreasureChest treasureChest, ItemType itemType) {
        this.treasureChest = treasureChest;
        this.itemType = itemType;
        this.itemIndex = -1;
    }

    @Override
    public boolean hasNext() {
        return findIndex() != -1;
    }

    @Override
    public Item next() {
        itemIndex = findIndex();

        if (itemIndex != -1) {

            return treasureChest.getItems().get(itemIndex);
        }
        return null;
    }

    private int findIndex() {
        List<Item> itemList = treasureChest.getItems();
        int tempIndex = itemIndex;

        while (true) {
            tempIndex++;
            if (tempIndex >= itemList.size()) {
                tempIndex = -1;
                break;
            }

            if (itemType.equals(ItemType.ANY) || itemList.get(tempIndex).getItemType().equals(itemType)) {
                break;
            }
        }

        return tempIndex;
    }
}
