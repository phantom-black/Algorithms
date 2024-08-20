-- 코드를 입력하세요
SELECT A.book_id, B.author_name, TO_CHAR(A.published_date, 'YYYY-MM-DD') AS published_date from BOOK A, AUTHOR B where A.author_id = B.author_id and A.category='경제' order by published_date asc;


