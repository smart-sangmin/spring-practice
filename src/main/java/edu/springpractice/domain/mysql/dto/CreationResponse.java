package edu.springpractice.domain.mytest.dto;

import edu.springpractice.domain.mytest.MyEntity;
import org.hibernate.validator.constraints.Length;

public record CreationResponse(
        @Length(min = 1, max = 10)
        Long id
) {

    public CreationResponse(final MyEntity myEntity) {
        this(myEntity.getId());
    }

}
