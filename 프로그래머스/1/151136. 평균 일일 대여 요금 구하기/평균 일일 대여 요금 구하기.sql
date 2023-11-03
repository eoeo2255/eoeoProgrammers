-- 코드를 입력하세요
SELECT ROUND(AVG(DAILY_FEE), 0) AVERAGE_FEE
-- 소수 첫번째 자리에서 반올림 한 일일 요금 평균 값 구하기
FROM CAR_RENTAL_COMPANY_CAR
WHERE CAR_TYPE = 'SUV'