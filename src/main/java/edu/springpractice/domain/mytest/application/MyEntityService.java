package edu.springpractice.domain.mytest.application;

import edu.springpractice.domain.mytest.MyEntity;
import edu.springpractice.domain.mytest.dto.CreationRequest;
import edu.springpractice.domain.mytest.dto.CreationResponse;
import edu.springpractice.domain.mytest.repository.MyEntityRepository;
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
