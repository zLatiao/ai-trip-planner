package com.zzz.trip.controller;

import com.zzz.trip.model.ApiResult;
import com.zzz.trip.model.trip.TripAIPlanningDTO;
import com.zzz.trip.model.trip.AITripPlanResponse;
import com.zzz.trip.service.AIService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/ai-trip-plan")
public class AITripPlanController {

    @Autowired
    private AIService aiService;

    /**
     * AI规划行程
     * @param dto 请求参数
     * @return ApiResult<TripResponse>
     */
    @PostMapping("/plan")
    @Operation(summary = "用户-AI规划行程")
    public ApiResult<AITripPlanResponse> plan(@RequestBody TripAIPlanningDTO dto) {
        return ApiResult.success(aiService.plan(dto));
    }
}
