package com.app.giftregistry.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GiftItem {
    private Long id;
    private String name;
    @JsonProperty("price")
    private Long price;
}
