/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.github.gwtboot.sample.collection.client;

import com.github.gwtboot.sample.collection.client.common.RestServicePreparator;
import com.github.gwtboot.sample.collection.client.common.ServicePreparator;
import com.github.gwtboot.sample.collection.client.domain.PersonClient;
import com.github.gwtboot.sample.collection.client.domain.RestPersonClient;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.inject.client.AbstractGinModule;
import com.google.inject.Singleton;

public class CollectionGinModule extends AbstractGinModule {

	@Override
	protected void configure() {
		// Bind the SimpleEventBus as Singleton
		bind(EventBus.class).to(SimpleEventBus.class).in(Singleton.class);

		// Bind ServicePreparator
		bind(ServicePreparator.class).to(RestServicePreparator.class)
				.in(Singleton.class);

		// Bind client for RestyGWT
		bind(PersonClient.class).to(RestPersonClient.class).in(Singleton.class);
	}

}
