package edu.springpractice.domain.mysqltest.application;

import edu.springpractice.domain.mysqltest.MySqlTest;
import edu.springpractice.domain.mysqltest.dto.MySqlTestCreationRequest;
import edu.springpractice.domain.mysqltest.dto.MySqlTestCreationResponse;
import edu.springpractice.domain.mysqltest.repository.MySqlTestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MySqlTestService {

    private final MySqlTestRepository mySqlTestRepository;

    public MySqlTestCreationResponse create(MySqlTestCreationRequest dto) {
        MySqlTest saved = mySqlTestRepository.save(dto.toEntity());
        return new MySqlTestCreationResponse(saved);
    }

}
