package protoType.item;

import java.util.List;

public interface ItemService {
    public Item register(String name, int price);
    public List<Item> getAllItems();
    public Item getItem(Long id);
    public boolean updateItem(Long id, String name, int price);
    public boolean deleteItem(Long id);
}
