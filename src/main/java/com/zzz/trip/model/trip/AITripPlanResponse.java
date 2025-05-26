package com.zzz.trip.model.trip;

import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import lombok.Data;

import java.util.List;

/**
 * 旅行规划响应根实体
 */
@Data
public class AITripPlanResponse {
    /**
     * 行程摘要信息
     */
    @JsonPropertyDescription("行程摘要信息")
    private TripSummary tripSummary;

    /**
     * 每日详细计划列表
     */
    @JsonPropertyDescription("每日详细计划列表")
    private List<DailyPlan> dailyPlans;

    /**
     * 导航工具配置
     */
    @JsonPropertyDescription("导航工具配置")
    private NavigationTools navigationTools;

    /**
     * 应急预案配置
     */
    @JsonPropertyDescription("应急预案配置")
    private EmergencyPlan emergencyPlan;
}
