package edu.springpractice.ui.api;

import edu.springpractice.domain.post.service.PostService;
import edu.springpractice.ui.api.dto.ApiResponse;
import edu.springpractice.ui.api.dto.PostCreation;
import edu.springpractice.ui.api.dto.PostResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/posts")
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;

    @PostMapping
    public ResponseEntity<ApiResponse<Long>> createPost(
            @RequestBody PostCreation.Request request
    ) {

    }

    @GetMapping("/{id}")
    public ResponseEntity<PostResponse> getById(@PathVariable Long id) {
        return ResponseEntity.ok();
    }
}
