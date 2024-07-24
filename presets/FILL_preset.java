// Assuming these classes/methods exist
WorldPoint wp1 = new WorldPoint(3612, 9488, 0);
WorldPoint wp2 = new WorldPoint(3611, 9488, 0);
WorldPoint currentLocation = client.getLocalPlayer().getWorldLocation();
int abyssal_pouch = 26748;
int abyssal_pouch_slot = v.getInventory().slot(abyssal_pouch);


GameObject workBench = v.getGameObject().findNearest(43754);

if (workBench != null) {
    int workBenchSceneX = workBench.getSceneMinLocation().getX();
    int workBenchSceneY = workBench.getSceneMinLocation().getY();
    
    v.invoke("Fill","<col=ff9040>Colossal pouch</col>",2,57,abyssal_pouch_slot,9764864,false);
    if (currentLocation.equals(wp1) || currentLocation.equals(wp2)) {
        v.invoke("Work-at","<col=ffff>Workbench",43754,3,workBenchSceneX,workBenchSceneY,false);
    }
}