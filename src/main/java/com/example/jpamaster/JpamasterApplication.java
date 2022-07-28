package com.example.jpamaster;

import com.example.jpamaster.member.controller.Chapter4Controller;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@Slf4j
public class JpamasterApplication {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpamaster");
        Chapter4Controller.boardTestMethod(entityManagerFactory.createEntityManager());
    }

}
