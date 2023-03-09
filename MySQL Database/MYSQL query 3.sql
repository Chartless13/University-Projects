SELECT * FROM cis24239518.Suspect;
DELETE FROM cis24239518.Suspect, cis24239518.Search, cis24239518.Crime
 USING cis24239518.Crime  JOIN cis24239518.Suspect  JOIN cis24239518.Search 
where Crime.SuspectID = Suspect.SuspectID
AND Suspect.SearchID = Search.SearchID 
AND ObjectOfSearch = 'Firearms';
SELECT * FROM cis24239518.Search;
SELECT * FROM cis24239518.Crime;
SELECT * FROM cis24239518.Suspect;