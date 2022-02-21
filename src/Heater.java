public class Heater implements TemperatureClientListener{
    private String name;

    public Heater(String name) {
        this.name = name;
    }

    @Override
    public void onUpdateTemperature(int newTemperature) {
        if(newTemperature < 20) {
            System.out.println(name + " the heater is now on.");
        } else {
            System.out.println(name + " the heater is now off.");
        }
    }
}
