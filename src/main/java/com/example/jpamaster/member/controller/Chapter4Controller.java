package com.example.jpamaster.member.controller;

import com.example.jpamaster.member.domain.Board;
import com.example.jpamaster.member.domain.Member;

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
        Board board3 = new Board();
        entityManager.persist(board3);
        Board board4 = new Board();
        entityManager.persist(board4);

        Member member1 = new Member();
        member1.setUserName("찬복");
        member1.setAge(10);

        Member member2 = new Member();
        member2.setUserName("찬복1");
        member2.setAge(101);
        entityManager.persist(member1);
        entityManager.persist(member2);
        entityTransaction.commit();
    }
}
