package org.chris.jpa.controller;


import org.chris.jpa.entities.SubWorkflowCycle;
import org.chris.jpa.entities.Workflow;
import org.chris.jpa.service.WorkflowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    private static final String template = "Hello, %s!";

    @Autowired
    WorkflowService service;

    @RequestMapping("/workflow/{id}")
    public Workflow getWorkflow(@PathVariable Long id) {
        return service.retrieveWorkflow(id);
    }

    @RequestMapping("/newWorkflow")
    public Workflow newWorkflow(@RequestParam(value = "state") String state, @RequestParam(value = "cycleName", required = false) String cycleName, @RequestParam(value = "cycleState", required = false) String cycleState) {
        return service.newWorkflow(state, cycleName, cycleState);
    }
}