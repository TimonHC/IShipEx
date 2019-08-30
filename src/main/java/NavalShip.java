public abstract class NavalShip implements IShip {

    NavalShip(int cannonAmmo, int cumulativeTorpedoAmmo, int explosiveTorpedoAmmo){
        this.cannonAmmo = cannonAmmo;
        this.cumulativeTorpedoAmmo = cumulativeTorpedoAmmo;
        this.explosiveTorpedoAmmo = explosiveTorpedoAmmo;
    }

    int cannonAmmo;
    int cumulativeTorpedoAmmo;
    int explosiveTorpedoAmmo;

    void cannonFire() {
        if (cannonAmmo>0){
            System.out.println("Boom! Cannon shell went");
            cannonAmmo -= 1;
        }else
            System.out.println("No ammo, captain");
    }
    void cumulativeTorpedoFire(){
        if (cumulativeTorpedoAmmo>0){
            cumulativeTorpedoAmmo-=1;
            System.out.println("Pshhh! Cumulative torpedo went");
        }else
            System.out.println("No ammo, captain");

    }
    void explosiveTorpedoFire(){
        if (explosiveTorpedoAmmo>0){
            explosiveTorpedoAmmo-=1;
            System.out.println("Pshhh! Explosive torpedo went");
        }else
            System.out.println("No ammo, captain");

    }

    public void move() {
    }

    public void stop() {
    }
}