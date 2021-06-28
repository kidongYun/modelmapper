package com.kianyun.object_mapping;

import com.kianyun.object_mapping.domain.dto.BookDTO;
import com.kianyun.object_mapping.domain.model.Book;
import com.kianyun.object_mapping.domain.model.CurrencyType;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@Slf4j
@SpringBootTest
class ObjectMappingApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void test_use_model_mapper() {
        ModelMapper modelMapper = new ModelMapper();

        modelMapper.createTypeMap(Book.class, BookDTO.class)
                .addMapping(Book::getCreateAt, BookDTO::setPublishedAt).addMapping(Book::getAka, BookDTO::setNickName);

        BookDTO bookDTO = BookDTO.builder()
                .title("Selfish Gene")
                .author("Lichard Dokins")
                .price(24000L)
                .currencyType(CurrencyType.builder().type("KRW").build())
                .nickName("Rich")
                .publishedAt(LocalDate.of(1984, 6, 20)).build();

        Book book = modelMapper.map(bookDTO, Book.class);

        log.info("YKD : " + book.toString());
    }
}
