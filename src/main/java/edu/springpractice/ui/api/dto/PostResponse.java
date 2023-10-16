package edu.springpractice.ui.api.dto;

import edu.springpractice.domain.post.model.Post;

import java.time.LocalDateTime;

public record PostResponse(
        Long id,
        String title,
        String contents,
        String writer,
        String status,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
) {
    public static PostResponse toDto(Post post) {
        return new PostResponse(
                post.getId(),
                post.getTitle(),
                post.getContents(),
                post.getWriter(),
                post.getStatus(),
                post.getCreatedAt(),
                post.getUpdatedAt()
        );
    }
}
