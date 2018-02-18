package org.chris.jpa.service;

import org.chris.jpa.entities.Workflow;
import org.chris.jpa.repository.WorkflowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkflowService {

    @Autowired
    WorkflowRepository repository;

    public Workflow retrieveWorkflow(long id) {
        Workflow result =  repository.findOne(id);
        return result;

    }
}
