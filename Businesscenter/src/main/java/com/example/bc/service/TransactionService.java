package com.example.bc.service;


import com.example.bc.dao.TransactionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {

 @Autowired
 TransactionDao transactionDao;



}
