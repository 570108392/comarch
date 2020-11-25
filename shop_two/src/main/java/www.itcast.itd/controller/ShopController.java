package www.itcast.itd.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import www.itcast.itd.api.OrderService;
import www.itcast.itd.api.ShopService;
import www.itcast.itd.domain.OrderMsg;
import www.itcast.itd.domain.Shop;

/**
 * @createUser: 张鹏
 * @createTime: 2020/11/24
 * @descripton:
 **/
@RestController
@RequestMapping("shop")
@RefreshScope
public class ShopController {


    @Reference
    private ShopService shopService;
    @GetMapping("index")
    public Shop index(){
        return shopService.getOne();
    }
}
