create table workflow (
id number,
state varchar(50),
cycle_id number
);

create table workflow_cycle (
id number,
type varchar(50)
);

create table sub_workflow_cycle (
id number,
property varchar(50)
);

create table sub_sub_workflow_cycle (
id number,
other_property varchar(50)
);
