SELECT * FROM cis24239518.Suspect, cis24239518.Crime, cis24239518.Search
WHERE  Suspect.SuspectID = Crime.SuspectID
    AND Suspect.SearchID = Search.SearchID
	AND LegislationID = 'leg111112'
    AND AgeRange > (SELECT 
            AVG(AgeRange)
        FROM
            cis24239518.Suspect
        );