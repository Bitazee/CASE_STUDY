package com.github.perscholas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/account-controller")
public class AccountController {

    //inject Service
    private AccountService service;

    @Autowired
    public AccountController(AccountService productService){
        this.service = productService;
    }

    @PostMapping(value = "/create")
    public ResponseEntity<Account> create(@RequestBody  Account newAccount){
        return new ResponseEntity<Account>(service.create(newAccount), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Account> delete(@PathVariable Long id){
        return new ResponseEntity<>(service.deleteById(id), HttpStatus.OK);
    }


}
