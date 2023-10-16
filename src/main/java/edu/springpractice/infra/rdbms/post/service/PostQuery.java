package edu.springpractice.infra.rdbms.post.service;

import edu.springpractice.infra.rdbms.post.model.entity.PostJpaEntity;
import edu.springpractice.infra.rdbms.post.repository.PostJpaRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = true)
@RequiredArgsConstructor
public class PostQuery {
    private final PostJpaRepository postJpaRepository;

    public PostJpaEntity findBucWith(final long bucWithId) {
        // TODO: parameter에 userId 들어가야 함
        return postJpaRepository.findById(bucWithId)
                .orElseThrow(EntityNotFoundException::new);
    }

    public List<PostJpaEntity> findAll() {
        // TODO: parameter에 userId 들어가야 함
        return postJpaRepository.findAll();
    }
}
