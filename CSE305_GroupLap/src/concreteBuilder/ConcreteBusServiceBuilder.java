package concreteBuilder;

import builder.BusServiceBuilder;
import product.BusService;

// ConcreteBusServiceBuilder class extends BusServiceBuilder to implement the construction steps public class ConcreteBusServiceBuilder extends BusServiceBuilder { @Override public BusServiceBuilder setBusNumbers(String busNumbers) { this.busNumbers = busNumbers; return this; }

public class ConcreteBusServiceBuilder extends BusServiceBuilder {
    public ConcreteBusServiceBuilder(String startLocation, String endLocation) {
        super(startLocation, endLocation);
        //TODO Auto-generated constructor stub
    }

    @Override
    public BusServiceBuilder setBusNumbers(String busNumbers) {
        this.busNumbers = busNumbers;
        return this;
    }

    @Override
    public BusServiceBuilder setRoute(String route) {
        this.route = route;
        return this;
    }

    @Override
    public BusServiceBuilder setTiming(String timing) {
        this.timing = timing;
        return this;
    }

    @Override
    public BusService build() {
        return new BusService(startLocation, endLocation, busNumbers, route, timing);
    }
}