package org.iimsa.gatewayserver.response;

import java.util.UUID;

public record User(
        UUID id,
        String name,
        String role,
        String email,
        String slackId,
        boolean enabled
) {}
