public class Main {

    public static void main(String[] args) {
        AircraftCarrier TheodoreRoosevelt = new AircraftCarrier(1, 1);
        TheodoreRoosevelt.cannonAmmo = 1;
        TheodoreRoosevelt.cumulativeTorpedoAmmo = 1;
        TheodoreRoosevelt.explosiveTorpedoAmmo = 0;
        TheodoreRoosevelt.firstRunway = true;
        TheodoreRoosevelt.secondRunway = true;

        TheodoreRoosevelt.move();
        TheodoreRoosevelt.cannonFire();
        TheodoreRoosevelt.cumulativeTorpedoFire();
        TheodoreRoosevelt.interceptorTakeoff();
        TheodoreRoosevelt.bomberTakeoff();
        TheodoreRoosevelt.interceptorTakeoff();
        TheodoreRoosevelt.bomberTakeoff();
        TheodoreRoosevelt.interceptorLanding();
        TheodoreRoosevelt.bomberLanding();
        TheodoreRoosevelt.cannonFire();
        TheodoreRoosevelt.cumulativeTorpedoFire();
        TheodoreRoosevelt.stop();
    }
}
