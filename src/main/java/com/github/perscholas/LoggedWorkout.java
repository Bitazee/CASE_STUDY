package com.github.perscholas;

import javax.persistence.*;

@Entity
public class LoggedWorkout {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @JoinColumn(name = "user_id")
    private Long accId;


    @JoinColumn(name = "workout_id")
    private Long typeOfWorkout;

    private String description;


}
