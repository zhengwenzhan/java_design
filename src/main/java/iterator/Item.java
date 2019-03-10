package iterator;

import lombok.Data;

/**
 * Created by zhengwenzhan on 2019-03-10
 */
@Data
public class Item {
    private ItemType itemType;

    private String name;

    public Item(ItemType itemType, String name) {
        this.itemType = itemType;
        this.name = name;
    }
}
