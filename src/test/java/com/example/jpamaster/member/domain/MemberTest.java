package com.example.jpamaster.member.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import javax.persistence.*;


@DataJpaTest
class MemberTest {

    @PersistenceContext
    private EntityManager entityManager;
    @Test
    void test1() {
        Board board = new Board();
        entityManager.persist(board);
        assertEquals(1, board.getId());
    }
}