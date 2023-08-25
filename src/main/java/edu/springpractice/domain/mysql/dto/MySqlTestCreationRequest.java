package edu.springpractice.domain.mysql.dto;

import edu.springpractice.domain.mysql.MySqlTest;

record CreationRequest(
        String value
) {

    public MySqlTest toEntity() {
        return MySqlTest.builder()
                .value(this.value)
                .build();
    }

}
