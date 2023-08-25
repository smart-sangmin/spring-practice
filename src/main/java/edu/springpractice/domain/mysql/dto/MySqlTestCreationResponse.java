package edu.springpractice.domain.mysql.dto;

import edu.springpractice.domain.mysql.MySqlTest;
import org.hibernate.validator.constraints.Length;

record CreationResponse(
        @Length(min = 1, max = 10)
        Long id
) {

    public CreationResponse(final MySqlTest mySqlTest) {
        this(mySqlTest.getId());
    }

}
