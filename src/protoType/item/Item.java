package protoType.item;

// Item.java
public class Item {
    private Long id;         // 상품 ID
    private String name;     // 상품명
    private int price;       // 가격 (원)

    public Item(Long id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public int getPrice() { return price; }

    @Override
    public String toString() {
        return "상품 ID: " + id + ", 상품명: " + name + ", 가격: " + price + "원";
    }
}

