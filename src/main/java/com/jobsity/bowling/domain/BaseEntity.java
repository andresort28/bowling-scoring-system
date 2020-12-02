package com.jobsity.bowling.domain;

import lombok.Getter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Getter
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
}
