class Room {
    double size;
    double temperature;
    boolean airConditioning;
    int limit = 20;

    Room(double size, double temp, boolean ac) {
        this.size = size;
        temperature = temp;
        airConditioning = ac;
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
