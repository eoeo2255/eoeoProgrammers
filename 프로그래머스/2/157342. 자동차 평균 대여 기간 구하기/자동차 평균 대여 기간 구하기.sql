-- 빌리기 시작한 당일과 반납한 당일도 대여일에 포함시키기 때문에 +1 해준다.
SELECT CAR_ID, ROUND(AVG(END_DATE-START_DATE+1),1) AS AVERAGE_DURATION
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
-- 자동차 ID를 기준으로 그룹화
GROUP BY CAR_ID
-- 평균 대여 기간이 7일 이상인 자동차만 필터링
HAVING ROUND(AVG(END_DATE-START_DATE+1),1) >= 7
ORDER BY AVERAGE_DURATION DESC, CAR_ID DESC