with sub_t AS(
    select *, MAX(salary) OVER (partition by departmentId order by salary desc) as max_sal
    from employee
    
)

select d.name as Department,s.name AS Employee ,s.salary
from sub_t AS s
join department AS d
    on s.departmentId = d.id
where s.salary = s.max_sal
