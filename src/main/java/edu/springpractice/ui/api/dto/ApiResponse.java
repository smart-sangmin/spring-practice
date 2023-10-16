package edu.springpractice.ui.api.dto;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class ApiResponse<T> {
    private final T data;

    public static <T> ApiResponse<T> from(T data) {
        return new ApiResponse<>(data);
    }
}
