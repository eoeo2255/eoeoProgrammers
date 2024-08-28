SELECT 
    EXTRACT(MONTH FROM START_DATE) AS MONTH,
    CAR_ID,
    COUNT(*) AS RECORDS
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
WHERE START_DATE >= TO_DATE('2022-08-01', 'YYYY-MM-DD')
  AND START_DATE < TO_DATE('2022-11-01', 'YYYY-MM-DD')
  AND CAR_ID IN (
      SELECT CAR_ID
      FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
      WHERE START_DATE >= TO_DATE('2022-08-01', 'YYYY-MM-DD')
        AND START_DATE < TO_DATE('2022-11-01', 'YYYY-MM-DD')
      GROUP BY CAR_ID
      HAVING COUNT(*) >= 5
  )
GROUP BY EXTRACT(MONTH FROM START_DATE), CAR_ID
HAVING COUNT(*) > 0
ORDER BY MONTH ASC, CAR_ID DESC;