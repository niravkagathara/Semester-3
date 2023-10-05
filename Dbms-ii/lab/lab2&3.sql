

---------------------------LAB2&LAB3
---lab2

--1
--insert all data in all table
--insert person
create procedure per_insert
@FirstName Varchar (100),
@LastName Varchar (100),
@Salary Decimal (8,2),
@JoiningDate Datetime,
@DepartmentID Int,
@DesignationID Int

as insert into Person
values
(@FirstName,@LastName,@Salary,@JoiningDate,@DepartmentID,@DesignationID)


exec per_insert 'Rahul' ,'Anshu', 56000,'01-01-1990' ,1, 12
exec per_insert 'Hardik' ,'Hinsu', 18000,'1990-09-25' ,2, 11
exec per_insert 'Bhavin' ,'Kamani', 25000,'1991-05-14' ,NULL, 11
exec per_insert 'Bhoomi' ,'Patel', 39000,'2014-02-20' ,1, 13
exec per_insert 'Rohit' ,'Rajgor', 17000,'1990-07-23' ,2, 15
exec per_insert 'Priya' ,'Mehta', 25000,'1990-10-18' ,2, NULL
exec per_insert 'Neha' ,'Trivedi', 18000,'2014-02-20' ,3, 15

--insert department
create procedure dep_insert

@DepartmentName Varchar (100)

as insert into Department
values
(@DepartmentName)


 exec dep_insert 'Admin'
 exec dep_insert 'IT'
exec dep_insert 'HR'
exec dep_insert 'Account'

--insert designation

create procedure desi_insert

@DesignationName Varchar (100)

as insert into Designation
values
(@DesignationName)


 exec desi_insert 'Jobber'
 exec desi_insert 'Welder'
 exec desi_insert 'Clerk'
 exec desi_insert 'Manager'
 exec desi_insert 'Ceo'



--2
--update person
create procedure per_update
@WorkerID int,
@FirstName Varchar (100),
@LastName Varchar (100),
@Salary Decimal (8,2),
@JoiningDate Datetime,
@DepartmentID Int,
@DesignationID Int

as
update Person
set
FirstName=@FirstName,
LastName=@LastName,
Salary=@Salary,
JoiningDate=@JoiningDate,
DepartmentID=@DepartmentID,
DesignationID=@DesignationID

where
WorkerID=@WorkerID 

--update department
create procedure dep_upadte

@DepartmentName Varchar (100),
@DepartmentID int
as
update Department
set
DepartmentName=@DepartmentName
where
DepartmentID=@DepartmentID

--update designation 
create procedure desi_upadte

@DesignationName Varchar (100),

@DesignationID int
as
update Designation
set
DesignationName=@DesignationName
where
DesignationID=@DesignationID


--3
--delete person
create procedure per_delete
 @WorkerID int
as
delete from Person
where WorkerID=@WorkerID

--delete departmant
create procedure dep_delete
@DepartmentID int
as
delete from Department
where DepartmentID=@DepartmentID
end

--delete designation 
create procedure desi_delete
@DesignationID int
as
delete from Designation 
	where designationid = @designationid
end
--
------------------------------------Stored Procedures (Lab – 2)
--1.	All tables Insert
--a.	Insert into Department table
CREATE PROCEDURE PR_Department_Insert
	@DepartmentID 	int,
	@DepartmentName 	varchar(100)
AS
BEGIN
INSERT INTO Department
	(
		DepartmentID,
		DepartmentName
	)
VALUES
	(
		@DepartmentID,
		@DepartmentName
	)
END
--b.	Insert into Designation table
CREATE PROCEDURE PR_Designation_Insert
	@DesignationID 	int,
	@DesignationName 	varchar(100)
AS
BEGIN
INSERT INTO Designation
	(
		DesignationID,
		DesignationName
	)
VALUES
	(
		@DesignationID,
		@DesignationName
	)
