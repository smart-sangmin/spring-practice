package edu.springpractice.domain.mysql.dto;

import edu.springpractice.domain.mysql.MySqlTest;
import org.hibernate.validator.constraints.Length;

public record MySqlTestCreationRequest(
        @Length(min = 1, max = 10)
        String value
) {

    public MySqlTest toEntity() {
        return MySqlTest.builder()
                .value(this.value)
                .build();
    }

}
