package com.ph.policy;

import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

import java.util.Collection;

/**
 * @author lenovo
 */
public class DatabasePolicy implements PreciseShardingAlgorithm<String> {

    @Override
    public String doSharding(Collection<String> dbs, PreciseShardingValue<String> preciseShardingValue) {
        return "app".equals(preciseShardingValue.getValue()) ? "ds0" : "ds1";
    }
}
