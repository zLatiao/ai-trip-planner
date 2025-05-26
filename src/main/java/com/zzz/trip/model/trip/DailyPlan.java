package com.zzz.trip.model.trip;

import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import lombok.Data;

import java.util.List;

/**
 * 每日行程计划
 */
@Data
public class DailyPlan {
    /**
     * 行程天数序号
     */
    @JsonPropertyDescription("行程天数序号")
    private Integer dayNumber;

    /**
     * 当日整体天气
     */
    @JsonPropertyDescription("当日整体天气")
    private DailyWeather dailyWeather;

    /**
     * 当日活动安排
     */
    @JsonPropertyDescription("当日活动安排")
    private List<ItineraryItem> itinerary;
}