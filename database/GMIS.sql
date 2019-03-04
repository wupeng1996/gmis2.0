/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2019/3/2 17:11:56                            */
/*==============================================================*/


drop table if exists gradeSheet;

drop table if exists student;

drop table if exists subject;

drop table if exists teacher;

drop table if exists teacherSubject;

/*==============================================================*/
/* Table: gradeSheet                                            */
/*==============================================================*/
create table gradeSheet
(
   id                   varchar(10) not null comment '主键',
   studentId            int(10) comment '学生id',
   teacherSubjectId     int(10) comment '老师学科表id',
   grade                float(10) comment '考试成绩',
   primary key (id)
);

/*==============================================================*/
/* Table: student                                               */
/*==============================================================*/
create table student
(
   id                   int(10) not null comment '主键，自增',
   studentName          varchar(20) comment '学生姓名',
   studentNumber        varchar(20) comment '学生学号',
   primary key (id)
);

/*==============================================================*/
/* Table: subject                                               */
/*==============================================================*/
create table subject
(
   id                   int(10) not null comment '主键',
   subjectName          varchar(50) comment '学科名称',
   subjectNumber        varchar(30) comment '学科编号',
   primary key (id)
);

/*==============================================================*/
/* Table: teacher                                               */
/*==============================================================*/
create table teacher
(
   id                   int(10) not null comment '主键',
   teacherName          varchar(20) comment '姓名',
   teacherNumber        varchar(20) comment '教职工号',
   primary key (id)
);

/*==============================================================*/
/* Table: teacherSubject                                        */
/*==============================================================*/
create table teacherSubject
(
   id                   int(10) not null comment '主键',
   tacherId             int(10) comment '老师id',
   subjectId            int(10) comment '学科id',
   schoolYear           varchar(20) comment '学年',
   primary key (id)
);

