package edu.springpractice.domain.mongotest.dto;

import edu.springpractice.domain.mongotest.MongoTest;
import org.hibernate.validator.constraints.Length;

import java.util.List;

public record MongoTestCreationRequest(
        @Length(min = 1, max = 10)
        String value,
        List<String> urls
) {
    public MongoTest toEntity() {
        return MongoTest.builder()
                .value(this.value)
                .urls(this.urls)
                .build();
    }
}
