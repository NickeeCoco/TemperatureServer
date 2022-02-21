public class WeatherClient implements TemperatureClientListener, WindClientListener{
    private String name;

    public WeatherClient(String name) {
        this.name = name;
    }

    @Override
    public void onUpdateTemperature(int newTemperature) {
        System.out.println("Hey weather enthusiast " + name + ", temperature is: " + newTemperature + "°C.");
    }

    @Override
    public void onWindUpdate(int speed) {
        System.out.println("Hey weather enthusiast " + name + ", wind speed is: " + speed + "km/h.");
    }
}
