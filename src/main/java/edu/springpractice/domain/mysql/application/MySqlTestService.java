package edu.springpractice.domain.mysql.application;

import edu.springpractice.domain.mysql.MyEntity;
import edu.springpractice.domain.mysql.dto.CreationRequest;
import edu.springpractice.domain.mysql.dto.CreationResponse;
import edu.springpractice.domain.mysql.repository.MyEntityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MyEntityService {

    private final MyEntityRepository myEntityRepository;

    public CreationResponse create(CreationRequest dto) {
        MyEntity saved = myEntityRepository.save(dto.toEntity());
        return new CreationResponse(saved);
    }

}
