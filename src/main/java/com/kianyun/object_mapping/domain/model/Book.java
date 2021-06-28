package com.kianyun.object_mapping.domain.model;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private String title;
    private String author;
    private String aka;
    private CurrencyType currencyType;
    private LocalDate createAt;
    private Long price;
}
