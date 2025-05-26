package com.zzz.trip.model.trip;

import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import lombok.Data;

/**
 * 实时天气详情
 */
@Data
public class CurrentWeather {
    /**
     * 天气状况
     */
    @JsonPropertyDescription("天气状况")
    private String condition;

    /**
     * 实际温度
     */
    @JsonPropertyDescription("实际温度")
    private String temperature;

    /**
     * 体感温度
     */
    @JsonPropertyDescription("体感温度")
    private String realFeel;
}