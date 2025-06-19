with sara AS(
select *,Dense_rank() Over (partition by departmentId order by salary desc) as rank_Sal 
from employee )

select d.name as Department,s.name as Employee ,s.salary as Salary
from sara AS s
join department AS d
    on s.departmentId  = d.id
where rank_Sal <=3
