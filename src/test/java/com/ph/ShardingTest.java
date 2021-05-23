package com.ph;

import com.ph.infrustructure.po.TOrder;
import com.ph.service.TOrderService;
import org.apache.shardingsphere.core.strategy.keygen.SnowflakeShardingKeyGenerator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.JdkIdGenerator;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class ShardingTest {
    
    @Autowired
    private TOrderService tOrderService;
    
    @Test
    public void testInsert(){
        TOrder torder = new TOrder();
        torder.setOrderNo("136");
        torder.setSourceType("pc");
        torder.setDeleted(false);
        torder.setGmtModified(new Date());
        System.out.println(tOrderService.insert(torder));
    }
}
