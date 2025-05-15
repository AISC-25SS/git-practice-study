package kangdowon.item.revise;

import kangdowon.item.repository.ItemRepository;
import kangdowon.item.model.Item;

public class ReviseService {
    private ItemRepository repo;

    public ReviseService(ItemRepository repo) {
        this.repo = repo;
    }

    public void reviseItem(int id, String newName, int newPrice) {
        Item item = repo.findById(id);
        if (item != null) {
            item.setName(newName);
            item.setPrice(newPrice);
            System.out.println("✏️ 수정 완료: " + item);
        } else {
            System.out.println("❌ 해당 ID를 가진 아이템이 없습니다.");
        }
    }
}