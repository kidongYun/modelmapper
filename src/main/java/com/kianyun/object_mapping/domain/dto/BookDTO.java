package com.kianyun.object_mapping.domain.dto;

import com.kianyun.object_mapping.domain.model.CurrencyType;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class BookDTO {
    private String title;
    private String author;
    private String nickName;
    private CurrencyType currencyType;
    private LocalDate publishedAt;
    private Long price;
}
