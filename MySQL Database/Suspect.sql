DROP TABLE cis24239518.Suspect;

Create table cis24239518.Suspect (
Gender enum('Male', 'Female'),
AgeRange int(3),
SelfDefinedEthnicity varchar(60),
OfficerDefinedEthnicity varchar(50),
LastOutcomeCatagory varchar(50),
SuspectID char(9) not null,
SearchID char(9),
LocationID char(9),
primary key (SuspectID)
); 

insert into cis24239518.Suspect (Gender, AgeRange, SelfDefinedEthnicity, OfficerDefinedEthnicity, LastOutcomeCatagory, SuspectID, SearchID, LocationID)
values('Male','25','White - English/Welsh/Scottish/Northern Irish/British','Asian','Suspect charged','sus111111','Sea111111','loc111111');

insert into cis24239518.Suspect (Gender, AgeRange, SelfDefinedEthnicity, OfficerDefinedEthnicity, LastOutcomeCatagory, SuspectID, SearchID, LocationID)
values('Male','18','White - English/Welsh/Scottish/Northern Irish/British','White','Investigation complete; no suspect identified','sus111112','Sea111112','loc111112');

insert into cis24239518.Suspect (Gender, AgeRange, SelfDefinedEthnicity, OfficerDefinedEthnicity, LastOutcomeCatagory, SuspectID, SearchID, LocationID)
values('Male','40','White - English/Welsh/Scottish/Northern Irish/British','White','Suspect charged','sus111113','Sea111113','loc111113');

insert into cis24239518.Suspect (Gender, AgeRange, SelfDefinedEthnicity, OfficerDefinedEthnicity, LastOutcomeCatagory, SuspectID, SearchID, LocationID)
values('Female','27','Asian/Asian British - Pakistani','Asian','Awaiting court outcome','sus111114','Sea111114','loc111114');

insert into cis24239518.Suspect (Gender, AgeRange, SelfDefinedEthnicity, OfficerDefinedEthnicity, LastOutcomeCatagory, SuspectID, SearchID, LocationID)
values('Male','39','White - English/Welsh/Scottish/Northern Irish/British','White','Unable to prosecute suspect','sus111115','Sea111115','loc111115');

insert into cis24239518.Suspect (Gender, AgeRange, SelfDefinedEthnicity, OfficerDefinedEthnicity, LastOutcomeCatagory, SuspectID, SearchID, LocationID)
values('Female','25','Asian/Asian British - Pakistani','White','Suspect charged','sus111116','Sea111116','loc111116');

insert into cis24239518.Suspect (Gender, AgeRange, SelfDefinedEthnicity, OfficerDefinedEthnicity, LastOutcomeCatagory, SuspectID, SearchID, LocationID)
values('Female','38','Asian/Asian British - Pakistani','Asian','Suspect charged','sus111117','Sea111117','loc111117');

insert into cis24239518.Suspect (Gender, AgeRange, SelfDefinedEthnicity, OfficerDefinedEthnicity, LastOutcomeCatagory, SuspectID, SearchID, LocationID)
values('Female','37','White - English/Welsh/Scottish/Northern Irish/British','Asian','Suspect charged','sus111118','Sea111118','loc111118');

insert into cis24239518.Suspect (Gender, AgeRange, SelfDefinedEthnicity, OfficerDefinedEthnicity, LastOutcomeCatagory, SuspectID, SearchID, LocationID)
values('Male','50','White - English/Welsh/Scottish/Northern Irish/British','White','Unable to prosecute suspect','sus111119','Sea111119','loc111119');

insert into cis24239518.Suspect (Gender, AgeRange, SelfDefinedEthnicity, OfficerDefinedEthnicity, LastOutcomeCatagory, SuspectID, SearchID, LocationID)
values('Female','21','White - English/Welsh/Scottish/Northern Irish/British','White','Suspect charged','sus111120','Sea111120','loc111120');