package org.chris.jpa.service;

import org.chris.jpa.entities.SubSubWorkflowCycle;
import org.chris.jpa.entities.SubWorkflowCycle;
import org.chris.jpa.entities.WorkflowCycle;
import org.springframework.stereotype.Component;

@Component
public class CycleFactory {

    public WorkflowCycle createCycle(String cycleName, String cycleState) {
        if (cycleState != null) {
            return new SubSubWorkflowCycle(cycleState, cycleName);
        } else if (cycleName != null) {
            return new SubWorkflowCycle(cycleName);
        }
        else {
            return new WorkflowCycle();
        }

    }
}
