package com.zzz.trip.config;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.advisor.SimpleLoggerAdvisor;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * AI 配置
 *
 * @author zzz
 * @since 2025/5/23 21:33
 */
@Configuration
public class SpringAIConfig {
    @Bean
    public ChatClient chatClient(ChatClient.Builder chatClientBuilder, ToolCallbackProvider tools) {
        return chatClientBuilder
                .defaultTools(tools)
                .defaultAdvisors(new SimpleLoggerAdvisor())
                .build();
    }
}
