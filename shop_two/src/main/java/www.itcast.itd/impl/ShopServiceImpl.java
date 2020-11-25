package www.itcast.itd.impl;

import org.apache.dubbo.config.annotation.Service;
import www.itcast.itd.api.ShopService;
import www.itcast.itd.domain.Shop;

@Service
public class ShopServiceImpl implements ShopService {
    @Override
    public Shop getOne() {
        return Shop.builder().id("111").shopName("aaaaa").build();
    }
}
