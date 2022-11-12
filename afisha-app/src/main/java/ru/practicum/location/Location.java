package ru.practicum.location;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity(name = "locations")
public class Location {

    @Id
    long id;

    double lat;

    double lon;

}
