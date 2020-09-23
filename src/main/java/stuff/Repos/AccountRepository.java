package stuff.Repos;

import org.springframework.data.repository.CrudRepository;
import stuff.Beans.Account;

public interface AccountRepository extends CrudRepository<Account, Long> {

}
