DROP TABLE cis24239518.Crime;

Create table cis24239518.Crime (
CrimeID char(9),
CrimeType varchar(40),
DateOfCrime date,
Outcome varchar(40),
ReportedBy varchar(30),
OutcomeType varchar(40),
SuspectID char(9),
LegislationID char(9),
primary key (CrimeID)
);

insert into cis24239518.Crime (CrimeID, CrimeType, DateOfCrime, Outcome, ReportedBy, OutcomeType, SuspectID, LegislationID)
values('cri111111','Violence and sexual offences','2017-08-30','Suspect arrested','Lancashire Constabulary','Suspect charged','sus111111','leg111112');

insert into cis24239518.Crime (CrimeID, CrimeType, DateOfCrime, Outcome, ReportedBy, OutcomeType, SuspectID)
values('cri111112','Anti-social behaviour','2017-08-30','Nothing found - no further action','Lancashire Constabulary','Unable to prosecute suspect','sus111112');

insert into cis24239518.Crime (CrimeID, CrimeType, DateOfCrime, Outcome, ReportedBy, OutcomeType, SuspectID, LegislationID)
values('cri111113','Bicycle theft','2017-09-30','Offender given penalty notice','Lancashire Constabulary','Suspect charged','sus111113','leg111113');

insert into cis24239518.Crime (CrimeID, CrimeType, DateOfCrime, Outcome, ReportedBy, OutcomeType, SuspectID)
values('cri111114','Other theft','2017-08-30','Local resolution','Lancashire Constabulary','Unable to prosecute suspect','sus111114');

insert into cis24239518.Crime (CrimeID, CrimeType, DateOfCrime, Outcome, ReportedBy, OutcomeType, SuspectID)
values('cri111115','Public order','2017-08-30','Nothing found - no further action','Lancashire Constabulary','Unable to prosecute suspect','sus111115');

insert into cis24239518.Crime (CrimeID, CrimeType, DateOfCrime, Outcome, ReportedBy, OutcomeType, SuspectID, LegislationID)
values('cri111116','Vehicle crime','2017-09-30','Suspect arrested','Lancashire Constabulary','Suspect charged','sus111116','leg111113');

insert into cis24239518.Crime (CrimeID, CrimeType, DateOfCrime, Outcome, ReportedBy, OutcomeType, SuspectID, LegislationID)
values('cri111117','Other crime','2017-09-30','Suspect arrested','Lancashire Constabulary','Suspect charged','sus111117','leg111112');

insert into cis24239518.Crime (CrimeID, CrimeType, DateOfCrime, Outcome, ReportedBy, OutcomeType, SuspectID, LegislationID)
values('cri111118','Violence and sexual offences','2017-09-30','Suspect arrested','Lancashire Constabulary','Suspect charged','sus111118','leg111111');

insert into cis24239518.Crime (CrimeID, CrimeType, DateOfCrime, Outcome, ReportedBy, OutcomeType, SuspectID)
values('cri111119','Burglary','2017-09-30','Nothing found - no further action','Lancashire Constabulary','Unable to prosecute suspect','sus111119');

insert into cis24239518.Crime (CrimeID, CrimeType, DateOfCrime, Outcome, ReportedBy, OutcomeType, SuspectID, LegislationID)
values('cri111120','Criminal damage and arson','2017-10-15','Suspect arrested','Lancashire Constabulary','Suspect charged','sus111120','leg111112');