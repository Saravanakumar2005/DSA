select s.name
from SalesPerson as s
where s.sales_id Not in(
    select o.sales_id
    from orders as o
    join company as c
        on o.com_id = c.com_id
    where c.name = "RED"
)



