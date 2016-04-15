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

import com.google.common.base.Strings;

public final class JobServer implements Serializable {
    
    private static final long serialVersionUID = 4241736510750597679L;
    
    private String jobName;
    
    private String ip;
    
    private String hostName;
    
    private ServerStatus status;
    
    private int processSuccessCount;
    
    private int processFailureCount;
    
    private String sharding;
    
    private boolean leader;
    
    private boolean leaderStopped;
    
    public enum ServerStatus {
        READY, 
        RUNNING, 
        DISABLED, 
        STOPED, 
        CRASHED, 
        SHUTDOWN;
        
        public static ServerStatus getServerStatus(final String status, final boolean disabled, final boolean stopped, final boolean shutdown) {
            if (shutdown) {
                return ServerStatus.SHUTDOWN;
            }
            if (Strings.isNullOrEmpty(status)) {
                return ServerStatus.CRASHED;
            }
            if (disabled) {
                return ServerStatus.DISABLED;
            }
            if (stopped) {
                return ServerStatus.STOPED;
            }
            return ServerStatus.valueOf(status);
        }
    }

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getHostName() {
		return hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	public ServerStatus getStatus() {
		return status;
	}

	public void setStatus(ServerStatus status) {
		this.status = status;
	}

	public int getProcessSuccessCount() {
		return processSuccessCount;
	}

	public void setProcessSuccessCount(int processSuccessCount) {
		this.processSuccessCount = processSuccessCount;
	}

	public int getProcessFailureCount() {
		return processFailureCount;
	}

	public void setProcessFailureCount(int processFailureCount) {
		this.processFailureCount = processFailureCount;
	}

	public String getSharding() {
		return sharding;
	}

	public void setSharding(String sharding) {
		this.sharding = sharding;
	}

	public boolean isLeader() {
		return leader;
	}

	public void setLeader(boolean leader) {
		this.leader = leader;
	}

	public boolean isLeaderStopped() {
		return leaderStopped;
	}

	public void setLeaderStopped(boolean leaderStopped) {
		this.leaderStopped = leaderStopped;
	}
    
    
}
