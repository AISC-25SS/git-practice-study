package protoType.item;

import java.util.List;

// ItemUI랑 ItemService가 같은 패키지라 public 아니여도 될 듯
public interface ItemService {
    // 아이템을 등록한다.
    Item registerItem(String name, int price);
    // 아이템 목록 출력
    void listItems();
    // 아이템 전체 조회
    List<Item> getAllItems();
    // 특정 아이템 검색
    Item getItem(Long id);
    // 아이템 정보 수정
    boolean updateItem(Long id, String name, int price);
    // 아이템 삭제
    boolean deleteItem(Long id);
}
