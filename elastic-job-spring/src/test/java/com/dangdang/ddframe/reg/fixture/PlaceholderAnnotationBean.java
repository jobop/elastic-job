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

package com.dangdang.ddframe.reg.fixture;

import lombok.Getter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PlaceholderAnnotationBean {
    
    @Value("${/test/deep/nested}")
    private String regValue1;
    
    @Value("${/new}")
    private String regValue2;
    
    @Value("${withNamespace_1}")
    private String withNamespaceValue1;
    
    @Value("${withNamespace_2}")
    private String withNamespaceValue2;
    
    @Value("${withoutNamespace_1}")
    private String withoutNamespaceValue1;
    
    @Value("${withoutNamespace_2}")
    private String withoutNamespaceValue2;

	public String getRegValue1() {
		return regValue1;
	}

	public void setRegValue1(String regValue1) {
		this.regValue1 = regValue1;
	}

	public String getRegValue2() {
		return regValue2;
	}

	public void setRegValue2(String regValue2) {
		this.regValue2 = regValue2;
	}

	public String getWithNamespaceValue1() {
		return withNamespaceValue1;
	}

	public void setWithNamespaceValue1(String withNamespaceValue1) {
		this.withNamespaceValue1 = withNamespaceValue1;
	}

	public String getWithNamespaceValue2() {
		return withNamespaceValue2;
	}

	public void setWithNamespaceValue2(String withNamespaceValue2) {
		this.withNamespaceValue2 = withNamespaceValue2;
	}

	public String getWithoutNamespaceValue1() {
		return withoutNamespaceValue1;
	}

	public void setWithoutNamespaceValue1(String withoutNamespaceValue1) {
		this.withoutNamespaceValue1 = withoutNamespaceValue1;
	}

	public String getWithoutNamespaceValue2() {
		return withoutNamespaceValue2;
	}

	public void setWithoutNamespaceValue2(String withoutNamespaceValue2) {
		this.withoutNamespaceValue2 = withoutNamespaceValue2;
	}
    
    
}
