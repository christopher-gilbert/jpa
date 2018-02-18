create table workflow (
id number,
state varchar(50),
cycle_id number
);

create table workflow_cycle (
id number,
);

create table sub_workflow_cycle (
id number,
name varchar(50)
);

create table sub_sub_workflow_cycle (
id number,
state varchar(50)
);
