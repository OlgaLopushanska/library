DROP TABLE IF EXISTS user cascade;
CREATE TABLE IF NOT EXISTS user(
    ID int NOT NULL,
    name varchar(50) NOT NULL,
    age int NOT NULL,
    placeofwork varchar(100) NOT NULL
);