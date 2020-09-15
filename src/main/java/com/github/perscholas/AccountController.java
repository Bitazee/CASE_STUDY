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


    //Remove this soon tm
    @GetMapping(value = "/all")
    public ResponseEntity<List<Account>> readAll(){
        return new ResponseEntity<>(service.readAll(), HttpStatus.OK);
    }

    //Remove this also soon tm
    @GetMapping(value = "/read/{id}")
    public ResponseEntity<Account> readById(@PathVariable Long id){
        return new ResponseEntity<>(service.readById(id), HttpStatus.OK);
    }


    @PutMapping(value = "/update/{id}")
    public ResponseEntity<Account> updateById(@PathVariable Long id, @RequestBody Account newData){
        return new ResponseEntity<>(service.updateById(id, newData), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Account> delete(@PathVariable Long id){
        return new ResponseEntity<>(service.deleteById(id), HttpStatus.OK);
    }


}
