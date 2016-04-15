package com.dangdang.ddframe.job.internal.sharding.strategy;

import java.util.Map;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * 作业分片策略选项.
 * 
 * @author zhangliang
 */
public final class JobShardingStrategyOption {
    
    public JobShardingStrategyOption(String jobName, int shardingTotalCount, Map<Integer, String> shardingItemParameters) {
		super();
		this.jobName = jobName;
		this.shardingTotalCount = shardingTotalCount;
		this.shardingItemParameters = shardingItemParameters;
	}

	public String getJobName() {
		return jobName;
	}

	public int getShardingTotalCount() {
		return shardingTotalCount;
	}

	public Map<Integer, String> getShardingItemParameters() {
		return shardingItemParameters;
	}

	/**
     * 作业名称.
     */
    private final String jobName;
    
    /**
     * 作业分片总数.
     */
    private final int shardingTotalCount;
    
    /**
     * 分片序列号和个性化参数对照表.
     */
    private final Map<Integer, String> shardingItemParameters;
}
