class Room {
    private double size;
    private double temperature;
    private boolean airConditioning;
    private int limit = 20;

    public Room() {
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

    protected void showInfo() {
        System.out.println("Pokój ma " + getSize() + "mkw. \nW pokoju jest klimatyzacja: " + isAirConditioning() + "\n" +
                "Temperatura w pokoju wynosi: " + getTemperature() + "stopni C.");
    }

    protected void showInfo2() {
        System.out.println("Temperatura w pokoju wynosi: " + getTemperature() + "stopni C.");
    }
}