END
--c.	Insert into Person table
CREATE PROCEDURE PR_PERSON_Insert
	@FirstName 	varchar(50),
	@LastName 	varchar(50),
	@Salary 	decimal(8,2),
	@JoiningDate 		datetime,
	@DepartmentID 	int,
	@DesignationID 	int
AS
BEGIN
INSERT INTO Person
	(
		FirstName,
		LastName,
		Salary,
		JoiningDate,
		DepartmentID,
		DesignationID 
	)
VALUES
	(
		@FirstName,
		@LastName,
		@Salary ,
		@JoiningDate ,
		@DepartmentID ,
		@DesignationID 
	)
END
--2.	All tables Update 
--a.	Update Department table
CREATE PROCEDURE PR_Department_Update
	@DepartmentID 	int,
	@DepartmentName 	varchar(100)
AS 
BEGIN
UPDATE Department
SET
		DepartmentName = @DepartmentName
WHERE DepartmentID = @DepartmentID
END
--b.	Update Designation table
CREATE PROCEDURE PR_Designation_Update
	@DesignationID 	int,
	@DesignationName 	varchar(100)
AS 
BEGIN
UPDATE Designation
SET
		DesignationName = @DesignationName
WHERE DesignationID = @DesignationID
END
--c.	Update Person table
CREATE PROCEDURE PR_Person_Update
	@WorkerID 		int,
	@FirstName 		varchar(100),
	@LastName 		varchar(100),
	@Salary 		decimal(8,2),
	@JoiningDate 		datetime,
	@DepartmentID 	int,
	@DesignationID 	int
AS 
BEGIN
UPDATE Person
SET
		FirstName = @FirstName,
		LastName = @LastName,
		Salary = @Salary,
		JoiningDate = @JoiningDate,
		DepartmentID = @DepartmentID,
		DesignationID = @DesignationID
WHERE WorkerID = @WorkerID
END
--3.	All tables Delete
--a.	Delete from Department table
CREATE PROCEDURE PR_Department_Delete
	@DepartmentID 	int
AS 
BEGIN
DELETE FROM Department
	WHERE DepartmentID = @DepartmentID
END
--b.	Delete from Designation table
CREATE PROCEDURE PR_Designation_Delete
	@DesignationID 	int
AS 
BEGIN
	DELETE FROM Designation
	WHERE DesignationID = @DesignationID
END
c.	Delete from Person table
CREATE PROCEDURE PR_Person_Delete
@WorkerID 	int
AS 
BEGIN
	DELETE FROM Person
	WHERE WorkerID = @WorkerID
END
--4.	All tables SelectPK
--a.	Select from Department table by Primary key
CREATE PROCEDURE PR_Department_SelectPK
@DepartmentID 	int
AS 
BEGIN
SELECT
		DepartmentID,
		DepartmentName
FROM	Department
WHERE DepartmentID = @DepartmentID
END
--b.	Select from Designation table by Primary key
CREATE PROCEDURE PR_Designation_SelectPK
	@DesignationID 	int
AS 
BEGIN
	SELECT
		DesignationID,
		DesignationName
	FROM	Designation
	WHERE DesignationID = @DesignationID
END
--c.	Select from Person table by Primary key
CREATE PROCEDURE PR_Person_SelectPK
	@WorkerID 	int
AS 
BEGIN
SELECT
		WorkerID,
		FirstName,
		LastName,
		Salary,
		JoiningDate,
		DepartmentID,
		DesignationID
FROM	Person
WHERE WorkerID = @WorkerID
END
--5.	All tables SelectAll (If foreign key is available than do join and take columns on select list)
--a.	Select All from Department table
CREATE PROCEDURE PR_Department_SelectAll
AS
BEGIN
	SELECT DepartmentID, DepartmentName 
	FROM Department
END
--b.	Select All from Designation table
CREATE PROCEDURE PR_Designation_SelectAll
AS
BEGIN
	SELECT DesignationID, DesignationName 
	FROM Designation
