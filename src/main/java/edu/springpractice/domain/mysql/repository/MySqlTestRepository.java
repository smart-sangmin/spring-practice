package edu.springpractice.domain.mysql.repository;

import edu.springpractice.domain.mysql.MySqlTest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MySqlTestRepository extends JpaRepository<MySqlTest, Long> {
}
