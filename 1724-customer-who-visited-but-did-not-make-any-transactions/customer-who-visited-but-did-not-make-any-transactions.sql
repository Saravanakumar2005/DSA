with summa as(
select v.customer_id
from visits as v
left join transactions as t
    on v.visit_id = t.visit_id
where t.transaction_id is null)

select distinct customer_id,count(customer_id) over(partition by customer_id) as count_no_trans
from summa;


