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
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

public final class ExecutionInfo implements Serializable, Comparable<ExecutionInfo> {
    
    private static final long serialVersionUID = 8587397581949456718L;
    
    private int item;
    
    private ExecutionStatus status;
    
    private String failoverIp;
    
    private Date lastBeginTime;
    
    private Date nextFireTime;
    
    private Date lastCompleteTime;
    
    @Override
    public int compareTo(final ExecutionInfo o) {
        return getItem() - o.getItem();
    }
    
    public enum ExecutionStatus {
        RUNNING, 
        COMPLETED, 
        PENDING;
        
        public static ExecutionStatus getExecutionStatus(final boolean running, final boolean completed) {
            if (running) {
                return ExecutionStatus.RUNNING;
            }
            if (completed) {
                return ExecutionStatus.COMPLETED;
            }
            return ExecutionStatus.PENDING;
        }
    }

	public int getItem() {
		return item;
	}

	public void setItem(int item) {
		this.item = item;
	}

	public ExecutionStatus getStatus() {
		return status;
	}

	public void setStatus(ExecutionStatus status) {
		this.status = status;
	}

	public String getFailoverIp() {
		return failoverIp;
	}

	public void setFailoverIp(String failoverIp) {
		this.failoverIp = failoverIp;
	}

	public Date getLastBeginTime() {
		return lastBeginTime;
	}

	public void setLastBeginTime(Date lastBeginTime) {
		this.lastBeginTime = lastBeginTime;
	}

	public Date getNextFireTime() {
		return nextFireTime;
	}

	public void setNextFireTime(Date nextFireTime) {
		this.nextFireTime = nextFireTime;
	}

	public Date getLastCompleteTime() {
		return lastCompleteTime;
	}

	public void setLastCompleteTime(Date lastCompleteTime) {
		this.lastCompleteTime = lastCompleteTime;
	}
    
    
}
