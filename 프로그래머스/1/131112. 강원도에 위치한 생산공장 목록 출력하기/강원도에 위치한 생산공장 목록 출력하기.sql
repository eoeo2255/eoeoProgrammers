SELECT FACTORY_ID, FACTORY_NAME, ADDRESS
FROM FOOD_FACTORY
WHERE ADDRESS LIKE '강원도%'
-- 주소가 '강원도' 로 시작하는 데이터만을 검색
ORDER BY FACTORY_ID