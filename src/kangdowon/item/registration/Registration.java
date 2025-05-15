package kangdowon.item.registration;
import kangdowon.item.repository.ItemRepository;
import kangdowon.item.model.Item;


public class Registration {
    private ItemRepository repo;

    public Registration(ItemRepository repo) {
        this.repo = repo;
    }

    public void register(String name, int price) {
        Item item = repo.save(name, price);
        System.out.println("📦 상품 등록 완료! ID: " + item);
    }
}