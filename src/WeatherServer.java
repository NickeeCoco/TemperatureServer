import java.util.ArrayList;
import java.util.Random;

public class WeatherServer implements Runnable{
    Random temperature = new Random();
    Random wind = new Random();

    ArrayList<TemperatureClientListener> temperatureClientsCallback = new ArrayList<TemperatureClientListener>();
    ArrayList<WindClientListener> windClientsCallback = new ArrayList<WindClientListener>();

    public void registerTemperatureClient(TemperatureClientListener temperatureClientListener) {
        temperatureClientsCallback.add(temperatureClientListener);
    }

    public void registerWindClient(WindClientListener windClientListener) {
        windClientsCallback.add(windClientListener);
    }

    @Override
    public void run() {
        while(true) {
            int currentTemperature = temperature.nextInt(50);
            int currentWindSpeed = wind.nextInt(200);

            for (TemperatureClientListener client: temperatureClientsCallback) {
                client.onUpdateTemperature(currentTemperature);
            }

            for (WindClientListener client: windClientsCallback) {
                client.onWindUpdate(currentWindSpeed);
            }

            try{
                Thread.sleep(2000);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
