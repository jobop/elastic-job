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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class RegistryCenterConfiguration implements Serializable {
    public RegistryCenterConfiguration(){}
    
    
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (activated ? 1231 : 1237);
		result = prime * result + ((digest == null) ? 0 : digest.hashCode());
		result = prime * result + ((namespace == null) ? 0 : namespace.hashCode());
		result = prime * result + ((zkAddressList == null) ? 0 : zkAddressList.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RegistryCenterConfiguration other = (RegistryCenterConfiguration) obj;
		if (activated != other.activated)
			return false;
		if (digest == null) {
			if (other.digest != null)
				return false;
		} else if (!digest.equals(other.digest))
			return false;
		if (namespace == null) {
			if (other.namespace != null)
				return false;
		} else if (!namespace.equals(other.namespace))
			return false;
		if (zkAddressList == null) {
			if (other.zkAddressList != null)
				return false;
		} else if (!zkAddressList.equals(other.zkAddressList))
			return false;
		return true;
	}


	private static final long serialVersionUID = -5996257770767863699L;
    
    @XmlAttribute(required = true)
    private String name;
    
    @XmlAttribute(required = true)
    private String zkAddressList;
    
    @XmlAttribute
    private String namespace;
    
    @XmlAttribute
    private String digest;
    
    @XmlAttribute
    private boolean activated;
    
    public RegistryCenterConfiguration(final String name) {
        this.name = name;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getZkAddressList() {
		return zkAddressList;
	}

	public void setZkAddressList(String zkAddressList) {
		this.zkAddressList = zkAddressList;
	}

	public String getNamespace() {
		return namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
	}

	public String getDigest() {
		return digest;
	}

	public void setDigest(String digest) {
		this.digest = digest;
	}

	public boolean isActivated() {
		return activated;
	}

	public void setActivated(boolean activated) {
		this.activated = activated;
	}
    
    
}
