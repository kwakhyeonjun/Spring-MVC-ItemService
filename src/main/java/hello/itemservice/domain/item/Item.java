package hello.itemservice.domain.item;

import lombok.Getter;
import lombok.Setter;

// @Data // 위험성이 높아 사용하지 않는 것이 좋음. 데이터를 전달하는 DTO의 경우에만 사용하는 것을 권장
@Getter @Setter
public class Item {

    private Long id;
    private String itemName;
    private Integer price;
    private Integer quantity;

    public Item() {}

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
