package org.chris.jpa.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "workflow_cycle")
@Inheritance(strategy = InheritanceType.JOINED)
public class WorkflowCycle {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @JsonBackReference
    @OneToMany(mappedBy = "cycle")
    private List<Workflow> workflows;


    public WorkflowCycle() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Workflow> getWorkflows() {
        return workflows;
    }

    public void setWorkflows(List<Workflow> workflows) {
        this.workflows = workflows;
    }
}
