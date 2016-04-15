/*
 * Copyright 1999-2015 dangdang.com.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </p>
 */

package com.dangdang.ddframe.job.api;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

/**
 * 作业配置信息.
 * 
 * @author zhangliang
 */
public class JobConfiguration {
	public JobConfiguration(String jobName, Class<? extends ElasticJob> jobClass, int shardingTotalCount, String cron){
		this.jobName = jobName;
		this.jobClass = jobClass;
		this.shardingTotalCount = shardingTotalCount;
		this.cron = cron;
	}
    public JobConfiguration(String jobName, Class<? extends ElasticJob> jobClass, int shardingTotalCount, String cron, String shardingItemParameters, String jobParameter, boolean monitorExecution,
			int processCountIntervalSeconds, int concurrentDataProcessThreadCount, int fetchDataCount, int maxTimeDiffSeconds, boolean failover, boolean misfire, int monitorPort,
			String jobShardingStrategyClass, String description, boolean disabled, boolean overwrite) {
		super();
		this.jobName = jobName;
		this.jobClass = jobClass;
		this.shardingTotalCount = shardingTotalCount;
		this.cron = cron;
		this.shardingItemParameters = shardingItemParameters;
		this.jobParameter = jobParameter;
		this.monitorExecution = monitorExecution;
		this.processCountIntervalSeconds = processCountIntervalSeconds;
		this.concurrentDataProcessThreadCount = concurrentDataProcessThreadCount;
		this.fetchDataCount = fetchDataCount;
		this.maxTimeDiffSeconds = maxTimeDiffSeconds;
		this.failover = failover;
		this.misfire = misfire;
		this.monitorPort = monitorPort;
		this.jobShardingStrategyClass = jobShardingStrategyClass;
		this.description = description;
		this.disabled = disabled;
		this.overwrite = overwrite;
	}

	/**
     * 作业名称.
     */
    private final String jobName;
    
    /**
     * 作业实现类名称.
     */
    private final Class<? extends ElasticJob> jobClass;
    
    /**
     * 作业分片总数.
     */
    private final int shardingTotalCount;
    
    /**
     * 作业启动时间的cron表达式.
     */
    private final String cron;
    
    /**
     * 分片序列号和个性化参数对照表.
     * 
     * <p>
     * 分片序列号和参数用等号分隔, 多个键值对用逗号分隔. 类似map.
     * 分片序列号从0开始, 不可大于或等于作业分片总数.
     * 如:
     * 0=a,1=b,2=c
     * </p>
     */
    private String shardingItemParameters = "";
    
    /**
     * 作业自定义参数.
     * 
     * <p>
     * 可以配置多个相同的作业, 但是用不同的参数作为不同的调度实例.
     * </p>
     */
    private String jobParameter = "";
    
    /**
     * 监控作业执行时状态.
     * 
     * <p>
     * 每次作业执行时间和间隔时间均非常短的情况, 建议不监控作业运行时状态以提升效率, 因为是瞬时状态, 所以无必要监控. 请用户自行增加数据堆积监控. 并且不能保证数据重复选取, 应在作业中实现幂等性. 也无法实现作业失效转移.
     * 每次作业执行时间和间隔时间均较长短的情况, 建议监控作业运行时状态, 可保证数据不会重复选取.
     * </p>
     */
    private boolean monitorExecution = true;
    
    /**
     * 统计作业处理数据数量的间隔时间.
     * 
     * <p>
     * 单位: 秒.
     * 只对处理数据流类型作业起作用.
     * </p>
     */
    private int processCountIntervalSeconds = 300;
    
    /**
     * 处理数据的并发线程数.
     * 
     * <p>
     * 只对高吞吐量处理数据流类型作业起作用.
     * </p>
     */
    private int concurrentDataProcessThreadCount = 1;
    
    /**
     * 每次抓取的数据量.
     * 
     * <p>
     * 可在不重启作业的情况下灵活配置抓取数据量.
     * </p>
     */
    private int fetchDataCount = 1;
    
