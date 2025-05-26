package com.zzz.trip.model.trip;

import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import lombok.Data;

/**
 * 导航工具配置
 */
@Data
public class NavigationTools {
    /**
     * 地图方案URI
     */
    @JsonPropertyDescription("地图方案URI")
    private String mapSchema;

    /**
     * 实时导航链接
     */
    @JsonPropertyDescription("实时导航链接")
    private RealTimeNavigation realTimeNavigation;
}