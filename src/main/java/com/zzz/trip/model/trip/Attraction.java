package com.zzz.trip.model.trip;

import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import lombok.Data;

/**
 * 景点信息
 */
@Data
public class Attraction {
    /**
     * 景点名称
     */
    @JsonPropertyDescription("景点名称")
    private String name;

    /**
     * 地理坐标
     */
    @JsonPropertyDescription("地理坐标")
    private GeoLocation geoLocation;

    /**
     * 实时天气
     */
    @JsonPropertyDescription("实时天气")
    private CurrentWeather currentWeather;

}
