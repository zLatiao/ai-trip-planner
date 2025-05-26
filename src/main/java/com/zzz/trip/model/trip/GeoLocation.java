package com.zzz.trip.model.trip;

import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import lombok.Data;

/**
 * 地理坐标
 */
@Data
public class GeoLocation {
    /**
     * 经度
     */
    @JsonPropertyDescription("经度")
    private Double longitude;

    /**
     * 纬度
     */
    @JsonPropertyDescription("纬度")
    private Double latitude;
}
