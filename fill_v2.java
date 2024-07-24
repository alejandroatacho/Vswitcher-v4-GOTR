
//Variables
int death_id = 560;
int nat_id = 561;
int law_id = 563;
int rune_pouch_id = 12791;
int abyssal_pouch = 26784;
int abyssal_pouch_slot = v.getInventory().slot(abyssal_pouch);
int rune_rock = 43720;
int work_bench = 43754;

//storePouch slot farmer
int death_rune = v.getInventory().slot(death_id);
int nature_rune =  v.getInventory().slot(nat_id);
int law_rune =  v.getInventory().slot(law_id);
int rune_pouch = v.getInventory().slot(rune_pouch_id);

// WorkBench wp
WorldPoint wp1 = new WorldPoint(3612, 9488, 0);
WorldPoint wp2 = new WorldPoint(3611, 9488, 0);
WorldPoint wp3 = new WorldPoint(3613, 9487, 0);
WorldPoint wp4 = new WorldPoint(3613, 9486, 0);
WorldPoint wp5 = new WorldPoint(3610, 9487, 0);
WorldPoint wp6 = new WorldPoint(3610, 9486, 0);
WorldPoint wp7 = new WorldPoint(3611, 9485, 0);
WorldPoint wp8 = new WorldPoint(3612, 9485, 0);
//rock guard WP
WorldPoint s_g_1 = new WorldPoint(3590, 9500, 0);
WorldPoint s_g_2 = new WorldPoint(3589, 9500, 0);
WorldPoint s_g_3 = new WorldPoint(3591, 9500, 0);
WorldPoint n_g_1 = new WorldPoint(3591, 9507, 0);

//Tasty
WorldPoint currentLocation = client.getLocalPlayer().getWorldLocation();
GameObject workBench = v.getGameObject().findNearest(work_bench);
GameObject guardianRock = v.getGameObject().findNearest(rune_rock);

//Methods down below!

private void fillPouch(){
v.invoke("Fill","<col=ff9040>Colossal pouch</col>",2,57,abyssal_pouch_slot,9764864,false);
}

private void storePouch() {
//      if (v.getInventory().hasIn(death_id)) {
v.invoke("Use","<col=ff9040>Death rune</col>",0,25,death_rune,9764864,false);
v.invoke("Use","<col=ff9040>Death rune</col><col=ffffff> -> <col=ff9040>Rune pouch</col>",0,58,rune_pouch,9764864,false);
//      }
//      else if (v.getInventory().hasIn(law_id)) {
v.invoke("Use","<col=ff9040>Law rune</col>",0,25,law_rune,9764864,false);
v.invoke("Use","<col=ff9040>Law rune</col><col=ffffff> -> <col=ff9040>Rune pouch</col>",0,58,rune_pouch,9764864,false);
//      }
//      else if (v.getInventory().hasIn(nat_id)) {
v.invoke("Use","<col=ff9040>Nature rune</col>",0,25,nature_rune,9764864,false);
v.invoke("Use","<col=ff9040>Nature rune</col><col=ffffff> -> <col=ff9040>Rune pouch</col>",0,58,rune_pouch,9764864,false);

//}
}

private void dropPouch() {
    v.getInventory().drop(556,557,555,554, 558);
}

public void pouchManagement(){
dropPouch();
storePouch();
}

public void runBench() {
    

    if (workBench != null) {
        int workBenchSceneX = workBench.getSceneMinLocation().getX();
        int workBenchSceneY = workBench.getSceneMinLocation().getY();
        
//        v.invoke("Fill","<col=ff9040>Colossal pouch</col>",2,57,abyssal_pouch_slot,9764864,false);
        if (currentLocation.equals(wp1) || currentLocation.equals(wp2)|| currentLocation.equals(wp3) || currentLocation.equals(wp4)|| currentLocation.equals(wp5)|| currentLocation.equals(wp6)|| currentLocation.equals(wp7)|| currentLocation.equals(wp8)) {
            //  v.getCallbacks().afterTicks(1, () -> {
            v.invoke("Work-at","<col=ffff>Workbench",43754,3,workBenchSceneX,workBenchSceneY,false);
            // });
        }
    }
}


public void mineGuardian() {
    

    if (guardianRock != null) {
        int guardianRockSceneX = guardianRock.getSceneMinLocation().getX();
        int guardianRockSceneY = guardianRock.getSceneMinLocation().getY();
        
//        v.invoke("Fill","<col=ff9040>Colossal pouch</col>",2,57,abyssal_pouch_slot,9764864,false);
        if (currentLocation.equals(s_g_1) || currentLocation.equals(s_g_2) || currentLocation.equals(s_g_3) || currentLocation.equals(n_g_1)) {
            //    v.getCallbacks().afterTicks(1, () -> {
                   v.invoke("Mine","<col=ffff>Huge guardian remains",rune_rock,3,guardianRockSceneX , guardianRockSceneY,false);
                // });
             

  
        }
    }
}
fillPouch();
pouchManagement();
runBench();
mineGuardian();