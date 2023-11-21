INSERT INTO Worker (WorkerId, FirstName, LastName) VALUES (1,'Rosemonde', 'Featherbie');

INSERT INTO Worker (FirstName, LastName) VALUES
 ('Goldie', 'Pero'), ('Mannie', 'Elly'),('pappa','parappa');
 
 INSERT INTO Project (ProjectId, `Name`, DueDate)
 VALUES ('db-milestone', 'Database Material', '2020-12-22');
 
 INSERT INTO Project (ProjectId, `Name`, DueDate)
	VALUES ('kitchen', 'Kitchen Remodel', '2025-07-15'); 
    
INSERT INTO ProjectWorker (ProjectId, WorkerId) VALUES 
    ('db-milestone', 1), -- Rosemonde, Database
    ('kitchen', 2),      -- Kingsly, Kitchen
    ('db-milestone', 3), -- Goldi, Database
    ('db-milestone', 4); -- Dorey, Database
    ;
    
    
    SET SQL_SAFE_UPDATES = 0;

-- Delete Tasks first since Task references ProjectWorker.
DELETE FROM Task
WHERE WorkerId = 2;

-- Delete ProjectWorker next. 
-- That removes Kingsly from all Projects.
DELETE FROM ProjectWorker
WHERE WorkerId = 2;

-- Finally, remove Kingsly.
DELETE FROM Worker
WHERE WorkerId = 2;

SET SQL_SAFE_UPDATES = 1;