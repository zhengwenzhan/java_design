package caching;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhengwenzhan on 2019-03-14
 */
public class LruCache {

    class Node {
        String userId;
        UserAccount userAccount;
        Node previous;
        Node next;

        public Node(String userId, UserAccount userAccount) {
            this.userId = userId;
            this.userAccount = userAccount;
        }
    }

    int capacity;
    Map<String, Node> cache = new HashMap<>();
    Node head;
    Node end;

    public LruCache(int capacity) {
        this.capacity = capacity;
    }

    /**
     * 访问一次，就将该节点移到头部，最近最久未使用
     *
     * @param userId
     * @return
     */
    public UserAccount get(String userId) {
        if (cache.containsKey(userId)) {
            Node node = cache.get(userId);
            //摘除节点
            remove(node);
            //移到头部
            setHead(node);
            return node.userAccount;
        }
        return null;
    }

    /**
     * 放入一个userAccount
     *
     * @param userId
     * @param userAccount
     */
    public void set(String userId, UserAccount userAccount) {

        //如果已存在，访问一次，并移到头部节点
        if (cache.containsKey(userId)) {
            Node old = cache.get(userId);
            old.userAccount = userAccount;
            remove(old);
            setHead(old);
        } else {
            Node node = new Node(userId, userAccount);

            //超过阈值，先将尾部节点删除，最近最久未使用，再放入节点
            if (cache.size() >= capacity) {
                System.out.println("cache is full! removeing " + end.userId + "from cache...");
                remove(end);
                setHead(node);
            } else {
                setHead(node);
            }
            cache.put(userId, node);
        }
    }

    /**
     * 删除一个节点
     *
     * @param node
     */
    public void remove(Node node) {
        //处理前置节点
        if (node.previous != null) {
            node.previous.next = node.next;
        } else {
            head = node.next;
        }

        //处理后置节点
        if (node.next != null) {
            node.next.previous = node.previous;
        } else {
            end = node.previous;
        }
    }


    /**
     * 双向链表中，插入头结点
     *
     * @param node
     */
    public void setHead(Node node) {
        node.next = head;
        node.previous = null;

        if (head != null) {
            head.previous = node;
        }

        head = node;

        if (end == null) {
            end = head;
        }
    }

    /**
     * 遍历链表
     *
     * @return
     */
    public List<UserAccount> getCacheDataInListForm() {
        Node temp = head;
        List<UserAccount> list = new ArrayList<>();

        while (temp != null) {
            list.add(temp.userAccount);
            temp = temp.next;
        }
        return list;
    }

    public void setCapacity(int newCapacity) {
        if (capacity > newCapacity) {
            clear();
        } else {
            this.capacity = newCapacity;
        }
    }
    /**
     * Invalidate cache for user
     */
    public void invalidate(String userId) {
        System.out.println("# " + userId + " has been updated! Removing older version from cache...");
        Node toBeRemoved = cache.get(userId);
        remove(toBeRemoved);
        cache.remove(userId);
    }

    public void clear() {
        head = null;
        end = null;
        cache.clear();
    }

    public UserAccount getLruData() {
        return end.userAccount;
    }

    public boolean isFull() {
        return cache.size() >= capacity;
    }

    public boolean contains(String userId) {
        return cache.containsKey(userId);
    }

}
