package com.zzz.trip.model.trip;

import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import lombok.Data;

/**
 * 雨天替代方案
 */
@Data
public class RainyDayAlternative {
    /**
     * 场所名称
     */
    @JsonPropertyDescription("场所名称")
    private String name;

    /**
     * 是否室内场所
     */
    @JsonPropertyDescription("是否室内场所")
    private Boolean indoorActivity;

    /**
     * 天气防护类型
     */
    @JsonPropertyDescription("天气防护类型")
    private String weatherProtection;
}