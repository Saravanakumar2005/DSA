select ei.unique_id,e.name
from employees AS e
left join employeeuni AS ei
    ON e.id = ei.id
