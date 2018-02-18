package org.chris.jpa.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "sub_workflow_cycle")
@PrimaryKeyJoinColumn(name = "id")
public class SubWorkflowCycle extends WorkflowCycle {

    @Column(name = "property")
    private String property;

    public SubWorkflowCycle() {
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }
}
