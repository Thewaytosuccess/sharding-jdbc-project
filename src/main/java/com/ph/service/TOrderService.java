package com.ph.service;

import com.ph.infrustructure.mapper.TOrderMapper;
import com.ph.infrustructure.po.TOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lenovo
 */
@Service
public class TOrderService {
    
    @Autowired
    private TOrderMapper orderMapper;
    
    public boolean insert(TOrder order){
        return orderMapper.insert(order) > 0;
    }
}
