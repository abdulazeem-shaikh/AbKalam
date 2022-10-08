package com.example.bc.controller;


import com.example.bc.vo.TransactionRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController {


    @Autowired
    TransactionRequest transactionService;

    @PostMapping("/transaction")
    public String submitTransaction(TransactionRequest transactionRequest) {
        return "success";
    }


    @GetMapping("/promo")
    public String getPromo(TransactionRequest transactionRequest) {
        return "success";
    }


    @GetMapping("/device")
    public String checkDevice(TransactionRequest transactionRequest) {
        return "success";
    }
}
