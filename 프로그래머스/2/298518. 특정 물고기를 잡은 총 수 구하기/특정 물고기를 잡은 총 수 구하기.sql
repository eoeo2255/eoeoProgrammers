select count(*) as FISH_COUNT
from FISH_NAME_INFO name
left join FISH_INFO info
on name.FISH_TYPE = info.FISH_TYPE
where FISH_NAME = 'BASS' or FISH_NAME = 'SNAPPER'