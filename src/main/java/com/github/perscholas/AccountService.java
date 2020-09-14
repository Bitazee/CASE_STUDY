package com.github.perscholas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//register as a bean in the IOC
@Service
public class AccountService {

    private AccountController repository;

    @Autowired
    public AccountService(AccountController repository){
        this.repository = repository;
    }


    //Crud Methods
    public Account create(Account createdProduct){
        return repository.save(createdProduct);
    }
    public List<Account> readAll(){
        Iterable<Account> productIterable = repository.findAll();
        List<Account> productList = new ArrayList<>();
        productIterable.forEach(productList::add);
        return productList;
    }

    public Account readById(Long id){
        return repository.findById(id).get();
    }
    public Account updateById(Long id){
        Account dataToChange = readById(id);
        dataToChange.setName(dataToChange.getName());
        dataToChange.setPass(dataToChange.getPass());
        dataToChange.setId(dataToChange.getId());

        return dataToChange;
    }

    public Account deleteById(Long id){
        Account dataToRemove = readById(id);
        repository.delete(dataToRemove);
        return dataToRemove;
    }

}
