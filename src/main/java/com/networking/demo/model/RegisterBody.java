package com.networking.demo.model;


import com.fasterxml.jackson.annotation.JsonProperty;


public record RegisterBody(
        String email,
        String password,
        @JsonProperty("first_name") String firstName,
        @JsonProperty("last_name") String lastName
) {
}
