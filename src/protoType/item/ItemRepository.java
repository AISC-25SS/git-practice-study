package protoType.item;

import java.util.List;

public interface ItemRepository {
    // 상품 생성(저장)
    public Item save(Item item);
    // 상품 전체 검색(순회)
    public List<Item> findAll();
    // 특정 상품 검색(탐색)
    public Item findById(Long id);
    // 상품 수정
    public void update(Long id, String name, int price);
    // 상품 제거(삭제)
    public void delete(Long id);
}
