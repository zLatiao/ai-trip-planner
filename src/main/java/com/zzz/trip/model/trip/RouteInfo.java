package com.zzz.trip.model.trip;

import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import lombok.Data;

/**
 * 路线信息
 */
@Data
public class RouteInfo {
    /**
     * 路线距离
     */
    @JsonPropertyDescription("路线距离")
    private String distance;

    /**
     * 海拔变化
     */
    @JsonPropertyDescription("海拔变化")
    private String elevationGain;
}
