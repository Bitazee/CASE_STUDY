package stuff.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import stuff.Beans.LoggedWorkout;
import stuff.Service.LoggedWorkoutService;

import java.util.List;

@Controller
@RequestMapping("/loggedWorkout-controller")
public class LoggedWorkoutController {

    //inject Service
    private LoggedWorkoutService service;

    @Autowired
    public LoggedWorkoutController(LoggedWorkoutService productService){
        this.service = productService;
    }

    @PostMapping(value = "/create")
    public ResponseEntity<LoggedWorkout> create(@RequestBody LoggedWorkout newLoggedWorkout){
        return new ResponseEntity<LoggedWorkout>(service.create(newLoggedWorkout), HttpStatus.CREATED);
    }


    @GetMapping(value = "/all")
    public ResponseEntity<List<LoggedWorkout>> readAll(){
        return new ResponseEntity<>(service.readAll(), HttpStatus.OK);
    }
}
