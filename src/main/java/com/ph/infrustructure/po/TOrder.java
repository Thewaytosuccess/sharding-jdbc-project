package com.ph.infrustructure.po;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * @author lenovo
 */
@TableName("t_order")
@Data
public class TOrder{

    @TableId
    private Long id;

    private String orderNo;

    private String sourceType;

    @TableLogic
    private boolean deleted;

    private Date gmtCreated;

    private Date gmtModified;

}
