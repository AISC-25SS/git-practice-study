package kangdowon;

public class DowonPractice {

    public static void main(String[] args){
        System.out.println("Hell0 Git!");
        greet();
    }

    public static void greet(){
        System.out.println(" git 연습 페이지에 오신것을 환영합니다. ");
    }

}
// 


// // Item.java
// public class Item {
//     private Long id;         // 상품 ID
//     private String name;     // 상품명
//     private int price;       // 가격 (원)

//     // 생성자
//     public Item(Long id, String name, int price) {
//         this.id = id;
//         this.name = name;
//         this.price = price;
//     }

//     // Getter / Setter
//     public Long getId() { return id; }
//     public String getName() { return name; }
//     public int getPrice() { return price; }

//     public void setName(String name) { this.name = name; }
//     public void setPrice(int price) { this.price = price; }

//     // toString (for console output)
//     @Override
//     public String toString() {
//         return "상품 ID: " + id + ", 이름: " + name + ", 가격: " + price + "원";
//     }
// }
// public class ItemRepository {
//     private static Map<Long, Item> store = new HashMap<>();
//     private static long sequence = 0L;

//     // 상품 저장
//     public Item save(Item item) {
//         item.setId(++sequence);
//         store.put(item.getId(), item);
//         return item;
//     }

//     // 전체 상품 조회
//     public List<Item> findAll() {
//         return new ArrayList<>(store.values());
//     }

//     // ID로 상품 조회
//     public Item findById(Long id) {
//         return store.get(id);
//     }

//     // 상품 수정
//     public void update(Long id, String newName, int newPrice) {
//         Item item = store.get(id);
//         if (item != null) {
//             item.setName(newName);
//             item.setPrice(newPrice);
//         }
//     }

//     // 상품 삭제
//     public void delete(Long id) {
//         store.remove(id);
//     }
// }
