/*
 * Copyright 2012-2013 the original author or authors.
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

package com.jg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.web.filter.CharacterEncodingFilter;

import com.jg.config.ConnectionSettings;
import com.jg.domain.Message;
import com.jg.repository.InMemoryMessageRespository;
import com.jg.repository.MessageRepository;

@Configuration
@EnableAutoConfiguration
@ComponentScan
@EnableConfigurationProperties(ConnectionSettings.class)
public class SampleWebUiApplication {

	@Bean
	public MessageRepository messageRepository() {
		return new InMemoryMessageRespository();
	}

	@Bean
	public Converter<String, Message> messageConverter() {
		return new Converter<String, Message>() {
			@Override
			public Message convert(String id) {
				return messageRepository().findMessage(Long.valueOf(id));
			}
		};
	}

	@Bean
//	@ConditionalOnMissingBean(CharacterEncodingFilter.class)
	public CharacterEncodingFilter CharacterEncodingFilter() {
		CharacterEncodingFilter filter = new CharacterEncodingFilter();
		filter.setEncoding("utf-8");
		return filter;
	}
	public static void main(String[] args) throws Exception {
		SpringApplication.run(SampleWebUiApplication.class, args);
	}

}