END
--c.	Select All from Person table
CREATE PROCEDURE PR_Person_SelectAll
AS
BEGIN
SELECT 
		Person.WorkerID,
		Person.FirstName,
		Person.LastName,
		Person.Salary,
		Person.JoiningDate,
		Department.DepartmentName,
		Designation.DesignationName
	FROM Person 
	LEFT OUTER JOIN Department 
	ON Person.DepartmentID=Department.DepartmentID 
	LEFT OUTER JOIN Designation
	ON Person.DesignationID=Designation.DesignationID
END
--Stored Procedures (Lab – 3)
--1.	Create Procedure that show detail of first 3 persons.
CREATE PROCEDURE PR_SelectFirstThree_Person
	AS
	BEGIN
		SELECT TOP 3 
			Person.WorkerID,
	 		Person.FirstName,
	 		Person.LastName,
	 		Person.Salary,
	 		Person.JoiningDate,
	 		Department.DepartmentName,
	 		Designation.DesignationName
		FROM Person
		LEFT OUTER JOIN Department
		ON Person.DepartmentID=Department.DepartmentID
		LEFT OUTER JOIN Designation
		ON Person.DesignationID=Designation.DesignationID
END
--2.	Create Procedure that takes department dame as input and returns a table with all workers working in that department.
CREATE PROCEDURE PR_Person_SelectByDepartmentName
@DepartmentName	varchar(50)
AS
BEGIN
	SELECT 
		Person.FirstName,
		Department.DepartmentName
	FROM Person
	LEFT OUTER JOIN Department
	ON Person.DepartmentID=Department.DepartmentID 
	WHERE Department.DepartmentName=@DepartmentName
END
--3.	Create Procedure that takes department name & designation name as input and returns a table with worker’s first name, salary, joining date & department name.
CREATE PROCEDURE PR_Person_SelectByDesignationNameDepartmentName
@DepartmentName 	varchar(200),
	@DesignationName 	varchar(250)
AS
BEGIN
SELECT 
	 	Person.FirstName,
	 	Person.Salary,
		Person.JoiningDate,
		Department.DepartmentName
FROM Person 
LEFT OUTER JOIN Department
ON Department.DepartmentID = Person.DepartmentID
LEFT OUTER JOIN Designation
ON Designation.DesignationID = Person.DesignationID
WHERE DesignationName = @DesignationName
AND DepartmentName = @DepartmentName
END
--4.	Create Procedure that takes first name as an input parameter and display all the details of the worker with their department & designation name.
CREATE PROCEDURE PR_Person_SelectByFirstName
@FirstName 	varchar(200)
AS
BEGIN
SELECT 
	 	Person.WorkerID,
	 	Person.FirstName,
	 	Person.LastName,
	 	Person.Salary,
	 	Person.JoiningDate,
	 	Department.DepartmentName,
	 	Designation.DesignationName
FROM Person 
LEFT OUTER JOIN Department
ON Department.DepartmentID = Person.DepartmentID
LEFT OUTER JOIN Designation
ON Designation.DesignationID = Person.DesignationID
WHERE FirstName = @FirstName
END
--5.	Create Procedure which displays department wise maximum, minimum & total salaries.
CREATE PROCEDURE PR_Person_MaxMinTotalSalary_DepartmentWise
AS
BEGIN
SELECT 
		Department.DepartmentName,
	 	MAX(Person.salary) as MaxSalary,
	 	MIN(Person.salary) as MinSalary,
SUM(Person.salary) as TotalSalary
FROM Person 
INNER JOIN Department
ON Department.DepartmentID = Person.DepartmentID
GROUP BY Department.DepartmentName
END
--6.	Create Procedure which displays designation wise maximum, minimum & total salaries.
CREATE PROCEDURE PR_Person_MaxMinTotalSalary_DesignationWise
AS
BEGIN
SELECT 
		Designation.DesignationName,
	 	MAX(Person.salary) as MaxSalary,
	 	MIN(Person.salary) as MinSalary,
		SUM(Person.salary) as TotalSalary
FROM Person 
INNER JOIN Designation
ON Designation.DesignationID = Person.DesignationID
GROUP BY Designation.DesignationName
END

