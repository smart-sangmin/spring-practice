package edu.springpractice.domain.mytest.presentation;

import edu.springpractice.domain.mytest.application.MyEntityService;
import edu.springpractice.domain.mytest.dto.CreationRequest;
import edu.springpractice.domain.mytest.dto.CreationResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/api/test")
@RequiredArgsConstructor
public class MyEntityController {

    private final MyEntityService myEntityService;

    @PostMapping
    @ResponseStatus(CREATED)
    public CreationResponse create(@RequestBody @Valid final CreationRequest dto) {
        return myEntityService.create(dto);
    }

}
