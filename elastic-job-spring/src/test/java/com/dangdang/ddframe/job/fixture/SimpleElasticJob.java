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

package com.dangdang.ddframe.job.fixture;

import lombok.Getter;
import lombok.Setter;

import com.dangdang.ddframe.job.api.JobExecutionMultipleShardingContext;
import com.dangdang.ddframe.job.plugin.job.type.simple.AbstractSimpleElasticJob;

public final class SimpleElasticJob extends AbstractSimpleElasticJob {
    
    private static volatile boolean completed;
    
    private static String springValue;
    
    private static String jobValue;
    
    @Override
    public void process(final JobExecutionMultipleShardingContext context) {
        completed = true;
        jobValue = springValue;
    }
    
    public static void reset() {
        completed = false;
    }

	public static boolean isCompleted() {
		return completed;
	}

	public static void setCompleted(boolean completed) {
		SimpleElasticJob.completed = completed;
	}

	public static String getSpringValue() {
		return springValue;
	}

	public static void setSpringValue(String springValue) {
		SimpleElasticJob.springValue = springValue;
	}

	public static String getJobValue() {
		return jobValue;
	}

	public static void setJobValue(String jobValue) {
		SimpleElasticJob.jobValue = jobValue;
	}
    
    
}
