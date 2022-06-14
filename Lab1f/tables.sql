CREATE DATABASE student3_dp2022;
create user bormaxv with password '1';
grant all on database student3_dp2022 to bormaxv;
CREATE TABLE "items" (
    "id" serial PRIMARY KEY,
    "name" varchar,
    "price" int,
    "description" varchar,
    "link" varchar
);
CREATE TABLE "amount" (
    "id" serial PRIMARY KEY,
    "itemid" INT UNIQUE REFERENCES items(id),
    "amount" int
);