

SELECT Suspect.SuspectID, OutcomeType, Location.LocationID, AgeRange, Gender
FROM cis24239518.Suspect, cis24239518.Crime, cis24239518.Location
where Crime.SuspectID = Suspect.SuspectID
AND Suspect.LocationId = Location.LocationID
AND AgeRange > (SELECT 
            AVG(AgeRange)
        FROM
            cis24239518.Suspect
        )
GROUP BY Suspect.AgeRange;





