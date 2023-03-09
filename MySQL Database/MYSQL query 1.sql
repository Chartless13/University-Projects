SELECT Suspect.SuspectID, CrimeID, LegislationID, Search.SearchID, ObjectOfSearch, Location.LocationId, Location, AgeRange, Gender
 FROM cis24239518.Suspect
 INNER Join cis24239518.Search ON Suspect.SearchID = Search.SearchID
 INNER JOIN cis24239518.Location ON Location.LocationId = Suspect.LocationID
 LEFT OUTER JOIN cis24239518.Crime ON Suspect.SuspectID = Crime.SuspectID
 Where Location = 'On or near Stone Hill Drive'
 AND AgeRange > (Select
				avg(AgeRange)
                From cis24239518.Suspect);