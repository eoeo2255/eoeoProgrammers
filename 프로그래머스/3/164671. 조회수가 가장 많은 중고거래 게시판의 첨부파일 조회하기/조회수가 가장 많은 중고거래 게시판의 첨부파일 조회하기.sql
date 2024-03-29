SELECT '/home/grep/src/' || BOARD_ID || '/' || FILE_ID || FILE_NAME || FILE_EXT AS FILE_PATH
FROM USED_GOODS_FILE
WHERE BOARD_ID IN (
    --BOARD_ID 와 비교해야되기 때문에 SELECT * 은 안됨
    SELECT BOARD_ID
    FROM USED_GOODS_BOARD
    WHERE VIEWS = (SELECT MAX(VIEWS) FROM USED_GOODS_BOARD)
)
ORDER BY FILE_ID DESC;