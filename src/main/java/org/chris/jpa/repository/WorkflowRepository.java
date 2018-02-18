package org.chris.jpa.repository;

import org.chris.jpa.entities.Workflow;
import org.springframework.data.repository.CrudRepository;

public interface WorkflowRepository extends CrudRepository<Workflow, Long> {
}
