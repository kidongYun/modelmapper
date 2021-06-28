package com.kianyun.object_mapping.domain.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class CurrencyType {
    private final String type;
}
