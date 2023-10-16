package edu.springpractice.infra.rdbms.post.model.entity;

import edu.springpractice.infra.rdbms.common.model.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Table(name = "bucwiths")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class PostJpaEntity extends BaseEntity<PostJpaEntity> {
    private static final int TITLE_MAX_LENGTH = 31;
    private static final int CONTENTS_MAX_LENGTH = 500;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = TITLE_MAX_LENGTH)
    private String title;

    @Column(nullable = false, length = PostJpaEntity.CONTENTS_MAX_LENGTH)
    private String content;

    @Column(nullable = false)
    private String writer;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Status status;

    public PostJpaEntity(String title, String content, String writer, Status status) {
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.status = status;
    }

    @Getter
    public enum Status {
        PUBLIC("공개"),
        PRIVATE("비공개"),
        DELETED("삭제");

        private final String description;

        Status(String description) {
            this.description = description;
        }
    }
}
