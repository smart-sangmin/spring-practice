package edu.springpractice.infra.rdbms.post.repository;

import edu.springpractice.infra.rdbms.post.model.entity.PostJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostJpaRepository extends JpaRepository<PostJpaEntity, Long> {
}
