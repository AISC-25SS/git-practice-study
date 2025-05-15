package seungjun.item.service;

import seungjun.item.repository.ItemRepository;

public class ItemService {

    private final ItemRepository itemRepository;


    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }
}
