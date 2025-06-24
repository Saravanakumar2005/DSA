select p.project_id ,round(AVG(e.experience_years),2)  as average_years
from project AS p
join employee AS e
    on p.employee_id = e.employee_id
group by p.project_id
