package com.zzz.trip.service;

import com.zzz.trip.constant.PromptConstant;
import com.zzz.trip.model.trip.TripAIPlanningDTO;
import com.zzz.trip.model.trip.AITripPlanResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zzz
 * @since 2025/5/23 21:24
 */
@Service
@Slf4j
public class AIService {

    @Autowired
    private ChatClient chatClient;


    public AITripPlanResponse plan(TripAIPlanningDTO dto) {
        return chatClient
                .prompt()
                .system(PromptConstant.TRIP_PLAN_SYSTEM_PROMPT_1)
                .user(String.format(PromptConstant.TRIP_PLAN_USER_PROMPT_1, dto.getPlace(), dto.getDays()))
                .call()
                .entity(AITripPlanResponse.class);
    }
}
