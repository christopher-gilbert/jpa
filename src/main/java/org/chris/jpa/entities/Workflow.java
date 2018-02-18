package org.chris.jpa.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Workflow {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String state;

    public Workflow() {};

    public Long getId() {
        return id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
