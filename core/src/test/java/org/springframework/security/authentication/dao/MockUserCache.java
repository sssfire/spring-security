/*
 * Copyright 2002-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 *
 */
package org.springframework.security.authentication.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserCache;
import org.springframework.security.core.userdetails.UserDetails;

public class MockUserCache implements UserCache {
	private Map<String, UserDetails> cache = new HashMap<>();

	public UserDetails getUserFromCache(String username) {
		return (User) cache.get(username);
	}

	public void putUserInCache(UserDetails user) {
		cache.put(user.getUsername(), user);
	}

	public void removeUserFromCache(String username) {
		cache.remove(username);
	}
}
