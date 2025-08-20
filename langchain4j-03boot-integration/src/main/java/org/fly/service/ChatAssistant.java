package org.fly.service;

import dev.langchain4j.service.spring.AiService;

/**
 * @auther zzyybs@126.com
 * @Date 2025-06-18 15:40
 * @Description: 知识出处，https://docs.langchain4j.dev/tutorials/spring-boot-integration/#spring-boot-starter-for-declarative-ai-services
 */
@AiService
public interface ChatAssistant {
    String chat(String prompt);
}
