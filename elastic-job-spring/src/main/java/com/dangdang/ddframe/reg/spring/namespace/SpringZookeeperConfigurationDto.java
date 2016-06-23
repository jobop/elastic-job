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

package com.dangdang.ddframe.reg.spring.namespace;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

final class SpringZookeeperConfigurationDto {
	public SpringZookeeperConfigurationDto(String serverLists, String namespace, String baseSleepTimeMilliseconds, String maxSleepTimeMilliseconds, String maxRetries) {
		super();
		this.serverLists = serverLists;
		this.namespace = namespace;
		this.baseSleepTimeMilliseconds = baseSleepTimeMilliseconds;
		this.maxSleepTimeMilliseconds = maxSleepTimeMilliseconds;
		this.maxRetries = maxRetries;
	}

	public SpringZookeeperConfigurationDto(String serverLists, String namespace, String baseSleepTimeMilliseconds, String maxSleepTimeMilliseconds, String maxRetries,
			String sessionTimeoutMilliseconds, String connectionTimeoutMilliseconds, String digest, String nestedPort, String nestedDataDir, String localPropertiesPath, String overwrite) {
		super();
		this.serverLists = serverLists;
		this.namespace = namespace;
		this.baseSleepTimeMilliseconds = baseSleepTimeMilliseconds;
		this.maxSleepTimeMilliseconds = maxSleepTimeMilliseconds;
		this.maxRetries = maxRetries;
		this.sessionTimeoutMilliseconds = sessionTimeoutMilliseconds;
		this.connectionTimeoutMilliseconds = connectionTimeoutMilliseconds;
		this.digest = digest;
		this.nestedPort = nestedPort;
		this.nestedDataDir = nestedDataDir;
		this.localPropertiesPath = localPropertiesPath;
		this.overwrite = overwrite;
	}

	private final String serverLists;

	private final String namespace;

	private final String baseSleepTimeMilliseconds;

	private final String maxSleepTimeMilliseconds;

	private final String maxRetries;

	private String sessionTimeoutMilliseconds;

	private String connectionTimeoutMilliseconds;

	private String digest;

	private String nestedPort;

	private String nestedDataDir;

	private String localPropertiesPath;

	private String overwrite;

	public String getSessionTimeoutMilliseconds() {
		return sessionTimeoutMilliseconds;
	}

	public void setSessionTimeoutMilliseconds(String sessionTimeoutMilliseconds) {
		this.sessionTimeoutMilliseconds = sessionTimeoutMilliseconds;
	}

	public String getConnectionTimeoutMilliseconds() {
		return connectionTimeoutMilliseconds;
	}

	public void setConnectionTimeoutMilliseconds(String connectionTimeoutMilliseconds) {
		this.connectionTimeoutMilliseconds = connectionTimeoutMilliseconds;
	}

	public String getDigest() {
		return digest;
	}

	public void setDigest(String digest) {
		this.digest = digest;
	}

	public String getNestedPort() {
		return nestedPort;
	}

	public void setNestedPort(String nestedPort) {
		this.nestedPort = nestedPort;
	}

	public String getNestedDataDir() {
		return nestedDataDir;
	}

	public void setNestedDataDir(String nestedDataDir) {
		this.nestedDataDir = nestedDataDir;
	}

	public String getLocalPropertiesPath() {
		return localPropertiesPath;
	}

	public void setLocalPropertiesPath(String localPropertiesPath) {
		this.localPropertiesPath = localPropertiesPath;
	}

	public String getOverwrite() {
		return overwrite;
	}

	public void setOverwrite(String overwrite) {
		this.overwrite = overwrite;
	}

	public String getServerLists() {
		return serverLists;
	}

	public String getNamespace() {
		return namespace;
	}

	public String getBaseSleepTimeMilliseconds() {
		return baseSleepTimeMilliseconds;
	}

	public String getMaxSleepTimeMilliseconds() {
		return maxSleepTimeMilliseconds;
	}

	public String getMaxRetries() {
		return maxRetries;
	}

}
