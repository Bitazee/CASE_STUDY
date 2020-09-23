package stuff.Configs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import stuff.Beans.Account;
import stuff.Repos.AccountRepository;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@Configuration
public class AccountConfig {

    @Autowired
    private AccountRepository repository;

    @PostConstruct
    public void setup(){
        repository.saveAll(Arrays.asList(
                new Account("Leon", "Hunter"),
                new Account("Marcus", "Password"),
                new Account("Yoga", "Fire")

        ));
    }
}
