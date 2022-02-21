public class WindClient implements WindClientListener {
    private String name;
    public WindClient(String name) {
        this.name = name;
    }

    @Override
    public void onWindUpdate(int speed) {
        System.out.println("Hello " + name + "! Current wind speed is " + speed + "km/h.");
    }
}
