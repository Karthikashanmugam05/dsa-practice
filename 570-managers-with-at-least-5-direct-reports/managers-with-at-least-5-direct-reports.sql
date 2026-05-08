-- select m.name from employee m join employee e on m.id=e.manager_id group by m.name,m.id  having count(e.id)>5;

SELECT m.name
 FROM Employee m
 JOIN Employee e
ON m.id = e.managerId
 GROUP BY m.id, m.name
 HAVING COUNT(e.id) >= 5;