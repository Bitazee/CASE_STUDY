package stuff.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import stuff.Beans.Account;
import stuff.Repos.AccountRepository;

import java.util.ArrayList;
import java.util.List;

//register as a bean in the IOC
@Service
public class AccountService {

    private AccountRepository repository;

    @Autowired
    public AccountService(AccountRepository repository){
        this.repository = repository;
    }


    //Crud Methods
    public Account create(Account createdProduct){
        return repository.save(createdProduct);
    }


    public Account readById(Long id){
        return repository.findById(id).get();
    }

    public List<Account> readAll(){
        Iterable<Account> productIterable = repository.findAll();
        List<Account> productList = new ArrayList<>();
        productIterable.forEach(productList::add);
        return productList;
    }


    public Account updateById(Long id, Account newData){
        Account dataToChange = readById(id);
        dataToChange.setName(dataToChange.getName());
        dataToChange.setPass(dataToChange.getPass());
        dataToChange.setId(dataToChange.getId());

        return dataToChange;
    }

    public Account delete(Account account){
        return null;
    }
    public Account deleteById(Long id){
        Account dataToRemove = readById(id);
        repository.delete(dataToRemove);
        return dataToRemove;
    }

}
