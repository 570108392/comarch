package www.itcast.itd.impl;

import org.apache.dubbo.config.annotation.Service;
import www.itcast.itd.api.OrderService;
import www.itcast.itd.domain.OrderMsg;

@Service
public class OrderServiceImpl implements OrderService {
    @Override
    public OrderMsg getOne() {
        return OrderMsg.builder().id("222").orderName("bbb").build();
    }
}
