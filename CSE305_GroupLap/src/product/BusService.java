
package product;


public class BusService {
    String startLocation;
    String endLocation;
    String busNumbers;
    String route;
    String time;

    public BusService(String startLocation, String endLocation, String busNumbers, String route, String time) {
        this.startLocation = startLocation;
        this.endLocation = endLocation;
        this.busNumbers = busNumbers;
        this.route = route;
        this.time = time;
    }

    @Override
    public String toString() {
        return "BusService{" + "startLocation=" + startLocation + ", endLocation=" + endLocation + ", busNumbers=" + busNumbers + ", route=" + route + ", time=" + time + '}';
    }
    
    
}
