package org.chris.jpa.service;

import org.chris.jpa.entities.Workflow;
import org.springframework.stereotype.Service;

@Service
public class WorkflowService {

    public Workflow retrieveWorkflow(String id) {
        Workflow result =  new Workflow();
        result.setId(id);
        result.setState("READY");
        return result;

    }
}
