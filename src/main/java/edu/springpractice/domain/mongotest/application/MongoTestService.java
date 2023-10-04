package edu.springpractice.domain.mongotest.application;

import edu.springpractice.domain.mongotest.MongoTest;
import edu.springpractice.domain.mongotest.dto.MongoTestCreationRequest;
import edu.springpractice.domain.mongotest.dto.MongoTestCreationResponse;
import edu.springpractice.domain.mongotest.repository.MongoTestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class MongoTestService {

    private final MongoTestRepository mongoTestRepository;

    public MongoTestCreationResponse create(MongoTestCreationRequest request) {
        MongoTest save = mongoTestRepository.save(request.toEntity());
        return new MongoTestCreationResponse(save);
    }

    public MongoTest getMongoTest(String id) {
        return mongoTestRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    public List<MongoTest> getAllMongoTest() {
        return mongoTestRepository.findAll();
    }
}
