package nohsungbeen.item;


public class Item {
    private Long id;         // 상품 ID
    private String name;     // 상품명
    private int price;       // 가격 (원)

    public Item(Long id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("ID: %d, 이름: %s, 가격: %d원", id, name, price);
    }
}
