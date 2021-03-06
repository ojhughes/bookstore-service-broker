/*
 * Copyright 2002-2017 the original author or authors.
 *
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
 */

package org.springframework.cloud.broker.bookstore.webmvc.model;


import org.springframework.cloud.servicebroker.model.Context;
import org.springframework.data.annotation.Id;
import org.springframework.data.keyvalue.annotation.KeySpace;

@KeySpace("serviceInstances")
public class ServiceInstance {
	@Id
	private final String instanceId;

	private final Context context;

	public ServiceInstance(String instanceId, Context context) {
		this.instanceId = instanceId;
		this.context = context;
	}

	public String getInstanceId() {
		return instanceId;
	}

	public Context getContext() {
		return context;
	}
}
