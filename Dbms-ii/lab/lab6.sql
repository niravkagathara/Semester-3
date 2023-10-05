
----------lab6 
create database  Person_LogInfo


create table Person 
(PersonID Int ,
PersonName Varchar (100),
Salary Decimal (8,2) ,
JoiningDate Datetime,
City Varchar (100),
Age Int,
BirthDate Datetime,)


create table PersonLog(
PLogID Int ,
PersonID Int ,
PersonName Varchar (250),
Operation Varchar (50),
UpdateDate Datetime ,)

---
/* 1-Create a trigger that fires on INSERT, UPDATE and DELETE operation on the Person table to display a 
message “Record is Affected.” */

create trigger In_Del_Upd_Table
on person
after insert ,delete ,update
as 
begin
print 'record is Affected'
end 

/*2-Create a trigger that fires on INSERT, UPDATE and DELETE operation on the Person table. For that, log 
all operations performed on the person table into PersonLog.*/


-- insert 
create trigger insert_person
on 
person 
after insert 
as 
begin
	declare @pid int ,@pname varchar(100)
	select @pid=PersonID from inserted
	select	@pname=PersonName from inserted
	insert into PersonLog
	values (@pid,@pname,'inserted',GETDATE())
	end



--delete 
alter trigger delete_person
on 
person 
after delete
as 
begin
	declare @pid int ,@pname varchar(100)
	select @pid=PersonID from deleted
	select	@pname=PersonName from deleted
	insert into PersonLog
	values (@pid,@pname,'deleted',GETDATE())
	end

--update

create trigger update_person
on 
person 
after update
as 
begin
	declare @pid int ,@pname varchar(100)
	select @pid=PersonID from inserted
	select	@pname=PersonName from inserted
	insert into PersonLog
	values (@pid,@pname,'update',GETDATE())
	end


/*3. Create an INSTEAD OF trigger that fires on INSERT, UPDATE and DELETE operation on the Person table. 
For that, log all operations performed on the person table into PersonLog*/

--insert

create trigger insert_insteadof_person
on 
person 
instead of insert 
as 
begin
	declare @pid int ,@pname varchar(100)
	select @pid=PersonID from inserted
	select	@pname=PersonName from inserted
	insert into PersonLog
	values (@pid,@pname,'inserted',GETDATE())
	end



--delete 
create trigger delete_insteadof_person
on 
person 
instead of delete
as 
begin
	declare @pid int ,@pname varchar(100)
	select @pid=PersonID from deleted
	select	@pname=PersonName from deleted
	insert into PersonLog
	values (@pid,@pname,'deleted',GETDATE())
	end

--update

create trigger update_insteadof_person
on 
person 
instead of update
as 
begin
	declare @pid int ,@pname varchar(100)
	select @pid=PersonID from inserted
	select	@pname=PersonName from inserted
	insert into PersonLog
	values (@pid,@pname,'update',GETDATE())
	end


	select*from Person
	select*from PersonLog

	insert into Person
	values(103,'nirav',40000,'23-july-06','rajkot',23,'23-may-2005')
/*4. Create a trigger that fires on INSERT operation on the Person table to convert person name into 
uppercase whenever the record is inserted.*/

create trigger uppercase 
on Person
for INSERT 
as
begin 
	declare @pid int, @pname varchar(100)
	select @pid = Personid from inserted
	select @pname = personname from inserted
	update Person
	set Personname = upper(@pname)
	where personid = @pid
	end

/*5. Create a trigger that fires on INSERT operation on person table, which calculates the age and update 
that age in Person table.*/
create trigger ageupdate 
on Person
AFTER update 
as
begin 
	declare @pid int, @dob varchar(100)
	select @pid = Personid from inserted
	select @dob = birthdate from inserted
	update Person
	set age = datediff(year,@dob, getdate())
	end

--6
create trigger deletemessage
on PersonLog
after delete
as begin
print 'record delete sucssefully form pewrsonlog'
end