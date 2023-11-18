package director;

import builder.BusServiceBuilder;
import product.BusService;

public class BusServiceDirector {
    public BusService construct(BusServiceBuilder builder, String busNumbers, String route, String timing) {
        return builder.setBusNumbers(busNumbers).setRoute(route).setTiming(timing).build();
    }
}