# Write your MySQL query statement below
select user_id, count(prompt) as prompt_count, ROUND(AVG(tokens),2)  as avg_tokens
from prompts
group by user_id
HAVING prompt_count > 2 AND MAX(tokens) > avg_tokens
ORDER BY avg_tokens DESC, user_id;