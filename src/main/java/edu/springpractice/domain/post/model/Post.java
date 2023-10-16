package edu.springpractice.domain.post.model;

import edu.springpractice.infra.rdbms.post.model.entity.PostJpaEntity.Status;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class Post {
    private long id;
    private String title;
    private String contents;
    private String writer;
    private Status status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @Builder
    private Post(long id, String title, String contents, String writer, Status status, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.title = title;
        this.contents = contents;
        this.writer = writer;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getStatus() {
        return status.name();
    }
}
