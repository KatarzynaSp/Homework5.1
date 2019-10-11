class RoomTest {
    static void showInfo(Room room) {
                System.out.println("Pokój ma " + room.getSize() + "mkw. \nW pokoju jest klimatyzacja: " + room.isAirConditioning() + "\n" +
                "Temperatura w pokoju wynosi: " + room.getTemperature() + "stopni C.");
    }

    static void showTemp(Room room) {
           System.out.println("Temperatura w pokoju wynosi: " + room.getTemperature() + "stopni C.");
    }

    public static void main(String[] args) {

        Room room1 = new Room(34, 25, true);
        showInfo(room1);
        room1.tempDown();
        showTemp(room1);

        Room room2 = new Room(34, 15, true);
        showInfo(room2);
        room2.tempDown();
        showTemp(room2);

        Room room3 = new Room(34, 15, false);
        showInfo(room3);
        room3.tempDown();
        showTemp(room3);

        Room room4 = new Room(34, 25, false);
        showInfo(room4);
        room4.tempDown();
        showTemp(room4);
    }
}