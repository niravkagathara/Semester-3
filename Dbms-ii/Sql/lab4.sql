--1
create function h()
returns varchar(100)
as 
begin
 declare @h1 varchar(100);
 set @h1='hello world';
 return @h1;
 end;

 select dbo.h()
 
 --2
 alter function addi(@num1 int,@num2 int)
 returns int 
 as 
 begin 
  declare @num3 int;
	set @num3=@num1+@num2;
	return @num3;
	end;

select dbo.addi(4,5)

--3
create function cube(@num int)
returns int
as 
begin 
 declare @ans int
 set @ans=@num*@num*@num;
 return @ans
 end
  
  select dbo.cube(3)

  --4
  create function oddeven(@num int)
  returns varchar(100)
  as 
  begin
  declare @ans varchar(100)
   
	if(@num%2=0)
		set @ans='num is even'
	else 
		set @ans='num is even'
	return @ans
	end

select dbo.oddeven(4)

--5
create function compare(@num1 int ,@num2 int)
returns varchar(100)
as
begin 
declare @ans varchar(100)
 set @ans =case
			when @num1>@num2 then cast(@num1 as varchar) + 'is grater than ' +convert(varchar ,@num2)
			when @num1<@num2 then cast(@num1 as varchar) + 'is less than '+ convert(varchar ,@num2)
		else 'both are same '
			end
			return @ans
end
select dbo.compare(2,3)

--6
alter function one_to(@num int)
returns nvarchar(1000)
as 
begin
 declare @i int;
 set @i=1;
 declare @ans nvarchar(1000)
 set @ans=''

 while @i<=@num
	begin 
	set @ans=@ans+cast(@i as varchar(100))+','
	set @i=@i+1
	end 
	return @ans
	END

select dbo.one_to(50)


--7
-- SUM OF EVEN FROM 1 TO 20

alter function ADD_(@n int)
returns int

as begin
	declare @SUM int = 0;
	declare @i int;
	set @i = 1
while(@i<=@n)
	begin 

	if(@i%2 = 0)
		set @sum = @sum+@i
	set @i = @i + 1;
	end
	return @sum;
end

select dbo.add_(20)


-- prime number

create function primeNUmber(@n int)
returns varchar(20)

as begin
	declare @ans varchar(20);
	declare @count int = 0;
	declare @i int;
	set @i = 1
while(@i<=@n)
	begin 
	if(@n%@i = 0) 
	begin
		set @count = @count+1;
	end
	set @i = @i + 1;
	end
	if(@count = 2)
		set @ans = 'IS Prime';
	else
		set @ans = 'IS not Prime';

	return @ans
end

select dbo. primeNUmber(7)

-- date diff

alter function dateNuDiff(@start datetime, @end datetime)
returns int

as begin

return DateDiff(day, @start, @end);

end 

select dbo.dateNuDiff(2023-12-30, 2023-12-15)


-- year and month diff

create Function fun_countdays(@month int , @year int)
returns int
as
begin
declare @diff int
declare @x date
declare @end date
set @x=DATEFROMPARTS(@year,@month,'01')
set @end=EOMONTH(@x)
set @diff=DATEDIFF(day,@x,@end)
return @diff+1
end

select dbo.fun_countdays(11,2023)



-- Table Valued Functions 

--1

create function get_personByB()

returns table
as
	return (select * from Person
			where FirstName like 'B%')

select * from get_personByB()


--2

create function get_personByUnique()

returns table
as 
	return (select distinct FirstName from person)

select *  from get_personByUnique()

--3

create function get_personDetailByDeptID(@DeptID int)

returns table
as
	return(select * from person
			where DepartmentID = @deptID)

select *  from get_personDetailByDeptID(2)
