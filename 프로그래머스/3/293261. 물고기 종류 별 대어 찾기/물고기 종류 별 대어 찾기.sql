-- 코드를 작성해주세요

SELECT a.id, b.fish_name, a.length
FROM (
    SELECT id, fish_type, length
    FROM fish_info
    WHERE (fish_type, length) IN (
        SELECT fish_type, MAX(length)
        FROM fish_info
        GROUP BY fish_type
    )
) AS a
JOIN fish_name_info AS b
ON a.fish_type = b.fish_type;