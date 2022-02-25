package com.wakshum;

import com.wakshum.model.Comment;
import com.wakshum.service.CommentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class WakshumApplication {

    public static void main(String[] args) {

        Comment comment = new Comment();
        comment.setAuthor("Johnson");
        comment.setText("Spring Framework");

        ApplicationContext context = SpringApplication.run(WakshumApplication.class, args);

        CommentService cs = context.getBean(CommentService.class);

        cs.publishComment(comment);
    }

}
