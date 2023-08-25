package edu.springpractice.domain.mysqltest.dto;

import edu.springpractice.domain.mysqltest.MySqlTest;

public record MySqlTestCreationResponse(
        Long id
) {

    public MySqlTestCreationResponse(final MySqlTest mySqlTest) {
        this(mySqlTest.getId());
    }

}
