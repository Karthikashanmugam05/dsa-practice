# Write your MySQL query statement below
-- group by : twice SUM calculation
-- one in SELECT and another in HAVING
-- still group is more efficient than partition 

SELECT p.product_name, SUM(o.unit) unit
FROM Products p
JOIN Orders o
ON p.product_id = o.product_id
WHERE order_date BETWEEN '2020-02-01' AND '2020-02-29'
GROUP BY p.product_name
HAVING SUM(o.unit) >= 100

-- partition by : requires cte table

-- WITH cte AS
-- (SELECT p.product_name, SUM(unit) OVER(PARTITION BY p.product_id) AS unit
-- FROM Products p
-- JOIN Orders o
-- On p.product_id = o.product_id
-- WHERE order_date BETWEEN '2020-02-01' AND '2020-02-29')

-- SELECT DISTINCT product_name, unit
-- FROM cte
-- WHERE unit >= 100
