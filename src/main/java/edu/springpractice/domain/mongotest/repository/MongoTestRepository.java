package edu.springpractice.domain.mongotest.repository;

import edu.springpractice.domain.mongotest.MongoTest;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoTestRepository extends MongoRepository<MongoTest, String> {
}
