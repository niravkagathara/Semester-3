

-----------------------------------lab 7
create database  Product_Info


CREATE TABLE Product_Info
(
Product_id	Int	Primary Key,
Product_Name Varchar(250) Not Null,
Price Decimal(10,2)	Not Null
)
CREATE TABLE NewProducts
(
Product_id	Int	Primary Key,
Product_Name Varchar(250) Not Null,
Price Decimal(10,2)	Not Null
)
INSERT INTO Product_Info VALUES(1,'Smatphone',35000);
INSERT INTO Product_Info VALUES(2,'Laptop',65000);
INSERT INTO Product_Info VALUES(3,'Headphones',5500);
INSERT INTO Product_Info VALUES(4,'Television',85000);
INSERT INTO Product_Info VALUES(5,'Gaming Console',32000);

--1
declare 
       @product_id as int,
	   @product_name as varchar(250),
	   @price as decimal(10,2)
	   declare cursor_product1 cursor
	   for select
	     product_id,
		 product_name,
		 price

		  from

		       product_info
			   open cursor_product1
			   fetch next from cursor_product1 into
			    @product_id,
		        @product_name,
		        @price

				while @@fetch_status=0
				begin
				select @product_id,@product_name,@price
				fetch next from cursor_product1 into

				 @product_id,
		        @product_name,
		        @price

				end
				close  cursor_product1
				deallocate  cursor_product1
--2
declare
       @product_id as int,

	   @product_name as varchar(250)
	   declare cursor_product2 cursor
	   for select
	     product_id,
		 product_name

		  from
		       product_info
			   open cursor_product2
			   fetch next from cursor_product2 into

			    @product_id,
		        @product_name
				while @@fetch_status=0
				begin
			print cast (@product_id as varchar(250))+'_'+@product_name
				fetch next from cursor_product2  into
				 @product_id,
		        @product_name
		   
				end
				close  cursor_product2
				deallocate  cursor_product2
--3

declare
       @product_id as int
	   declare cursor_product3 cursor
	   for select
	     product_id
		  from
		       product_info
			   open cursor_product3
			   fetch next from cursor_product3 into
			    @product_id
				while @@fetch_status=0
				begin
		delete from Product_Info
		where product_id=@product_id
				fetch next from cursor_product3  into
				 @product_id
				end
				close  cursor_product3
     			deallocate  cursor_product3
				select*from nEWProducts

--4

declare
       @product_id as int,
	   @product_name as varchar(250),
	   @price as decimal(10,2)
	   declare cursor_product4 cursor
	   for select
	     product_id,
		 product_name,
		 price
		  from
		       product_info
			   open cursor_product4
				fetch next from cursor_product4 into
			    @product_id,
		        @product_name,
		        @price
				while @@fetch_status=0
				begin
				update product_info set price = 1.1*@price
				where product_id = @product_id 
				fetch next from cursor_product4 into
				 @product_id,
		        @product_name,
		        @price
				end
				close  cursor_product4
				deallocate  cursor_product4 
--5

declare
       @product_id as int,
	   @product_name as varchar(250),
	   @price as decimal(10,2)
	   declare cursor_product5 cursor
	   for select
	     product_id,
		 product_name,
		 price
		  from
		       product_info
			   open cursor_product5
			   fetch next from cursor_product5 into
			    @product_id,
		        @product_name,
		        @price
				while @@fetch_status=0
				begin
				if(@product_name ='Laptop')
				begin
				insert into newproducts
				values (@product_id,@product_name,@price)
				end
				fetch next from cursor_product5 into
				 @product_id,
		        @product_name,
		        @price
				end
				close  cursor_product5
				deallocate  cursor_product5

