package edu.springpractice.domain.mysql.application;

import edu.springpractice.domain.mysql.MySqlTest;
import edu.springpractice.domain.mysql.dto.MySqlTestCreationRequest;
import edu.springpractice.domain.mysql.dto.MySqlTestCreationResponse;
import edu.springpractice.domain.mysql.repository.MySqlTestRepository;
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
