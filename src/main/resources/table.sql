-- DROP DATABASE IF EXISTS library;
-- CREATE DATABASE library;
DROP TABLE IF EXISTS PERSON cascade;
CREATE TABLE IF NOT EXISTS PERSON (
    ID int NOT NULL,
    name varchar(50) NOT NULL,
    age int NOT NULL,
    email varchar(50) NOT NULL,
    placeofwork varchar(100) NOT NULL
);
DROP TABLE IF EXISTS BOOK cascade;
CREATE TABLE IF NOT EXISTS BOOK (
    ID int NOT NULL,
    name varchar(50) NOT NULL,
    author varchar(50) NOT NULL,
    pagenumber int NOT NULL,
    booked int NOT NULL
);
