package www.itcast.itd.impl;

import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;
import www.itcast.itd.api.ShopService;
import www.itcast.itd.domain.Shop;
@Service(loadbalance = "roundrobin")
@Slf4j
public class ShopServiceImpl implements ShopService {
    @Override
    public Shop getOne() {
        log.info("运行shop系统dubbo");
        return Shop.builder().id("111").shopName("aaaaa").build();
    }
}
