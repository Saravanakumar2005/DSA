select c.name as Customers
from customers c
left join orders o
    on o.customerId = c.Id
where o.customerID is NULL
