package edu.springpractice.domain.mongotest.presentation;

import edu.springpractice.domain.mongotest.MongoTest;
import edu.springpractice.domain.mongotest.application.MongoTestService;
import edu.springpractice.domain.mongotest.dto.MongoTestCreationRequest;
import edu.springpractice.domain.mongotest.dto.MongoTestCreationResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/api/mongo")
@RequiredArgsConstructor
public class MongoTestController {

    private final MongoTestService mongoTestService;

    @PostMapping
    @ResponseStatus(CREATED)
    public MongoTestCreationResponse create(@RequestBody @Valid MongoTestCreationRequest request) {
        return mongoTestService.create(request);
    }

    @GetMapping("/{id}")
    public MongoTest getMongoTest(@PathVariable String id) {
        return mongoTestService.getMongoTest(id);
    }

    @GetMapping("/all")
    public List<MongoTest> getAllMongoTest() {
        return mongoTestService.getAllMongoTest();
    }

}
