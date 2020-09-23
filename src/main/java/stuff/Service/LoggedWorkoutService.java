package stuff.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import stuff.Beans.LoggedWorkout;
import stuff.Repos.LoggedWorkoutRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class LoggedWorkoutService {

    private LoggedWorkoutRepository repository;

    @Autowired
    public LoggedWorkoutService(LoggedWorkoutRepository repository) {
        this.repository = repository;
    }


    //Crud Methods
    public LoggedWorkout create(LoggedWorkout createdLoggedWorkout) {
        return repository.save(createdLoggedWorkout);
    }


    public LoggedWorkout readById(Long id) {
        return repository.findById(id).get();
    }

    public List<LoggedWorkout> readAll() {
        Iterable<LoggedWorkout> productIterable = repository.findAll();
        List<LoggedWorkout> productList = new ArrayList<>();
        productIterable.forEach(productList::add);
        return productList;
    }
}