    /**
     * 最大容忍的本机与注册中心的时间误差秒数.
     * 
     * <p>
     * 如果时间误差超过配置秒数则作业启动时将抛异常.
     * 配置为-1表示不检查时间误差.
     * </p>
     */
    private int maxTimeDiffSeconds = -1;
    
    /**
     * 是否开启失效转移.
     * 
     * <p>
     * 只有对monitorExecution的情况下才可以开启失效转移.
     * </p> 
     */
    private boolean failover;
    
    /**
     * 是否开启misfire.
     */
    private boolean misfire = true;
    
    /**
     * 作业辅助监控端口.
     */
    private int monitorPort = -1;
    
    /**
     * 作业分片策略实现类全路径.
     * 
     * <p>
     * 默认使用{@code com.dangdang.ddframe.job.plugin.sharding.strategy.AverageAllocationJobShardingStrategy}.
     * </p>
     */
    private String jobShardingStrategyClass = "";
    
    /**
     * 作业描述信息.
     */
    private String description = "";
    
    /**
     * 作业是否禁止启动.
     * 可用于部署作业时, 先禁止启动, 部署结束后统一启动.
     */
    private boolean disabled;
    
    /**
     * 本地配置是否可覆盖注册中心配置.
     * 如果可覆盖, 每次启动作业都以本地配置为准.
     */
    private boolean overwrite;

	public String getShardingItemParameters() {
		return shardingItemParameters;
	}

	public void setShardingItemParameters(String shardingItemParameters) {
		this.shardingItemParameters = shardingItemParameters;
	}

	public String getJobParameter() {
		return jobParameter;
	}

	public void setJobParameter(String jobParameter) {
		this.jobParameter = jobParameter;
	}

	public boolean isMonitorExecution() {
		return monitorExecution;
	}

	public void setMonitorExecution(boolean monitorExecution) {
		this.monitorExecution = monitorExecution;
	}

	public int getProcessCountIntervalSeconds() {
		return processCountIntervalSeconds;
	}

	public void setProcessCountIntervalSeconds(int processCountIntervalSeconds) {
		this.processCountIntervalSeconds = processCountIntervalSeconds;
	}

	public int getConcurrentDataProcessThreadCount() {
		return concurrentDataProcessThreadCount;
	}

	public void setConcurrentDataProcessThreadCount(int concurrentDataProcessThreadCount) {
		this.concurrentDataProcessThreadCount = concurrentDataProcessThreadCount;
	}

	public int getFetchDataCount() {
		return fetchDataCount;
	}

	public void setFetchDataCount(int fetchDataCount) {
		this.fetchDataCount = fetchDataCount;
	}

	public int getMaxTimeDiffSeconds() {
		return maxTimeDiffSeconds;
	}

	public void setMaxTimeDiffSeconds(int maxTimeDiffSeconds) {
		this.maxTimeDiffSeconds = maxTimeDiffSeconds;
	}

	public boolean isFailover() {
		return failover;
	}

	public void setFailover(boolean failover) {
		this.failover = failover;
	}

	public boolean isMisfire() {
		return misfire;
	}

	public void setMisfire(boolean misfire) {
		this.misfire = misfire;
	}

	public int getMonitorPort() {
		return monitorPort;
	}

	public void setMonitorPort(int monitorPort) {
		this.monitorPort = monitorPort;
	}

	public String getJobShardingStrategyClass() {
		return jobShardingStrategyClass;
	}

	public void setJobShardingStrategyClass(String jobShardingStrategyClass) {
		this.jobShardingStrategyClass = jobShardingStrategyClass;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isDisabled() {
		return disabled;
	}

	public void setDisabled(boolean disabled) {
		this.disabled = disabled;
	}

	public boolean isOverwrite() {
		return overwrite;
	}

	public void setOverwrite(boolean overwrite) {
		this.overwrite = overwrite;
	}

	public String getJobName() {
		return jobName;
	}

	public Class<? extends ElasticJob> getJobClass() {
		return jobClass;
	}

	public int getShardingTotalCount() {
		return shardingTotalCount;
	}

	public String getCron() {
		return cron;
	}
    
    
}
