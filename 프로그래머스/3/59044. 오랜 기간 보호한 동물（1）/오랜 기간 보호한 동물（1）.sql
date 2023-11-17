SELECT *
FROM (
    SELECT I.NAME, I.DATETIME
    FROM ANIMAL_INS I
    LEFT JOIN ANIMAL_OUTS O
    ON I.ANIMAL_ID = O.ANIMAL_ID
    -- 아직 입양을 가지 못한 동물 조회
    WHERE O.DATETIME IS NULL
    -- 보호 시작일 순으로 조회
    ORDER BY I.DATETIME
)
-- 가장 오래 있던 3마리만 조회
WHERE ROWNUM <= 3
-- '보호 시작일 순 = 제일 먼저 들어온 동물 순'이기 때문에 ROWNUM 3으로 제한을 주면 가장 오래 있었던 동물 3마리만 조회 됨