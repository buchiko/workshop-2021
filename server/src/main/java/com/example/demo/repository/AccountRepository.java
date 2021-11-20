package com.example.demo.repository;

import java.util.Iterator;

import com.example.demo.domain.Account;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {
    @Query(value = "select p from Account p where p.user_id = 1") // JPQL
    Iterator<Account> findId(int user_Id);

}