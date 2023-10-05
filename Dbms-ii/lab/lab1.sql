
--lab 1
INSERT INTO PERSON
VALUES
(101, 'Rahul Tripathi', 2, 56000, '2000-01-01', 'Rajkot'),
(102, 'Hardik Pandya', 3, 18000, '2001-09-25', 'Ahmedabad'),
(103, 'Bhavin Kanani', 4, 25000, '2000-05-14', 'Baroda'),
(104, 'Bhoomi Vaishnav', 1, 39000, '2005-02-08', 'Rajkot'),
(105, 'Rohit Topiya', 2, 17000, '2001-07-23', 'Jamnagar'),
(106, 'Priya Menpara', NULL, 9000, '2000-10-18', 'Ahmedabad'),
(107, 'Neha Sharma', 2, 34000, '2002-12-25', 'Rajkot'),
(108, 'Nayan Goswami', 3, 25000, '2001-07-01', 'Rajkot'),
(109, 'Mehul Bhundiya', 4, 13500, '2005-01-09', 'Baroda'),
(110, 'Mohit Maru', 5, 14000, '2000-05-25', 'Jamnagar')


INSERT INTO DEPARTMENT
VALUES
(1, 'Admin', 'Adm', 'A-Block'),
(2, 'Computer', 'CE', 'C-Block'),
(3, 'Civil', 'CI', 'G-Block'),
(4, 'Electrical', 'EE', 'E-Block'),
(5, 'Mechanical', 'ME', 'B-Block');


--1
SELECT PersonName , DepartmentName , DepartmentCode FROM PERSON
INNER JOIN DEPARTMENT
ON PERSON.DepartmentID = DEPARTMENT.DepartmentID 

--2
SELECT PersonName FROM PERSON
INNER JOIN DEPARTMENT
ON PERSON.DepartmentID = DEPARTMENT.DepartmentID
WHERE LOCATION = 'C-Block' 
 
--3
SELECT PersonName , Salary , DepartmentName FROM PERSON
INNER JOIN DEPARTMENT
ON PERSON.DepartmentID = DEPARTMENT.DepartmentID	WHERE City = 'Jamnagar' 

--4
SELECT PersonName , Salary , DepartmentName FROM PERSON
INNER JOIN DEPARTMENT
ON PERSON.DepartmentID = DEPARTMENT.DepartmentID
WHERE City <> 'Rajkot'
--5
SELECT * FROM PERSON
FULL OUTER JOIN DEPARTMENT ON PERSON.DepartmentID = DEPARTMENT.DepartmentID
WHERE DepartmentName = 'Computer'

--6.
SELECT PersonName FROM PERSON
FULL OUTER JOIN DEPARTMENT
ON PERSON.DepartmentID = DEPARTMENT.DepartmentID
WHERE DepartmentName IS NULL

--7
SELECT PersonName FROM PERSON
INNER JOIN DEPARTMENT
ON PERSON.DepartmentID = DEPARTMENT.DepartmentID
WHERE JoiningDate > 01-08-2001

--8.

SELECT PersonName , DepartmentName FROM PERSON
INNER JOIN DEPARTMENT
ON PERSON.DepartmentID = DEPARTMENT.DepartmentID
WHERE DATEDIFF(day,getdate(),PERSON.JoiningDate)>365;

--9
SELECT count(PersonID)  count ,DepartmentName FROM PERSON
full OUTER JOIN DEPARTMENT  ON PERSON.DepartmentID = DEPARTMENT.DepartmentID
group by DepartmentName;

--10
SELECT max(p.Salary) as maximum,min(p.Salary) as minimum,d.DepartmentName
FROM Person p
full OUTER JOIN Department d ON p.DepartmentID = d.DepartmentID
group by d.DepartmentName;

--11
SELECT max(p.Salary) as maximum,min(p.Salary) as minimum,AVG(p.Salary) as average,sum(p.Salary) as Total ,p.City
FROM Person p
full OUTER JOIN Department d ON p.DepartmentID = d.DepartmentID
group by p.City;

--12
SELECT count(p.PersonID) ,d.DepartmentName FROM Person p
full OUTER JOIN Department d ON p.DepartmentID = d.DepartmentID
where p.Salary>10000
group by d.DepartmentName;

Select * from Person

--13.
select AVG(p.Salary) from Person p
	group by p.City
	having p.City = 'Ahmedabad'

--14.
select d.DepartmentName from Person p
	right outer join Department d
	on p.DepartmentId = d.DepartmentId
	where d.DepartmentId is null


--15.
select d.DepartmentName from Person p
	right outer join Department d
	on p.DepartmentId = d.DepartmentId
	group by DepartmentName
	having COUNT(p.PersonName) > 2

--16. 
select p.PersonName + ' lives in ' + p.City + ' and works in' + d.DepartmentName + ' Department.' from Person p
	inner join Department d
	on p.DepartmentId = d.DepartmentId 

--17.	
select p.PersonName + ' earns ' + CONVERT(varchar(100),p.Salary) + ' from department' + d.DepartmentName + ' monthly' from Person p
	inner join Department d
	on p.DepartmentId = d.DepartmentId 
	
--18.	
select SUM(p.Salary),AVG(p.Salary),MAX(p.Salary) from Person p
	full outer join Department d
	on p.DepartmentId = d.DepartmentId
	group by p.City,d.DepartmentName

--19. 
UPDATE Person SET Salary = Salary + Salary*.1
	

