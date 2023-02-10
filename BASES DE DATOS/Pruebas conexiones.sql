USE test;
CREATE TABLE t1 (num integer, name text);
INSERT INTO t1 VALUES (1, 'a'), (2, 'b'), (3, 'c');
CREATE TABLE t2 (num integer, value text);
INSERT INTO t2 VALUES (1, 'xxx'), (3, 'yyy'), (5, 'zzz');
SELECT * FROM t1;
num name;

SELECT * FROM t2;
num value;

/*t1 y t2*/

SELECT *
FROM t1 
INNER JOIN t2 ON t1.num = t2.num;
/*o*/
SELECT *
FROM t1
INNER JOIN t2 USING (num);
/*o*/
SELECT *
FROM t1
NATURAL INNER JOIN t2;

/*Solo t1 y t2 q cumpla lo mismo que t1*/

SELECT *
FROM t1 
LEFT JOIN t2 ON t1.num = t2.num;

/*Solo t1 y no t2*/

SELECT *
FROM t1 
LEFT JOIN t2 ON t1.num = t2.num
WHERE t2.num IS NULL;

/*t2 y t1 q cumpla lo mismo q t1*/

SELECT * 
FROM t1 
RIGHT JOIN t2 ON t1.num = t2.num;

/*t2 y no t1*/

SELECT * 
FROM t1 
RIGHT JOIN t2 ON t1.num = t2.num
 WHERE t1.num IS NULL;



/*nir t1 con t2*/

SELECT * FROM t1 LEFT JOIN t2 ON t1.num = t2.num
UNION
SELECT * FROM t1 RIGHT JOIN t2 ON t1.num = t2.num;


/*todas las convinaciones de t1 respecto a t2*/

SELECT *
FROM t1
CROSS JOIN t2; 

/*o*/

SELECT *
FROM t1, t2; 