public class TemperatureClient implements TemperatureClientListener{
    private String name;
    public TemperatureClient(String name) {
        this.name = name;
    }

    @Override
    public void onUpdateTemperature(int newTemperature) {
        System.out.println("Hello " + name + "! Current temperature is " + newTemperature + "°C.");
    }
}
