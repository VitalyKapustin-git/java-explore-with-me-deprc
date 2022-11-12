package ru.practicum.compilation;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "compilations")
public class Compilation {

    @Id
    long id;

    String name;

}
