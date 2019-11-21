create database FitnFine
go
create schema HumanResources
go
create schema Members
go
create schema Transaction_revenue
go
create schema service_
  go                                  
                                      HUMAN RESOURCES.STAFFDETAILS

create table HumanResources.StaffDetails
(
StaffID int identity (100, 1) ,
Branch_ID int,
FirstName varchar (15) not null,
LastName varchar (15) not null,
Gender varchar (6),
Designation varchar (30) not null,
Address varchar (50) not null,
Phone_Num varchar (20) not null 
)   
go
select *
from HumanResources.StaffDetails
go
-------------------------------------------------------------------------------------------------------------------

alter table HumanResources.StaffDetails
add constraint StaffID_pkk primary key(StaffID)
go
-------------------------------------------------------------------------------------------------------------------
alter table  HumanResources.StaffDetails
add constraint Branch_ID_FK foreign key(Branch_ID)
references HumanResources.StaffDetails
go
--------------------------------------------------------------------------------------------------------------------------------
alter table HumanResources.StaffDetails
add constraint phone_num_ck check(phone_num like 
('[0-9]-[0-9]-[0-9][0-9]-[0-9][0-9][0-9][0-9]-[0-9][0-9][0-9]-[0-9][0-9][0-9]'))
go
------------------------------------------------------------------------------------------------------------------------------------
create rule phonecheck
as @c_phone
like '[0-9]-[0-9]-[0-9][0-9]-[0-9][0-9][0-9][0-9]-[0-9][0-9][0-9]-[0-9][0-9][0-9]'
go
-------------------------------------------------------------------------------------------------------------------------------------------
sp_bindrule 'phonechecks', 'HumanResources.StaffDetails.phone_num'
go
--------------------------------------------------------------------------------------------------------------------------------------
alter table  HumanResources.StaffDetails
 add constraint gender_ck check(gender in ('male' ,'female')
 go 
----------------------------------------------------------------------------------------------------------------------------------------------


insert into HumanResources.StaffDetails(FirstName,LastName,Gender,Designation,Address,Phone_Num)
values('Dave','Robin','Male','Ogba','21, caterpillar close','34-856-8889-906-758'),
('robin','HOOD','female','ikeja','31, dada close','34-856-1234-906-758'),
('faith','wisdom','female','niit','31, dada close','34-856-1321-906-758'),
('cynthia','','paul','ikeja','31, dada close','34-856-1234-906-758')
go
select *
from HumanResources.StaffDetails
go
------------------------------------------------------------------------------------------------------------------------------------------------
                                             SERVICE_.MEMBERDETAILS
create table  Service_.MemberDetails
(
MemberID int,
FirstName varchar (15),
LastName varchar (15),
Gender varchar (6),
Address varchar (50),
Phone_Num varchar (20),
PlanID int identity (1,1) not null
) 
go
insert into Service_.MemberDetails (MemberID,FirstName,LastName,Gender,Address,Phone_Num,PlanID,PlanType,Fee)
values(
select *
from Service_.MemberDetails
-----------------------------------------------------------------------------------------------------------------------------------------------

alter table  Service_.MemberDetails
add constraint PlanID_pk primary key (PlanID)  

alter table Service_.MemberDetails
add PlanType varchar(20)
alter table Service_.MemberDetails
add Fee money

------------------------------------------------------------------------------------------------------------------------------------
alter table  Service_.MemberDetails
 add constraint gender_ck check(gender in ('male' ,'female') )

 alter table Service_.MemberDetails
 add constraint plan_type_ck check(PlanType in ('premium' ,'standard','guest') )
  
  alter table Service_.MemberDetails
    add constraint Fee_ck check(fee in ('75000' ,'45000','30000') )

-----------------------------------------------------------------------------------------------------------------------------------
 alter table Service_.MemberDetails
add constraint phone_num_ck check(phone_num like 
('[0-9]-[0-9]-[0-9][0-9]-[0-9][0-9][0-9][0-9]-[0-9][0-9][0-9]-[0-9][0-9][0-9]'))


create rule phonechecks
as @c_phone
like '[0-9]-[0-9]-[0-9][0-9]-[0-9][0-9][0-9][0-9]-[0-9][0-9][0-9]-[0-9][0-9][0-9]'



sp_bindrule 'phonechecks','Service_.MemberDetails.phone_num'
------------------------------------------------------------------------------------------------------------------------------
 ---------------------------------------------------------------------------------------------------------------------------------------
 select * 
 from Service_.MemberDetails
 go
 insert into Service_.MemberDetails(MemberID,FirstName,LastName,Gender,address,PlanType,Fee,Phone_Num)
values('1003','sidipe','podgba','male','number 37 jaiye ola estate','GUEST','30000','1-4-23-5342-456-789')
go
---------------------------------------------------------------------------------------------------------------------------------------------------------
                                             HUMAN RESOURCES.BOOKING
CREATE  table  HumanResources.Booking
(
StaffID int not null,
MemberID int not null,
PlanID int,
FacilityID int,
Desired_Day date,
Desired_Time date,
Max_Num int,
Actual_Num int,
Booking_Status varchar (20) DEFAULT 'AVAILABLE'
)
go
insert into  HumanResources.Booking (StaffID,MemberID,PlanID,FacilityID, Desired_Day, Desired_Time, Max_Num, Actual_Num,Booking_Status)

values (103,12,1004,100,'2-05-05','12:35',177,178,'AVAILABLE'),
(103,12,1004,100,'2-05-05','12:35',177,173,'AVAILABLE')
go
select *
from HumanResources.Booking     Booked 122
go
-----------------------------------------------------------------------------------------------------------------------------------
alter table HumanResources.Booking
add constraint MemberID_fk foreign key (MemberID)
references Members.MemberDetails
go
--------------------------------------------------------------------------------------------------------------------------

alter table HumanResources.Booking
add constraint FacilityID_fk foreign key (FacilityID)
references Service_.PlanDetails
go
-------------------------------------------------------------------------------------------------------------------------------
alter table HumanResources.Booking
 add constraint Booking_Status_ck check(Booking_Status in ('Booked' ,'AVAILABLE'))
 go

alter table  HumanResources.Booking
add constraint StaffID_fk foreign key(StaffID)
references HumanResources.StaffDetails
go
--------------------------------------------------------------------------------------------------------------------------------------

create trigger trgCheckMAX_num
on HumanResources.Booking
 for insert               
 as 
 declare @maxnum int 
 select @maxnum=Max_Num  from inserted                                                                   
 if (@MAXNUM= null)                        
 begin 
 rollback transaction
 end
 go

 create trigger trgCheckactual_num
on HumanResources.Booking
 for insert
 as 
 declare @Actual_Num int
 declare @Max_Num int
 select @Actual_Num = Actual_Num from Inserted
 select @Max_Num = Max_Num  from Inserted
 if (@Max_Num >=@Actual_Num)
 begin
 update HumanResources.Booking
set  @Max_Num=@Max_Num,@Actual_Num=@Actual_Num
where @Actual_Num=Actual_Num
end
else
begin
print 'actual number cant be greater than max num'
rollback
 end

  go
  create trigger trgCheckBooking_status
on HumanResources.Booking
 for insert
 as 
 declare @booking_status varchar (20)
 declare @Actual_Num int
 declare @Max_Num int
 select @Actual_Num = Actual_Num from Inserted
 select @Max_Num = Max_Num  from Inserted
 select @booking_status = Booking_Status from inserted
 if (@Max_Num =@Actual_Num )
 begin 
 UPDATE HumanResources.Booking
SET  booking_status =('Booked')
where Actual_Num=Max_Num
end
go
select * 
from HumanResources.Booking
go
  



 --------------------------------------------------------------------------------------------------------------------------------------
                                                   HUMANRSEORUCES.PLANDETAILS

 create table  HumanResources.PlanDetails
(
FacilityID int,
PlanID int,
Plan_Details varchar (20)
)
go
insert into   HumanResources.PlanDetails (FacilityID, PlanID, Plan_Details)
values (005, 00165, 'auto')
go
select * 
from  HumanResources.PlanDetails
go
-------------------------------------------------------------------------------------------------------------------------------------------
                                               SERVICE_.PLANDETAILS
create table  Service_.PlanDetails
(
FacilityID int identity (100,1),
PlanID int,
Plan_Details varchar (20)
)
go
alter table  Service_.PlanDetails
add constraint FacilityID_pk primary key(FacilityID)
go
alter table service_.PlanDetails
add constraint PlanID_fk foreign key (PlanID)
references Members.MemberDetails
go

Select  fu.Pros_MemberID AS "MemberID", fu.pros_fname, fu.pros_lname, b.Booking_Status, md.fee, md.PlanID, md.PlanType, pd.facilityID, pd.plan_details
	FROM  Service_.MemberDetails md JOIN  Service_.PlanDetails pd

	ON md.PlanID = pd.PlanID INNER JOIN HumanResources.Booking b 
	ON b.facilityId = pd.facilityID INNER JOIN  HumanResources.FollowUp fu
	ON b.MemberID = fu.pros_MemberID
	go


insert into Service_.PlanDetails (PlanID, Plan_Details)
values (006, 'auto')
 select *
 from Service_.PlanDetails
 go

---------------------------------------------------------------------------------------------------------------------------
                                     HUMANRESOURCES.PLANMASTER

create table  HumanResources.PlanMaster
(
PlanID int,
PlanType varchar (20),
Fee money
)
 go
insert into  HumanResources.PlanMaster (PlanID, PlanType, Fee)
values (007, 'premium', 75000)
select *
from  HumanResources.PlanMaster 
go
---------------------------------------------------------------------------------------------------------------------------------
                                          HUMAN RESOURCES.FEEDBACK
 create table  HumanResources.Feedback
(
RefID int identity (10,1),
StaffID int,
MemberID int,
Feedback_Det varchar (20),
Feedback_Type varchar (20),
Action_Taken varchar (30)
)
go

alter table HumanResources.Feedback
add constraint StaffID_fkk foreign key (StaffID)
references HumanResources.StaffDetails
go
alter table  HumanResources.Feedback
add constraint MemberID_fkk foreign key (MemberID)
references HumanResources.StaffDetails
go

 alter table HumanResources.Feedback
 add constraint Feedback_Type_ck check(Feedback_Type in('COMPLAINT','SUGGESTION','APPRECIATION'))
 go
 insert into HumanResources.Feedback ( StaffID,Feedback_Det, Feedback_Type, Action_Taken)
 values (103,'NEGATIVE','SUGGESTION','recorded')
 go
 select *
 from HumanResources.Feedback

                               HUMAN RESOURCES.FOLLOWUP


 Create table  HumanResources.FollowUp
(
Pros_MemberID int identity (10,1),
StaffID int,
Branch_ID varchar (10),
Pros_Fname varchar (15) not null,
Pros_Lname varchar (15) not null,
Phone_Num varchar (20)  not null,
Visit_Date date
go

alter table HumanResources.FollowUp
add  Branch_ID int
go
alter table HumanResources.StaffDetails
add constraint phone_num_ck check(phone_num like 
('[0-9]-[0-9]-[0-9][0-9]-[0-9][0-9][0-9][0-9]-[0-9][0-9][0-9]-[0-9][0-9][0-9]'))
go
create rule phonecheck
as @c_phone
like '[0-9]-[0-9]-[0-9][0-9]-[0-9][0-9][0-9][0-9]-[0-9][0-9][0-9]-[0-9][0-9][0-9]'
go
sp_bindrule 'phonechecks', 'HumanResources.StaffDetails.phone_num'
go

alter table HumanResources.FollowUp
add constraint Staff_ID_fkk foreign key (StaffID)
references HumanResources.StaffDetails
go
insert into HumanResources.FollowUp(Pros_Fname, Pros_Lname,StaffID ,Phone_Num, Visit_Date, Branch_ID)
values ('giroud','lacazette',102,'2-1-23-3435-322-354','2008-02-07', 56),
('iwobi','ozil',102,'2-1-23-4521-322-354','2008-02-07', 56),
('koscienly','ramsey',102,'2-1-23-3435-322-354','2008-02-07', 56),
('shaka','torreira',102,'2-1-23-3435-322-354','2008-02-07', 56)
go
select *
from HumanResources.FollowUp
go
---------------------------------------------------------------------------------------------------------------------------------
                                             MEMBERS.MEMBERDETAILS
create table  Members.MemberDetails
(
MemberID int identity (10,1),
FirstName varchar (15) not null,
LastName varchar (15) not null,
Gender varchar (6) not null,
Address varchar (50) not null,
Phone_Num varchar (20) not null,
PlanID int not null
)
go
 alter table Members.MemberDetails
add constraint phone_num_ck check(phone_num like 
('[0-9]-[0-9]-[0-9][0-9]-[0-9][0-9][0-9][0-9]-[0-9][0-9][0-9]-[0-9][0-9][0-9]'))
 go
create rule phonechecks
as @c_phone
like '[0-9]-[0-9]-[0-9][0-9]-[0-9][0-9][0-9][0-9]-[0-9][0-9][0-9]-[0-9][0-9][0-9]'
go
sp_bindrule 'phonechecks','Members.MemberDetails.phone_num'
go
alter table Members.MemberDetails
add constraint PlanID_fkk foreign key (PlanID)
references Service_.MemberDetails
go
insert into  Members.MemberDetails (FirstName,LastName,Gender,Address,date,Phone_Num,PlanID)
values ('bade','amosun','male','no 11 adetoun strt','2-12-08','2-3-45-1111-786-342',1005),
('drake','minaj','male','no 31 adetoun strt','3-12-07','2-3-45-1111-786-342',1006),
('jibola','amosun','female','no 31 aramide strt','3-12-07','2-3-45-1234-786-342',1006),
('tunde','rekiah','female','no 31 ikeja strt','3-12-07','2-3-45-4521-786-342',1006)
go
select *
from Members.MemberDetails
------------------------------------------------------------------------------------------------------------
                                    TRANSACTION_REVENUE.REVENUE

create table Transaction_Revenue.Revenue
(
PaymentID int identity (10,1),
MemberID int,
PaymentDate date DEFAULT GETDATE(),
PaymentMethod varchar (25),
CC_Num int,
CC_Name varchar (20),
Check_Num int,
PaymentStatus varchar(20)
)

alter table Transaction_Revenue.Revenue
add constraint paymentID_pkk primary key (PaymentID)
 


----------------------------------------------------------------------------------------------------------------
alter table Transaction_Revenue.Revenue
 add constraint PaymentMethod_ck check(PaymentMethod in ('Cash' ,'Check','Credit Card') )
--------------------------------------------------------------------------------------------------------------------------------------
 CREATE TRIGGER trginsertshift 
ON Transaction_Revenue.Revenue
FOR INSERT
AS
	DECLARE @ModifiedDate datetime
	SELECT @ModifiedDate = ModifiedDate FROM PaymentDate
	IF (@ModifiedDate != getdate())
	BEGIN
	PRINT 'The Modified date should be the current date.Hence, 	cannot insert.'	ROLLBACK TRANSACTION
	END
-------------------------------------------------------------------------------------------------------------------------
create trigger creditcard
on Transaction_Revenue.Revenue
for insert 
as
declare @paymentMethod varchar (25)
declare @cc_name varchar(20)
declare @cc_num int
declare @creditcard varchar(25)
select @paymentMethod= paymentMethod from inserted
select @cc_name=cc_name from inserted
select @cc_num=cc_num from inserted
select @creditcard = PaymentMethod from inserted 
if @cc_name=@cc_name and @cc_num=@cc_num
begin
update Transaction_Revenue.Revenue
set cc_name=null,cc_num=null
where PaymentMethod not in ('credit card')
end
 go

 insert into Transaction_Revenue.Revenue (MemberID,PaymentDate,Check_Num,PaymentStatus,PaymentMethod,CC_Num,cc_name)
 values( 1005,'2018-06-17',1893,'pending','cash',1028,'vista')
 select *
 from Transaction_Revenue.Revenue 

create trigger checknum
on Transaction_Revenue.Revenue
for insert 
as
declare @paymentMethod varchar (25)
declare @check varchar(25)
declare @check_Num int
select @paymentMethod= paymentMethod from inserted
select @check = PaymentMethod from inserted 
select @check_Num = check_Num from inserted
if @check_num=@check_Num and @check=@check
begin 
update Transaction_Revenue.Revenue
set @check=null,Check_Num=null
where PaymentMethod not in ('check')
end
go
------------------------------------------------------------------------------------------------------------------------------------------
 insert into Transaction_Revenue.Revenue (MemberID,PaymentDate,Check_Num,PaymentStatus,PaymentMethod,CC_Num,cc_name)
 values( 1003,'2018-06-17',12,'paid','check',1007,'verve')
 go
 select *
 from Transaction_Revenue.Revenue
  insert into Transaction_Revenue.Revenue (PaymentMethod,Check_Num,)
 values('credit card',1007,'verve')


 -------------------------------------------------------------------------------------------
 alter table Transaction_Revenue.Revenue
 add constraint PaymentStatus_ck check( paymentStatus in('paid','pending'))
-------------------------------------------------------------------------------------------------------
create table HumanResources.StaffDetails
(
StaffID int identity (100, 1) ,
Branch_ID int,
FirstName varchar (15) not null,
LastName varchar (15) not null,
Gender varchar (6),
Designation varchar (30) not null,
Address varchar (50) not null,
Phone_Num varchar (20) not null
)

alter table HumanResources.StaffDetails
add constraint StaffID_pkk primary key(StaffID)
---------------------------------------------------------------------------------------------------------------------------------------
alter table HumanResources.StaffDetails
add constraint phone_num_ck check(phone_num like 
('[0-9]-[0-9]-[0-9][0-9]-[0-9][0-9][0-9][0-9]-[0-9][0-9][0-9]-[0-9][0-9][0-9]'))

create rule phonecheck
as @c_phone
like '[0-9]-[0-9]-[0-9][0-9]-[0-9][0-9][0-9][0-9]-[0-9][0-9][0-9]-[0-9][0-9][0-9]'

sp_bindrule 'phonechecks', 'HumanResources.StaffDetails.phone_num'


select *
from HumanResources.StaffDetails
--------------------------------------------------------------------------------------------------------------

create table  HumanResources.Feedback
(
RefID int identity (10,1),
StaffID int,
MemberID int,
Feedback_Det varchar (20),
Feedback_Type varchar (20),
Action_Taken varchar (30)
)


alter table HumanResources.Feedback
add constraint StaffID_fkk foreign key (StaffID)
references HumanResources.StaffDetails

--

alter table  HumanResources.Feedback
add constraint MemberID_fkk foreign key (MemberID)
references HumanResources.StaffDetails


 alter table HumanResources.Feedback
 add constraint Feedback_Type_ck check(Feedback_Type in('COMPLAINT','SUGGESTION','APPRECIATION'))
 
 select * 
 from HumanResources.Feedback
 --------------------------------------------------------------------------------------------------------------------------------------------

 
alter table  Members.MemberDetails
add  date date

alter table Members.MemberDetails
alter column date date not null


create nonclustered index IX_DATE
on Members.MemberDetails(DATE)


create nonclustered index IX_paymentstatus
on Transaction_revenue.Revenue(paymentstatus)
where paymentstatus = 'pending'

create nonclustered index IX_planname
on service_.planDetails(facilityID)


create nonclustered index IX_PLANID
on service_.planDetails(planID)

create nonclustered index IX_plan_deails
on service_.planDetails(plan_Details)

create nonclustered  index IX_branchId
on HumanResources.Followup(Branch_iD)


create nonclustered index IX_FEEDBACK
on HumanResources.Feedback(Feedback_Type)
where Feedback_Type = 'Complaint''Suggestion'


create nonclustered index IX_FEEDBACK_AC
on HumanResources.Feedback(Action_Taken)



--=========== CREATING LOGINS AND USERS


CREATE LOGIN tonyLogin WITH PASSWORD = 'tonysecretkey';
CREATE LOGIN andrewLogin WITH PASSWORD = 'andrewsecretkey';
CREATE LOGIN smithLogin WITH PASSWORD = 'smithsecretkey';
CREATE LOGIN bourneLogin WITH PASSWORD = 'bournesecretkey';


CREATE USER userTony FOR LOGIN  tonyLogin;
CREATE USER userAndrew FOR LOGIN  andrewLogin;
CREATE USER userSmith FOR LOGIN  smithLogin;
CREATE USER userBourne FOR LOGIN  bourneLogin;

EXECUTE sp_addrolemember dbDev, userSmith ;
EXECUTE sp_addrolemember dbAdmin, userTony ;
EXECUTE sp_addrolemember dbDev, userBourne ;
EXECUTE sp_addrolemember dbDev, userAndrew ;
GO



--------------------------------------
GRANT SELECT, INSERT, UPDATE, DELETE ON service_.PlanDetails TO dbAdmin;
GRANT SELECT, INSERT, UPDATE, DELETE ON Transaction_revenue.Revenue TO dbAdmin;
GRANT SELECT, INSERT, UPDATE, DELETE ON Members.MemberDetails TO dbAdmin;
GRANT SELECT, INSERT, UPDATE, DELETE ON HumanResources.Booking TO dbAdmin;
GRANT SELECT, INSERT, UPDATE, DELETE ON HumanResources.Feedback TO dbAdmin;
GRANT SELECT, INSERT, UPDATE, DELETE ON HumanResources.FollowUp TO dbAdmin;
GRANT SELECT, INSERT, UPDATE, DELETE ON Service_.MemberDetails TO dbAdmin;
GRANT SELECT, INSERT, UPDATE, DELETE ON HumanResources.StaffDetails TO dbAdmin;
------------------------------------------------------------------------------------------------

CREATE MASTER KEY ENCRYPTION BY PASSWORD = 'fitnfine'

OPEN MASTER KEY DECRYPTION BY PASSWORD = 'fitnfine'

BACKUP MASTER KEY TO FILE = 'database _adventureWorks'
	ENCRYPTION BY PASSWORD = 'fitnfine';


