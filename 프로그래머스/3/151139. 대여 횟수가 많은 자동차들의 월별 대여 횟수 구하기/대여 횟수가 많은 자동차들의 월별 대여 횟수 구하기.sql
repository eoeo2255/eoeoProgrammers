select
    EXTRACT(MONTH from START_DATE) as MONTH
    , CAR_ID
    , count(*) as RECORDS
from CAR_RENTAL_COMPANY_RENTAL_HISTORY
where START_DATE >= TO_DATE('2022-08-01', 'YYYY-MM-DD')
    and START_DATE < TO_DATE('2022-11-01', 'YYYY-MM-DD')
    and CAR_ID in (
      select CAR_ID
      from CAR_RENTAL_COMPANY_RENTAL_HISTORY
      where START_DATE >= TO_DATE('2022-08-01', 'YYYY-MM-DD')
        and START_DATE < TO_DATE('2022-11-01', 'YYYY-MM-DD')
      group by CAR_ID
      having COUNT(*) >= 5
  )
group by
    EXTRACT(MONTH from START_DATE)
    , CAR_ID
having count(*) > 0
order by MONTH, CAR_ID desc