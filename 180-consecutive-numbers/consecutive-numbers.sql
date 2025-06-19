select Distinct num AS ConsecutiveNums
from (
    select num,
    lead(num,1) Over (order by id ) AS prev1 ,
    lead(num,2) Over (order by id) AS prev2 
    from logs
) t
where num = prev1 And num =  prev2