CREATE DATABASE Customers_info
CREATE TABLE Customers(
Customer_id	Int	Primary Key,
Customer_Name	Varchar(250) Not Null,
Email Varchar(50) Unique)

CREATE TABLE Orders
(
Order_id	Int	Primary Key,
Customer_id	Int	REFERENCES Customers(Customer_id) ,
Order_date	date	Not Null
)


---1
	declare @val1 int ;
	declare @val2 int;
	set @val1=10;
	set @val2=0;

	begin try 
		select @val1/@val2
	end try

	begin catch
		select 'Error occur that is'+ERROR_MESSAGE() as Error
	end catch



--2

declare @Str varchar(50) ;

begin try
	set @Str='hello'
	set @Str=cast(@Str as int)
end try


begin catch
		select 'Error occur that is'+ERROR_MESSAGE() as Error
end catch






---3
create proc Pr_sum
@num int,
@num2 varchar(50)

as
begin
begin try 
	Print @num+@num2
end try


begin catch
	select 
		ERROR_LINE() as ErrorLine,
		ERROR_NUMBER() as ErrorNumber,
		ERROR_MESSAGE() as ErrorMess,
		ERROR_STATE() as ErrorState,
		ERROR_PROCEDURE() as ErrorProce,
		ERROR_SEVERITY() as ErrorSeverity
end catch
end


exec Pr_sum 10,'pratham'


---4
create proc Pr_Primer
@Customer_id int,
@Customer_Name varchar(250),
@Email varchar(50)
as
begin
begin try 
	insert into Customers values(@Customer_id,@Customer_Name,@Email)
end try


begin catch
	select 
		ERROR_LINE() as ErrorLine,
		ERROR_NUMBER() as ErrorNumber,
		ERROR_MESSAGE() as ErrorMess,
		ERROR_STATE() as ErrorState,
		ERROR_PROCEDURE() as ErrorProce,
		ERROR_SEVERITY() as ErrorSeverity
end catch
end

exec Pr_Primer 1,'pratham','pratham@maile.com'
exec Pr_Primer 1,'preyarsh','pratham@maile.com'


--5
create proc Pr_custom
@Customer_id int

as
begin
	if exists (select * from Customers where Customer_id=@Customer_id)
		print('Error like  Customer_id is available in database')
	else
		throw 50001,'Error like no Customer_id is available in database',1
end

exec Pr_custom 8


---7

create proc Pr_invalid
@Customer_id int,
@Customer_Name varchar(250),
@Email varchar(50)

as
begin
	if @Customer_id>0
	insert into Customers values(@Customer_id,@Customer_Name,@Email)
	else
		throw 50002,'Error like no Customer_id is invalid ',1
end
exec Pr_invalid -1,'Preyarsh','Pretyfdsghf@maile.com'


-------6
create proc Pr_Foreign
@Order_id int,
@Customer_id int,
@Order_date date

as
begin
begin try 
	insert into Orders values(@Order_id,@Customer_id,@Order_date)
end try


begin catch
	Print 'Foreign key Violation: No Customer_id is not available in database'
end catch
end
exec  Pr_Foreign 1,1,'1-May-2023'
exec  Pr_Foreign 1,10,'1-May-2023'