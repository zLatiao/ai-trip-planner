package com.zzz.trip.model;

public record ApiResult<T>(int code, String msg, T data) {

    public static <T> ApiResult<T> success(T data) {
        return new ApiResult<>(0, "", data);
    }

    public static <T> ApiResult<T> fail(int code, String msg) {
        return new ApiResult<>(code, msg, null);
    }
}
