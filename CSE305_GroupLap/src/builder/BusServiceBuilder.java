package builder;

import product.BusService;

public abstract class BusServiceBuilder {
    protected String startLocation;
    protected String endLocation;
    protected String busNumbers = "";
    protected String route = "";
    protected String timing = "";

    public BusServiceBuilder(String startLocation, String endLocation) {
        this.startLocation = startLocation;
        this.endLocation = endLocation;
    }

    public abstract BusServiceBuilder setBusNumbers(String busNumbers);

    public abstract BusServiceBuilder setRoute(String route);

    public abstract BusServiceBuilder setTiming(String timing);

    public abstract BusService build();
}