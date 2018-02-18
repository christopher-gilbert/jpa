package org.chris.jpa;

import org.chris.jpa.entities.SubWorkflowCycle;
import org.chris.jpa.entities.Workflow;
import org.chris.jpa.entities.WorkflowCycle;
import org.chris.jpa.repository.WorkflowRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class WorkflowApplication {

    public static void main(String[] args) {
        SpringApplication.run(WorkflowApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(WorkflowRepository repository) {
        return (args) -> {
            Workflow wf = new Workflow();
            SubWorkflowCycle cycle = new SubWorkflowCycle();
            cycle.setProperty("test");
            wf.setCycle(cycle);
            wf.setState("READY");
            repository.save(wf);
        };
    }

}
