-- 코드를 입력하세요
SELECT ANIMAL_ID, NAME, 
    CASE WHEN SEX_UPON_INTAKE like '%Spayed%' THEN 'O' 
         WHEN SEX_UPON_INTAKE like '%Neutered%' THEN 'O' 
    ELSE 'X'
    END AS 증성화
FROM ANIMAL_INS
    ORDER BY ANIMAL_ID;