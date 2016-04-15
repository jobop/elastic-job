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

package com.dangdang.ddframe.job.plugin.job.type.dataflow;

import com.dangdang.ddframe.job.api.JobExecutionMultipleShardingContext;
import com.dangdang.ddframe.job.internal.job.dataflow.AbstractDataFlowElasticJob;
import com.dangdang.ddframe.job.internal.schedule.JobFacade;
import com.dangdang.ddframe.job.internal.statistics.ProcessCountStatistics;
import com.dangdang.ddframe.job.plugin.job.type.ElasticJobAssert;
import com.dangdang.ddframe.job.plugin.job.type.fixture.JobCaller;
import lombok.AccessLevel;
import lombok.Getter;
import org.junit.After;
import org.junit.Before;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.when;

public abstract class AbstractDataFlowElasticJobTest {
    
    @Mock
    private JobCaller jobCaller;
    
    @Mock
    private JobFacade jobFacade;
    
    private JobExecutionMultipleShardingContext shardingContext;
    
    private AbstractDataFlowElasticJob dataFlowElasticJob;
    
    @Before
    public void setUp() throws NoSuchFieldException {
        MockitoAnnotations.initMocks(this);
        when(jobFacade.getJobName()).thenReturn(ElasticJobAssert.JOB_NAME);
        dataFlowElasticJob = createDataFlowElasticJob(jobCaller);
        dataFlowElasticJob.setJobFacade(jobFacade);
        shardingContext = ElasticJobAssert.getShardingContext();
        ElasticJobAssert.prepareForIsNotMisfire(jobFacade, shardingContext);
    }
    
    @After
    public void tearDown() throws NoSuchFieldException {
        ProcessCountStatistics.reset(ElasticJobAssert.JOB_NAME);
    }
    
    protected abstract AbstractDataFlowElasticJob createDataFlowElasticJob(final JobCaller jobCaller);

	public JobCaller getJobCaller() {
		return jobCaller;
	}

	public void setJobCaller(JobCaller jobCaller) {
		this.jobCaller = jobCaller;
	}

	public JobFacade getJobFacade() {
		return jobFacade;
	}

	public void setJobFacade(JobFacade jobFacade) {
		this.jobFacade = jobFacade;
	}

	public JobExecutionMultipleShardingContext getShardingContext() {
		return shardingContext;
	}

	public void setShardingContext(JobExecutionMultipleShardingContext shardingContext) {
		this.shardingContext = shardingContext;
	}

	public AbstractDataFlowElasticJob getDataFlowElasticJob() {
		return dataFlowElasticJob;
	}

	public void setDataFlowElasticJob(AbstractDataFlowElasticJob dataFlowElasticJob) {
		this.dataFlowElasticJob = dataFlowElasticJob;
	}
    
    
}
