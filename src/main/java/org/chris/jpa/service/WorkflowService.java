package org.chris.jpa.service;

import org.chris.jpa.entities.SubWorkflowCycle;
import org.chris.jpa.entities.Workflow;
import org.chris.jpa.repository.WorkflowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkflowService {

    @Autowired
    WorkflowRepository repository;

    @Autowired
    CycleFactory cycleFactory;

    public Workflow retrieveWorkflow(long id) {
        Workflow result = repository.findOne(id);
        return result;

    }

    public Workflow newWorkflow(String state, String cycleName, String cycleState) {
        Workflow wf = new Workflow(state);
        wf.setCycle(cycleFactory.createCycle(cycleName, cycleState));
        repository.save(wf);
        return wf;
    }
}
