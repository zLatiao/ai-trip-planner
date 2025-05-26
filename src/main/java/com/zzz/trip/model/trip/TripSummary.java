package com.zzz.trip.model.trip;

import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import lombok.Data;

/**
 * 行程摘要信息
 */
@Data
public class TripSummary {
    /**
     * 旅行目的地城市名称
     */
    @JsonPropertyDescription("旅行目的地城市名称")
    private String place;

    /**
     * 行程总天数
     */
    @JsonPropertyDescription("行程总天数")
    private Integer durationDays;

    /**
     * 气候建议
     */
    @JsonPropertyDescription("气候建议")
    private String climateAdvice;
}
