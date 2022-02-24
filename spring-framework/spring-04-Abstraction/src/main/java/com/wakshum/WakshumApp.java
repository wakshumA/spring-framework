package com.wakshum;

import com.wakshum.config.ProjectConfig;
import com.wakshum.model.Comment;
import com.wakshum.service.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class WakshumApp {

    public static void main(String[] args) {

        Comment comment = new Comment();
        comment.setAuthor("Jonson");
        comment.setText("Spring Framework");

        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
//
//        CommentService sc1 = context.getBean(CommentService.class);
//        CommentService sc2 = context.getBean(CommentService.class);
//
//        System.out.println(sc1);
//        System.out.println(sc2);
//
//        System.out.println(sc1 == sc2);

    }


}
