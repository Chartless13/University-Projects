SELECT Suspect.SuspectID, CrimeID, LegislationID, Search.SearchID, ObjectOfSearch, Location.LocationId, Location, AgeRange, Gender
FROM cis24239518.Suspect
Inner Join cis24239518.Search ON Suspect.SearchID =  Search.SearchID
Inner Join cis24239518.Location ON Suspect.LocationID = Location.LocationID
LEFT Outer JOIN cis24239518.Crime ON Suspect.SuspectID = Crime.SuspectID
Where Location = 'On or near Stone Hill Drive'
AND AgeRange > (SELECT 
            AVG(AgeRange)
        FROM
            cis24239518.Suspect
        );
        