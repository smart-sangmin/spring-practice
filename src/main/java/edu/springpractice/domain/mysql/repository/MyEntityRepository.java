package edu.springpractice.domain.mysql.repository;

import edu.springpractice.domain.mysql.MyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyEntityRepository extends JpaRepository<MyEntity, Long> {
}
