package edu.springpractice.domain.mongotest;

import lombok.Builder;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.List;

@Document
@Getter
public class MongoTest {
    @MongoId
    private final String id;

    private final String value;

    private final List<String> urls;

    @Builder
    private MongoTest(String id, String value, List<String> urls) {
        this.id = id;
        this.value = value;
        this.urls = urls;
    }

}
