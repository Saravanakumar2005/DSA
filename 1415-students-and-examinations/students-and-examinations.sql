-- Step 1: Create all possible student-subject pairs
SELECT 
    s.student_id,
    s.student_name,
    sub.subject_name,
    COUNT(e.subject_name) AS attended_exams
FROM 
    (SELECT student_id, student_name FROM Students) AS s
NATURAL JOIN 
    (SELECT subject_name FROM Subjects) AS sub
LEFT JOIN 
    Examinations e
ON 
    s.student_id = e.student_id AND sub.subject_name = e.subject_name
GROUP BY 
    s.student_id, s.student_name, sub.subject_name
ORDER BY 
    s.student_id, sub.subject_name;
