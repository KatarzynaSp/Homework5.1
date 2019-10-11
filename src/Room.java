class Room {
    private double size;
    private double temperature;
    private boolean airConditioning;
    private int limit = 20;

    public Room() {
    }

    public Room(double size, double temp, boolean ac) {
        this.size = size;
        temperature = temp;
        airConditioning = ac;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public boolean isAirConditioning() {
        return airConditioning;
    }

    public void setAirConditioning(boolean airConditioning) {
        this.airConditioning = airConditioning;
    }

    boolean tempDown() {
        if (airConditioning && temperature > limit) {
            --temperature;
            return true;
        } else {
            return false;
        }
    }
}