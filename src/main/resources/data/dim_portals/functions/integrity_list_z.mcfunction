# Cloud Wolf:
#       This checks the integrity of the portal, if failed
#       portal will be killed.

execute if entity @s[tag=glowstone] unless predicate dim_portals:glowstone_portal_z run kill @s
execute if entity @s[tag=vilgax] unless predicate dim_portals:vilgax_portal_z run kill @s