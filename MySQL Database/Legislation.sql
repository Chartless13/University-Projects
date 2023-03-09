DROP TABLE cis24239518.Legislation;

Create table cis24239518.Legislation (
LegislationID char(9) not null,
LegislationDescription varchar(60),
primary key (LegislationID)
);

insert into cis24239518.Legislation (LegislationID, LegislationDescription)
values('leg111111','Misuse of Drugs Act 1971 (section 23)');

insert into cis24239518.Legislation (LegislationID, LegislationDescription)
values('leg111112','Police and Criminal Evidence Act 1984 (section 1)');

insert into cis24239518.Legislation (LegislationID, LegislationDescription)
values('leg111113','Criminal Justice and Public Order Act 1994 (section 60)');

Select * From cis24239518.Legislation;