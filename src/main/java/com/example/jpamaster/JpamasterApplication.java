package com.example.jpamaster;

import com.example.jpamaster.member.domain.Board;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

@SpringBootApplication
@Slf4j
public class JpamasterApplication {

    public static void main(String[] args) {
        //SpringApplication.run(JpamasterApplication.class, args);
        //
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpamaster");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        Board board = new Board();
        entityManager.persist(board);
        entityTransaction.commit();
    }

}
