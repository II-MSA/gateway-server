package org.iimsa.gatewayserver.response;

public record UserResponse(
        boolean success,
        String message,
        User data,
        String traceId
) {}
