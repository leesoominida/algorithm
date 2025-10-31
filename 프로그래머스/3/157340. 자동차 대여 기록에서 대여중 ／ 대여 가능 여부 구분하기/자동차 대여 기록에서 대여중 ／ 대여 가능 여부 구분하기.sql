-- 코드를 입력하세요


-- SELECT
--     CAR_ID,
--     MAX(CASE WHEN '2022-10-16' BETWEEN TO_CHAR(START_DATE, 'YYYY-MM-DD') AND TO_CHAR(END_DATE, 'YYYY-MM-DD') THEN '대여중' ELSE '대여 가능' END) AS AVAILABILITY
-- FROM
--     CAR_RENTAL_COMPANY_RENTAL_HISTORY
-- GROUP BY
--     CAR_ID
-- ORDER BY
--     CAR_ID DESC;

SELECT car_id,
        MAX(CASE
                WHEN TO_DATE('20221016', 'YYYYMMDD') BETWEEN start_date AND end_date
                    THEN '대여중'
                ELSE '대여 가능'
            END) AS availability
FROM car_rental_company_rental_history
GROUP BY car_id
ORDER BY car_id DESC