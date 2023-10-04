package edu.springpractice.domain.mongotest.dto;

import edu.springpractice.domain.mongotest.MongoTest;

public record MongoTestCreationResponse(
        String id
) {

    public MongoTestCreationResponse(MongoTest mongoTest) {
        this(mongoTest.getId());
    }

}
