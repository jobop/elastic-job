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

package com.dangdang.ddframe.job.api.listener.fixture;

import com.dangdang.ddframe.job.api.JobExecutionMultipleShardingContext;
import com.dangdang.ddframe.job.api.listener.ElasticJobListener;
import lombok.RequiredArgsConstructor;

public final class TestElasticJobListener implements ElasticJobListener {
    
    public TestElasticJobListener(ElasticJobListenerCaller caller) {
		super();
		this.caller = caller;
	}

	private final ElasticJobListenerCaller caller;
    
    @Override
    public void beforeJobExecuted(final JobExecutionMultipleShardingContext shardingContext) {
        caller.before();
    }
    
    @Override
    public void afterJobExecuted(final JobExecutionMultipleShardingContext shardingContext) {
        caller.after();
    }
}
