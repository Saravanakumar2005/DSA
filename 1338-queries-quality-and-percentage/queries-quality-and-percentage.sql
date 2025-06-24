select query_name,round(AVG(rating/position),2) as quality,round(Avg(case when rating < 3 Then 1 else 0 end)*100,2) as poor_query_percentage
from queries
group by query_name