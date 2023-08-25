package edu.springpractice.domain.mysql.dto;

import edu.springpractice.domain.mysql.MySqlTest;

public record MySqlTestCreationResponse(
        Long id
) {

    public MySqlTestCreationResponse(final MySqlTest mySqlTest) {
        this(mySqlTest.getId());
    }

}
