class RoomTest {
    public static void main(String[] args) {
        Room room1 = new Room();
        room1.setSize(34);
        room1.setTemperature(25);
        room1.setAirConditioning(true);

        room1.showInfo();
        room1.tempDown();
        room1.showInfo2();

        Room room2 = new Room();
        room2.setSize(34);
        room2.setTemperature(15);
        room2.setAirConditioning(true);
        room2.showInfo();
        room2.tempDown();
        room2.showInfo2();

        Room room3 = new Room();
        room3.setSize(34);
        room3.setTemperature(15);
        room3.setAirConditioning(false);
        room3.showInfo();
        room3.tempDown();
        room3.showInfo2();

        Room room4 = new Room();
        room4.setSize(34);
        room4.setTemperature(25);
        room4.setAirConditioning(false);

        room4.showInfo();
        room4.tempDown();
        room4.showInfo2();
    }
}