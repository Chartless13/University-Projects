Select * From cis24239518.Crime;
update cis24239518.Crime, cis24239518.Suspect, cis24239518.Search
set DateOfCrime = '2017-10-18'
where Crime.SuspectID = Suspect.SuspectID
AND Suspect.SearchID = Search.SearchID 
AND ObjectOfSearch = 'Firearms';
Select * From cis24239518.Crime;