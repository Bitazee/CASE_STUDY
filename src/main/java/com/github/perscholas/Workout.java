package com.github.perscholas;

import javax.persistence.*;

@Entity
public class Workout {

    @Id
    @Column(name = "workout_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String workoutName;

    public Workout(String workoutName) {
        this.workoutName = workoutName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return workoutName;
    }

    public void setName(String name) {
        this.workoutName = name;
    }

}
