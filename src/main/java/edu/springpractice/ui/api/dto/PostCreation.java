package edu.springpractice.ui.api.dto;

public sealed interface PostCreation permits PostCreation.Request, PostCreation.Response {
    record Request(
            String title,
            String contents,
            String writer,
            String status
    ) implements PostCreation {
    }

    record Response(
            Long id
    ) implements PostCreation {
    }
}
