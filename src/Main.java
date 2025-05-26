import protoType.config.AppConfig;
import protoType.item.UI;

public class Main {
    public static void main(String[] args) {
        AppConfig config = new AppConfig();
        //MemberUI memberUI = new MemberUI(config.memberService());
        UI itemUI = new UI(config.itemService());
        //OrderUI orderUI = new OrderUI(config.orderService());

        //memberUI.start(); // 회원 등록, 조회
        itemUI.run();   // 상품 등록, 목록
        //orderUI.start();  // 주문 진행
    }
}
