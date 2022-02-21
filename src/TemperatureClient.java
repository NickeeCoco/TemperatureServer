public class Client implements ClientListener{
    private String name;
    public Client(String name) {
        this.name = name;
    }

    @Override
    public void onUpdateTemperature(int newTemperature) {
        System.out.println("Hello " + name + "! Current temperature is " + newTemperature + "°C.");
    }
}
