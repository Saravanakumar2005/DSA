with summa as(
select player_id,event_date, ROW_NUMBER() OVER (Partition by player_id Order by event_date asc) AS first_login
from Activity)

select player_id,event_date as first_login
from summa
where first_login = 1


