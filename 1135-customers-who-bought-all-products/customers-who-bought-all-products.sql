# Write your MySQL query statement below
select customer_id
from Customer c
left join Product p
on c.product_key=p.product_key
group by  customer_id 
HAVING COUNT(DISTINCT c.product_key) = (
    SELECT COUNT(*) 
    FROM Product
)