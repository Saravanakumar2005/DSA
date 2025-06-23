select e.name
from employee as e
join employee as m
    on e.id = m.managerid
group by m.managerId
having count(m.managerId) >=5
