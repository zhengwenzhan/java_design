package caching;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 商品简单基础模型
 * <p>
 * Created by zhengwenzhan on 2019-03-27
 */
@Data
@AllArgsConstructor
public class Item {

    /**
     * 商品Id
     */
    private Long itemId;

    /**
     * 商品标题
     */
    private String title;
}
