/* SELECT ALL ROWS */
SELECT * from Exercise;

/* select all rows and columns from the client table */
select * from Client;

/* select all columns from client whre the city is Metairie */
select * from client where city = 'Metairie';

/* select clientId = '818u7faf-7b4b-48a2-bf12-7a26c92de20c' */
SELECT clientId FROM Client WHERE clientId = '818u7faf-7b4b-48a2-bf12-7a26c92de20c';

/* how many rows in Goal table */
select count(*) from goal ;

select name, levelid from  workout;

select name,levelid, notes from workout where LevelId ='2';

select firstName, lastName, city from client where city ='Metairie' OR city='Kenner' OR city='Gretna'
;

select firstname,lastname,city from client where city in ('Metaire', 'Kenner', 'Gretna');

SELECT firstname, lastname, birthdate
FROM client WHERE YEAR(birthdate) = 1980;

select firstname,lastname, birthdate from client where  birthdate between '1980-01-01'  AND '1981-01-01';

select count(emailaddress) from Login where emailaddress like '%.gov';

select count(emailaddress) from Login where emailaddress NOT like '%.com';

select firstname,lastname from client where birthdate is null;

select name from exercisecategory where parentcategoryid is not null;

select name, notes from level where notes like '%workout%';

select firstname, lastname, city from client where (lastname like 'L%' OR lastname = '%M' OR lastname = '%N') AND city = 'LaPlace';

SELECT invoiceid, description, price, quantity, servicedate, (price * quantity) as summation
FROM invoicelineitem
WHERE (price * quantity) BETWEEN 15 AND 25;

select firstname, lastname from client where firstname='Estrella' and lastname ='Bazely';

SELECT WorkoutId FROM Workout WHERE Name = 'This Is Parkour';
-- 12
SELECT GoalId FROM WorkoutGoal WHERE WorkoutId = 12;
-- 3, 8, 15
SELECT Name FROM Goal WHERE GoalId = 8;
-- Muscle Bulk



