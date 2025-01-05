package dragonhope.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import dragonhope.domain.Orders;
import dragonhope.service.OrdersService;
import dragonhope.mapper.OrdersMapper;
import org.springframework.stereotype.Service;

/**
* @author dragonhope
* @description 针对表【Orders】的数据库操作Service实现
* @createDate 2025-01-05 15:00:59
*/
@Service
public class OrdersServiceImpl extends ServiceImpl<OrdersMapper, Orders>
    implements OrdersService{

}




