package org.chris.jpa.service;

import org.chris.jpa.entities.SubWorkflowCycle;
import org.chris.jpa.entities.Workflow;
import org.chris.jpa.repository.WorkflowRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class WorkflowService {

    private static final Logger LOG = LoggerFactory.getLogger(WorkflowService.class);
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

    @Scheduled(fixedDelay = 1000)
    public void scheduledOne() throws Exception {
        LOG.info("Starting job 1");
        Thread.sleep(3000);
        LOG.info("Finished job 1");

    }

    @Scheduled(fixedDelay = 1000)
    public void scheduledTwo() throws Exception {
        LOG.info("Starting job 2");
        Thread.sleep(2500);
        LOG.info("Finished job 2");

    }
}
