package com.zzz.trip.model.trip;

import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import lombok.Data;

/**
 * 每日天气信息
 */
@Data
public class DailyWeather {
    /**
     * 天气状况
     */
    @JsonPropertyDescription("天气状况")
    private String condition;

    /**
     * 温度范围
     */
    @JsonPropertyDescription("温度范围")
    private String temperatureRange;

    /**
     * 风力信息
     */
    @JsonPropertyDescription("风力信息")
    private String wind;
}
