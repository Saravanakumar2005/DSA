select f.firstname,f.lastname,a.city,a.state
from person f
left join address a
    ON f.personId = a.personId