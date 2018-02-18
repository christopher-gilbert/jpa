package org.chris.jpa.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;

@Entity
@Table(name = "workflow")
public class Workflow {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "state")
    private String state;

    @JsonManagedReference
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cycle_id")
    private WorkflowCycle cycle;

    public Workflow() {    };

    public Long getId() {
        return id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCycle(WorkflowCycle cycle) {
        this.cycle = cycle;
    }

    public WorkflowCycle getCycle() {
        return cycle;
    }
}
