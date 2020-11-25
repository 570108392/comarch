package www.itcast.itd.impl;

import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;
import www.itcast.itd.api.OrderService;
import www.itcast.itd.domain.OrderMsg;

@Service(loadbalance = "roundrobin")
@Slf4j
public class OrderServiceImpl implements OrderService {
    @Override
    public OrderMsg getOne() {
        log.info("运行orderTwo系统dubbo");
        return OrderMsg.builder().id("222").orderName("bbb").build();
    }
}
