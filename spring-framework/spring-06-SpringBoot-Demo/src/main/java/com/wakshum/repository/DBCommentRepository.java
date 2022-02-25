package com.wakshum.repository;

import com.wakshum.model.Comment;
import org.springframework.stereotype.Component;

@Component
public class DBCommentRepository implements CommentRepository{

    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storring comment : " + comment.getText());
    }
}
