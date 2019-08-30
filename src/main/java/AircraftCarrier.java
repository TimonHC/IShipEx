public class AircraftCarrier extends NavalShip {

    AircraftCarrier(int bomberCount, int interceptorCount){
        super(10, 10, 10);
        this.bomberCount = bomberCount;
        this.interceptorCount = interceptorCount;
    }

    protected int bomberCount;
    protected int interceptorCount;
    protected boolean firstRunway;
    protected boolean secondRunway;

    protected boolean isRunwayEmpty(){
        if(this.firstRunway || this.secondRunway){
            return true;
        }else {
            System.out.println("Busy runways.. ");
    return false;}
    }
    protected void interceptorTakeoff(){
        if ((interceptorCount > 0) && (isRunwayEmpty())) {
            interceptorCount-=1;
            System.out.println("Interceptor tooked off. Interceptors left " + interceptorCount);
        }else System.out.println("Interceptor can't take off. Possible reasons:\n -runways busy\n -no interceptors");
    }
    protected void interceptorLanding(){
        if (isRunwayEmpty()) {
            interceptorCount+=1;
            System.out.println("Interceptor landing on..");
        }else System.out.println("Interceptor can't land on. Possible reasons:\n -runways busy");
    }
    protected void bomberTakeoff(){
        if ((bomberCount > 0) && (isRunwayEmpty())) {
            bomberCount-=1;
            System.out.println("Bomber tooked off. Bombers left " + bomberCount);
        }else System.out.println("Bomber can't take off. Possible reasons:\n -runways busy\n -no bombers");
        }
    protected void bomberLanding(){
        if (isRunwayEmpty()) {
            bomberCount+=1;
            System.out.println("Bomber landing on..");
        } else System.out.println("Bomber can't land on. Possible reasons:\n -runways busy");
    }

    public void move() {
        System.out.println("Sailing..");
    }
    public void stop() {
    System.out.println("Engine stopped..");
    }
}
