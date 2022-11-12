package ru.practicum.event;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "events")
public class Event {

    @Id
    long id;

    String description;

}
