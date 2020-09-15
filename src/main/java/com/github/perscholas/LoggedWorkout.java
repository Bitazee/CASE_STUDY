package com.github.perscholas;

import javax.persistence.*;

@Entity
public class LoggedWorkout {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Long accId;

    @ManyToOne
    @JoinColumn(name = "workout_id")
    private Long typeOfWorkout;

    private String description;


}
