CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
    DECLARE result int;
    SET result = null;
    IF N > 0 THEN 
        set N = N-1;

        select distinct salary Into result
        from employee
        order by salary desc
        LIMIT 1 OFFSET N;
    END IF;

    RETURN result;
END;