package edu.springpractice.domain.mysqltest.repository;

import edu.springpractice.domain.mysqltest.MySqlTest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MySqlTestRepository extends JpaRepository<MySqlTest, Long> {
}
