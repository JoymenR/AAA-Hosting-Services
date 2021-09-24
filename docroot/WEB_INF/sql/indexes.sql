create index IX_5B21CFC8 on AAA_Customer (groupId);
create index IX_E78B452 on AAA_Customer (uuid_);
create index IX_F32FC896 on AAA_Customer (uuid_, companyId);
create unique index IX_3E1D7C98 on AAA_Customer (uuid_, groupId);

create index IX_AFFA3136 on AAA_Servic (groupId);
create index IX_9B369940 on AAA_Servic (uuid_);
create index IX_5CC322E8 on AAA_Servic (uuid_, companyId);
create unique index IX_3B07436A on AAA_Servic (uuid_, groupId);