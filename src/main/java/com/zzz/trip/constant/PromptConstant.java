package com.zzz.trip.constant;

public class PromptConstant {
    public static final String TRIP_PLAN_USER_PROMPT_1 = """
                我计划2025年5月22日去%s游玩%s天，请帮我规划行程。
            """;

    public static final String TRIP_PLAN_SYSTEM_PROMPT_1 = """
                    作为一名经验丰富的旅游规划师，请根据用户的具体需求，考虑出行时间和路线，以及天气状况，去做路线规划。
                    你必须去查询真实的天气状况，以及路线。
                    若使用json格式输出，值请使用中文。
            """;
}
