package kangdowon.item.repository;

import kangdowon.item.model.Item;

import java.util.*;

public class ItemRepository {
    private Map<Integer, Item> items = new HashMap<>();
    private int nextId = 1;

    public Item save(String name, int price) {
        Item item = new Item(nextId++, name, price);
        items.put(item.getId(), item);
        return item;
    }

    public Collection<Item> findAll() {
        return items.values();
    }

    public Item findById(int id) {
        return items.get(id);
    }
}
