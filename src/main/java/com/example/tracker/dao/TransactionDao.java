package com.example.tracker.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tracker.entites.Transaction;

public interface TransactionDao extends JpaRepository<Transaction, Long> {

}
