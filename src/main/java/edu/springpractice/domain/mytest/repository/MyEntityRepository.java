package edu.springpractice.domain.mytest.repository;

import edu.springpractice.domain.mytest.MyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyEntityRepository extends JpaRepository<MyEntity, Long> {
}
