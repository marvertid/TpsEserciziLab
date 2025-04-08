CREATE DATABASE MENSA;

USE MENSA;

create table prenotazioni
(
    codice_fiscale varchar(16)  not null,
    data_pasto     date         not null,
    ordinazione    varchar(255) not null,
    primary key (codice_fiscale, data_pasto)
);
