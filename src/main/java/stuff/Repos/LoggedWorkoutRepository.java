package stuff.Repos;

import org.springframework.data.repository.CrudRepository;
import stuff.Beans.LoggedWorkout;

public interface LoggedWorkoutRepository extends CrudRepository<LoggedWorkout, Long> {
}
