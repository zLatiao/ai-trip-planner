package com.zzz.trip.model.trip;

import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import lombok.Data;

/**
 * 实时导航信息
 */
@Data
public class RealTimeNavigation {
    /**
     * 驾车导航链接
     */
    @JsonPropertyDescription("驾车导航链接")
    private String drive;

    /**
     * 公交方案
     */
    @JsonPropertyDescription("公交方案")
    private String publicTransport;
}
