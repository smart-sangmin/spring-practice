package edu.springpractice.domain.mysqltest;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "my_sql_tests")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MySqlTest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "field_a", nullable = false)
    private String fieldA = "dsdsds";
    @Column(name = "value", nullable = false, length = 10)
    @Length(min = 1, max = 10)
    private String value;
    @Column
    private boolean isDeleted = false;
    @OneToMany(mappedBy = "mySql")
    private List<Mymy> list = new ArrayList<>();

    @Builder
    private MySqlTest(String value) {
        this.value = value;
    }

    public void delete() {
        isDeleted = true;
    }

}
