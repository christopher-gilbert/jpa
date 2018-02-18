package org.chris.jpa.controller;


import org.chris.jpa.entities.Workflow;
import org.chris.jpa.service.WorkflowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    private static final String template = "Hello, %s!";

    @Autowired
    WorkflowService service;

    @RequestMapping("/workflow")
    public Workflow getWorkflow(@RequestParam(value = "id") Long id) {
        return service.retrieveWorkflow(id);
    }
}