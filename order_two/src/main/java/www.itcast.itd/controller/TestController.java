package www.itcast.itd.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @createUser: 张鹏
 * @createTime: 2020/11/24
 * @descripton:
 **/
@RestController
@RequestMapping("test")
@RefreshScope
public class TestController {


    @Value("${nacos.test}")
    private String aa;
    @GetMapping("index")
    public String index(){
        return aa;
    }
}
