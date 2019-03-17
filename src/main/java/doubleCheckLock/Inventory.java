package doubleCheckLock;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by zhengwenzhan on 2019-03-17
 */
public class Inventory {
    private final int inventorySize;
    private List<Item> itemList;
    private Lock lock;

    public Inventory(int inventorySize) {
        this.inventorySize = inventorySize;
        itemList = new ArrayList<>(inventorySize);
        lock = new ReentrantLock();
    }

    public boolean doubleCheckAddItem(Item item) {
        if (itemList.size() < inventorySize) {
            lock.lock();
            try {
                if (itemList.size() < inventorySize) {
                    itemList.add(item);
                    System.out.println(Thread.currentThread() + " item size = " + itemList.size() + ", inventorySize=" + inventorySize);
                    return true;
                }
            } finally {
                lock.unlock();
            }
        }
        return false;
    }

    public boolean addItem(Item item) {
        try {
            lock.lock();
            if (itemList.size() < inventorySize) {
                itemList.add(item);
                System.out.println(Thread.currentThread() + " item size = " + itemList.size() + ", inventorySize=" + inventorySize);
                return true;
            }
        } finally {
            lock.unlock();
        }
        return false;
    }

    public List<Item> getItemList() {
        return itemList;
    }

}
