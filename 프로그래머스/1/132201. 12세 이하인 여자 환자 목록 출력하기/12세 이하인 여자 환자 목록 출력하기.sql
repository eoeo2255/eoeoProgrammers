-- 코드를 입력하세요
SELECT PT_NAME, PT_NO, GEND_CD, AGE, NVL(TLNO, 'NONE')
-- NVL 함수는 해당 값이 NULL 일 경우 뒤의 값을, NULL이 아닐경우 앞의 값을 출력
FROM PATIENT
WHERE AGE <= 12
AND GEND_CD = 'W'
ORDER BY AGE DESC, PT_NAME