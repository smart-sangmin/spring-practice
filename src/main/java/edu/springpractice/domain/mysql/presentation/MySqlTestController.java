package edu.springpractice.domain.mysql.presentation;

import edu.springpractice.domain.mysql.application.MySqlTestService;
import edu.springpractice.domain.mysql.dto.MySqlTestCreationRequest;
import edu.springpractice.domain.mysql.dto.MySqlTestCreationResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/mysql")
@RequiredArgsConstructor
public class MySqlTestController {

    private final MySqlTestService mySqlTestService;

    @PostMapping
    @ResponseStatus(CREATED)
    public MySqlTestCreationResponse create(@RequestBody @Valid final MySqlTestCreationRequest dto) {
        return mySqlTestService.create(dto);
    }

}
