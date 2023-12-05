SELECT ANIMAL_ID, NAME
FROM ANIMAL_INS
-- 동물들 중 개만 필터링
WHERE ANIMAL_TYPE = 'Dog'
-- 개 중에서 el이 들어가는 이름을 가진 동물만 필터링, LOWER로 대소문자 구분 안함
AND LOWER(NAME) LIKE '%el%'
ORDER BY NAME