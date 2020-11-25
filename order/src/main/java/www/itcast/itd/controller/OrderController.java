package www.itcast.itd.controller;

import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import www.itcast.itd.api.OrderService;
import www.itcast.itd.domain.OrderMsg;

/**
 * @createUser: 张鹏
 * @createTime: 2020/11/24
 * @descripton:
 **/
@RestController
@RequestMapping("order")
@RefreshScope
@Slf4j
public class OrderController {


    @Reference
    private OrderService orderService;
    @GetMapping("index")
    public OrderMsg index(){
        log.info("系统访问order模块");
        return orderService.getOne();
    }
}
