public class WindTurbine implements WindClientListener {
    private String name;

    public WindTurbine(String name) {
        this.name = name;
    }

    @Override
    public void onWindUpdate(int windSpeed) {
        if(windSpeed < 20) {
            System.out.println(name + " the wind turbine is now off.");
        } else if( windSpeed < 60) {
            System.out.println(name + " the wind turbine is now on.");
        } else {
            System.out.println("Due to severe winds, " + name + " the wind turbine is now in space.");
        }
    }
}
