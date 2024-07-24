int death_rune = v.getInventory().slot(560);
int nature_rune =  v.getInventory().slot(561);
int law_rune =  v.getInventory().slot(563);
int rune_pouch = v.getInventory().slot(12791);


v.invoke("Use","<col=ff9040>Death rune</col>",0,25,death_rune,9764864,false);
v.invoke("Use","<col=ff9040>Death rune</col><col=ffffff> -> <col=ff9040>Rune pouch</col>",0,58,rune_pouch,9764864,false);

v.invoke("Use","<col=ff9040>Law rune</col>",0,25,law_rune,9764864,false);
v.invoke("Use","<col=ff9040>Law rune</col><col=ffffff> -> <col=ff9040>Rune pouch</col>",0,58,rune_pouch,9764864,false);

v.invoke("Use","<col=ff9040>Nature rune</col>",0,25,nature_rune,9764864,false);
v.invoke("Use","<col=ff9040>Nature rune</col><col=ffffff> -> <col=ff9040>Rune pouch</col>",0,58,rune_pouch,9764864,false);
