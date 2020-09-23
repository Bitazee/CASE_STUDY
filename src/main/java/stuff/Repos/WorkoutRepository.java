package stuff.Repos;

import org.springframework.data.repository.CrudRepository;
import stuff.Beans.Workout;

public interface WorkoutRepository extends CrudRepository<Workout, Long> {

}
