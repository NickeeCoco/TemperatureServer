import java.util.ArrayList;
import java.util.Random;

public class TemperatureServer implements Runnable{
    Random r = new Random();

    ArrayList<ClientListener> clientsCallback = new ArrayList<ClientListener>();

    public void registerClient(ClientListener clientListener) {
        clientsCallback.add(clientListener);
    }

    @Override
    public void run() {
        while(true) {
            int currentTemperature = r.nextInt(50);
            for (ClientListener client: clientsCallback) {
                client.onUpdateTemperature(currentTemperature);
            }

            try{
                Thread.sleep(2000);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
