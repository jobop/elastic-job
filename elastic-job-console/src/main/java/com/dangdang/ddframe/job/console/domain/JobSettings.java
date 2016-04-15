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

package com.dangdang.ddframe.job.console.domain;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

public final class JobSettings implements Serializable {
    
    private static final long serialVersionUID = -6532210090618686688L;
    
    private String jobName;
    
    private String jobClass;
    
    private int shardingTotalCount;
    
    private String cron;
    
    private String shardingItemParameters;
    
    private String jobParameter;
    
    private boolean monitorExecution;
    
    private int processCountIntervalSeconds;
    
    private int concurrentDataProcessThreadCount;
    
    private int fetchDataCount;
    
    private int maxTimeDiffSeconds;
    
    private int monitorPort = -1;
    
    private boolean failover;
    
    private boolean misfire;
    
    private String jobShardingStrategyClass;
    
    private String description;

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public String getJobClass() {
		return jobClass;
	}

	public void setJobClass(String jobClass) {
		this.jobClass = jobClass;
	}

	public int getShardingTotalCount() {
		return shardingTotalCount;
	}

	public void setShardingTotalCount(int shardingTotalCount) {
		this.shardingTotalCount = shardingTotalCount;
	}

	public String getCron() {
		return cron;
	}

	public void setCron(String cron) {
		this.cron = cron;
	}

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

	public int getMonitorPort() {
		return monitorPort;
	}

	public void setMonitorPort(int monitorPort) {
		this.monitorPort = monitorPort;
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
    
    
}
