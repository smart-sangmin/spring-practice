package edu.springpractice.infra.rdbms.post.service;

import edu.springpractice.domain.post.model.Post;
import edu.springpractice.infra.rdbms.post.repository.PostJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@RequiredArgsConstructor
public class PostCommand {
    private final PostQuery postQuery;
    private final PostJpaRepository postJpaRepository;

    public Long create(final PostDto post) {

    }

    public void update(final Post post) {

    }

    public void delete(final long bucWithId) {

    }
}
