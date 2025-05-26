package com.zzz.trip.model.trip;

import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import lombok.Data;

/**
 * 行程项详细信息
 */
@Data
public class ItineraryItem {
    /**
     * 活动时间段
     */
    @JsonPropertyDescription("活动时间段")
    private String timeSlot;

    /**
     * 景点详细信息
     */
    @JsonPropertyDescription("景点详细信息")
    private Attraction attraction;

    /**
     * 交通方式
     */
    @JsonPropertyDescription("交通方式")
    private Transportation transportation;

    /**
     * 特别提示
     */
    @JsonPropertyDescription("特别提示")
    private String specialTips;

    /**
     * 活动类型
     */
    @JsonPropertyDescription("活动类型")
    private String activityType;

    /**
     * 路线信息
     */
    @JsonPropertyDescription("路线信息")
    private RouteInfo routeInfo;

    /**
     * 安全提示
     */
    @JsonPropertyDescription("安全提示")
    private String safetyNotice;

}
