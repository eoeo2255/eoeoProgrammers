SELECT COUNT(*) USERS
-- 필터링 된 행의 개수를 모두 세어야 하기 때문에 *를 사용해야 함
FROM USER_INFO
WHERE AGE IS NULL