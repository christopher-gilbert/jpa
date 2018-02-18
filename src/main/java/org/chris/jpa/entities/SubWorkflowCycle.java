package org.chris.jpa.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "sub_workflow_cycle")
@PrimaryKeyJoinColumn(name = "id")
public class SubWorkflowCycle extends WorkflowCycle {

    @Column(name = "name")
    private String name;

    public SubWorkflowCycle() {
    }

    public SubWorkflowCycle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
