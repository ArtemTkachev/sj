CREATE DATABASE jaegers;
\c jaegers;
CREATE TABLE jaegers (id serial, modelName text, mark text, origin text, status text, height real, weight real, launched date, kaijuKilled integer);
