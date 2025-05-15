package kangdowon.item.list;
import kangdowon.item.repository.ItemRepository;
import kangdowon.item.model.Item;

public class List {
    private ItemRepository repo;

    public List(ItemRepository repo) {
        this.repo = repo;
    }

    public void showAll() {
        System.out.println("\n📋 전체 목록:");
        for (Item item : repo.findAll()) {
            System.out.println(item);
        }
    }
}