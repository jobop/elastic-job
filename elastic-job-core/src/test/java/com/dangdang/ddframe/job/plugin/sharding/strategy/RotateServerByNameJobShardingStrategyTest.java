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

package com.dangdang.ddframe.job.plugin.sharding.strategy;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.dangdang.ddframe.job.internal.sharding.strategy.JobShardingStrategyOption;

public final class RotateServerByNameJobShardingStrategyTest {
    
    private RotateServerByNameJobShardingStrategy rotateServerByNameJobShardingStrategy = new RotateServerByNameJobShardingStrategy();
    
    @Test
    public void assertSharding1() {
        Map<String, List<Integer>> expected = new LinkedHashMap<String, List<Integer>>(3);
        expected.put("host0", Collections.<Integer>emptyList());
        expected.put("host1", Collections.singletonList(0));
        expected.put("host2", Collections.singletonList(1));
        assertThat(
                rotateServerByNameJobShardingStrategy.sharding(Arrays.asList("host0", "host1", "host2"), new JobShardingStrategyOption("1", 2, Collections.<Integer, String>emptyMap())), is(expected));
    }
    
    @Test
    public void assertSharding2() {
        Map<String, List<Integer>> expected = new LinkedHashMap<String, List<Integer>>(3);
        expected.put("host0", Collections.singletonList(1));
        expected.put("host1", Collections.<Integer>emptyList());
        expected.put("host2", Collections.singletonList(0));
        assertThat(
                rotateServerByNameJobShardingStrategy.sharding(Arrays.asList("host0", "host1", "host2"), new JobShardingStrategyOption("2", 2, Collections.<Integer, String>emptyMap())), is(expected));
    }
    
    @Test
    public void assertSharding3() {
        Map<String, List<Integer>> expected = new LinkedHashMap<String, List<Integer>>(3);
        expected.put("host0", Collections.singletonList(0));
        expected.put("host1", Collections.singletonList(1));
        expected.put("host2", Collections.<Integer>emptyList());
        assertThat(
                rotateServerByNameJobShardingStrategy.sharding(Arrays.asList("host0", "host1", "host2"), new JobShardingStrategyOption("3", 2, Collections.<Integer, String>emptyMap())), is(expected));
    }
}
