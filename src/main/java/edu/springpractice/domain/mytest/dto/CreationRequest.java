package edu.springpractice.domain.mytest.dto;

import edu.springpractice.domain.mytest.MyEntity;

public record CreationRequest(
        String value
) {

    public MyEntity toEntity() {
        return MyEntity.builder()
                .value(this.value)
                .build();
    }

}
