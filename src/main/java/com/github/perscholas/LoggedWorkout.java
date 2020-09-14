package com.github.perscholas;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LoggedWorkout {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


}
