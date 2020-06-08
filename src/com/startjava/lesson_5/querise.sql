SELECT * FROM jaegers;
SElECT * FROM jaegers WHERE status != 'destroyed';
SELECT * FROM jaegers WHERE mark in ('Mark-1', 'Mark-6');
SELECT * FROM jaegers ORDER BY mark DESC;
SELECT * FROM jaegers ORDER BY launched LIMIT 1;
SELECT * FROM jaegers WHERE kaijuKilled in ((SELECT MAX(kaijuKilled) FROM jaegers), (SELECT MIN(kaijuKilled) FROM jaegers));
SELECT AVG(weight) AS averageWeight FROM jaegers;
UPDATE jaegers SET kaijuKilled = kaijuKilled + 1 WHERE status != 'destroyed';
DELETE FROM jaegers WHERE status = 'destroyed';
\q