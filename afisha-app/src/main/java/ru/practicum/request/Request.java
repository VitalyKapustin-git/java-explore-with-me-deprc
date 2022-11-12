package ru.practicum.request;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "participations")
public class Request {

    @Id
    long id;

    String name;

}
