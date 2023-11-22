SELECT NAME, COUNT(*)
FROM ANIMAL_INS
-- 이름이 NULL 인 데이터는 제외 시킴
WHERE NAME IS NOT NULL
-- 이름별로 정렬시켰을 때, 개수가 1 이상인 것만 조회 (중복되는 데이터만)
GROUP BY NAME HAVING COUNT(*) > 1
ORDER BY NAME