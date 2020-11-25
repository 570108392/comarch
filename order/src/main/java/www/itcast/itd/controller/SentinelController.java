package www.itcast.itd.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @createUser: 张鹏
 * @createTime: 2020/11/24
 * @descripton:
 **/
@RestController
@RequestMapping("test")
@RefreshScope
@Slf4j
public class SentinelController {


    @GetMapping("test5")
    @SentinelResource(value = "test5",blockHandler = "deal_test5")
    public String test5(@RequestParam(value = "p1",required = false) String p1){
        log.info("系统访问order模块");
        return "test5";
    }
    public String deal_test5(String p1, BlockException blockException){
        return "deal_test5";
    }

}
