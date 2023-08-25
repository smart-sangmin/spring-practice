package edu.springpractice.domain.mysql;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "my_tests")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "value", nullable = false, length = 10)
    @Length(min = 1, max = 10)
    private String value;

    @Builder
    private MyEntity(String value) {
        this.value = value;
    }

}
