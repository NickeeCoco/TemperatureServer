public class Main {
    public static void main(String[] args) {
        WeatherServer weatherServer = new WeatherServer();
        Thread t1 = new Thread(weatherServer);

        TemperatureClientListener alistair = new TemperatureClient("Alistair");
        TemperatureClientListener arthur = new Heater("Arthur");

        WindClientListener philippe = new WindClient("Philippe");
        WindClientListener charlie = new WindTurbine("Charlie");

        WeatherClient morgane = new WeatherClient("Morgane");


        weatherServer.registerTemperatureClient(alistair);
        weatherServer.registerTemperatureClient(arthur);

        weatherServer.registerWindClient(philippe);
        weatherServer.registerWindClient(charlie);

        weatherServer.registerTemperatureClient(morgane);
        weatherServer.registerWindClient(morgane);

        t1.run();
    }
}
