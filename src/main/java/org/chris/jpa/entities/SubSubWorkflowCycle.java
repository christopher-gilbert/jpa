package org.chris.jpa.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "sub_sub_workflow_cycle")
@PrimaryKeyJoinColumn(name = "id")
public class SubSubWorkflowCycle extends SubWorkflowCycle {

    @Column(name = "state")
    private String state;

    public SubSubWorkflowCycle() {
    }
    public SubSubWorkflowCycle(String state, String name) {
        super(name);
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
