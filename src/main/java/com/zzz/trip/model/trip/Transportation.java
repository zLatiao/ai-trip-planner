package com.zzz.trip.model.trip;

import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import lombok.Data;

/**
 * 交通方式详情
 */
@Data
public class Transportation {
    /**
     * 交通类型
     */
    @JsonPropertyDescription("交通类型")
    private String type;

    /**
     * 具体说明
     */
    @JsonPropertyDescription("具体说明")
    private String detail;
}