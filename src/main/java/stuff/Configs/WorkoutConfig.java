package stuff.Configs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import stuff.Beans.Workout;
import stuff.Repos.WorkoutRepository;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@Configuration
public class WorkoutConfig {

    @Autowired
    private WorkoutRepository repository;

    @PostConstruct
    public void setup(){
        repository.saveAll(Arrays.asList(
                new Workout("Cardio"),
                new Workout("WeightLifiting"),
                new Workout("Yoga")

        ));
    }

}
