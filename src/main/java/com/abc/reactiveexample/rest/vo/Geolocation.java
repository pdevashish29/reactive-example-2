package com.abc.reactiveexample.rest.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;


@Data
public class Geolocation{

    private String lat;
    @JsonProperty("long")
    private String mylong;
}