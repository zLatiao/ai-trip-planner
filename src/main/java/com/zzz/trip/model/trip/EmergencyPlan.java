package com.zzz.trip.model.trip;

import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import lombok.Data;

import java.util.List;

/**
 * 应急预案
 */
@Data
public class EmergencyPlan {
    /**
     * 雨天替代方案
     */
    @JsonPropertyDescription("雨天替代方案")
    private List<RainyDayAlternative> rainyDayAlternatives;
}