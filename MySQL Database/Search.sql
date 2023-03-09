DROP TABLE cis24239518.Search;

Create table cis24239518.Search (
 SearchID char(9) not null,
 ObjectOfSearch char(40),
 OutcomeLinkedToObjectOfSearch bool,
 RemovalOfMoreThanJustOuterClothing bool,
 primary key (SearchID)
 );
 
insert into cis24239518.Search (SearchID, ObjectOfSearch, OutcomeLinkedToObjectOfSearch, RemovalOfMoreThanJustOuterClothing)
values('sea111111','Article for use in theft','0','0');

insert into cis24239518.Search (SearchID, ObjectOfSearch, OutcomeLinkedToObjectOfSearch, RemovalOfMoreThanJustOuterClothing)
values('sea111112','Stolen goods','0','0');

insert into cis24239518.Search (SearchID, ObjectOfSearch, OutcomeLinkedToObjectOfSearch, RemovalOfMoreThanJustOuterClothing)
values('sea111113','Firearms','0','0');

insert into cis24239518.Search (SearchID, ObjectOfSearch, OutcomeLinkedToObjectOfSearch, RemovalOfMoreThanJustOuterClothing)
values('sea111114','Nothing found - no further action','0','0');

insert into cis24239518.Search (SearchID, ObjectOfSearch, OutcomeLinkedToObjectOfSearch, RemovalOfMoreThanJustOuterClothing)
values('sea111115','Nothing found - no further action','0','0');

insert into cis24239518.Search (SearchID, ObjectOfSearch, OutcomeLinkedToObjectOfSearch, RemovalOfMoreThanJustOuterClothing)
values('sea111116','Article for use in theft','1','1');

insert into cis24239518.Search (SearchID, ObjectOfSearch, OutcomeLinkedToObjectOfSearch, RemovalOfMoreThanJustOuterClothing)
values('sea111117','Article for use in theft','1','0');

insert into cis24239518.Search (SearchID, ObjectOfSearch, OutcomeLinkedToObjectOfSearch, RemovalOfMoreThanJustOuterClothing)
values('sea111118','Nothing found - no further action','0','0');

insert into cis24239518.Search (SearchID, ObjectOfSearch, OutcomeLinkedToObjectOfSearch, RemovalOfMoreThanJustOuterClothing)
values('sea111119','Stolen goods','1','1');

insert into cis24239518.Search (SearchID, ObjectOfSearch, OutcomeLinkedToObjectOfSearch, RemovalOfMoreThanJustOuterClothing)
values('sea111120','Nothing found - no further action','0','0');