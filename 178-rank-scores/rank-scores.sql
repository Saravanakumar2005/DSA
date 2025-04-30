select score ,Dense_Rank() OVER (order by score DESC ) AS 'rank'
from scores
order by score desc ;