-- 코드를 입력하세요
select A.flavor from first_half A inner join icecream_info B on A.flavor = B.flavor where A.total_order > 3000 and B.ingredient_type = 'fruit_based';