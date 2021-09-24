create table AAA_Customer (
	uuid_ VARCHAR(75) null,
	customerId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	servicId LONG,
	name VARCHAR(75) null,
	email VARCHAR(75) null,
	address VARCHAR(75) null,
	nicNumber VARCHAR(75) null,
	contactNumber VARCHAR(75) null
);

create table AAA_Servic (
	uuid_ VARCHAR(75) null,
	servicId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	servicName VARCHAR(75) null,
	servicPrice VARCHAR(75) null,
	servicDescription VARCHAR(75) null
);