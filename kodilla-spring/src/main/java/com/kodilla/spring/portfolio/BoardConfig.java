package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class BoardConfig {

    @Bean
    public Board board() {
        return new Board(toDoList(), inProgress(), doneList());
    }

    @Bean
    @Scope("prototype")
    public TaskList toDoList() {
        return new TaskList();
    }

    @Bean
    @Scope("prototype")
    public TaskList inProgress() {
        return new TaskList();
    }

    @Bean
    @Scope("prototype")
    public TaskList doneList() {
        return new TaskList();
    }
}
