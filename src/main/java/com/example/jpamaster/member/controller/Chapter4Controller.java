package com.example.jpamaster.member.controller;

import com.example.jpamaster.member.domain.Board;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class Chapter4Controller {

    public static void boardTestMethod(EntityManager entityManager) {

        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        Board board1 = new Board();
        entityManager.persist(board1);
        Board board2 = new Board();
        entityManager.persist(board2);
        entityTransaction.commit();
    }
}
