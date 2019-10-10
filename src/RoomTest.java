class RoomTest {
        public static void main(String[] args) {
        Room room1 = new Room(34, 25, true);
        System.out.println("Pokój ma " + room1.size + "mkw. \nW pokoju jest klimatyzacja: " + room1.airConditioning + "\n" +
                "Temperatura w pokoju wynosi: " + room1.temperature + "stopni C.");
        room1.tempDown();
        System.out.println("Temperatura w pokoju wynosi: " + room1.temperature + "stopni C.\n");

        Room room2 = new Room(34, 15, true);
        System.out.println("Pokój ma " + room2.size + "mkw. \nW pokoju jest klimatyzacja: " + room2.airConditioning + "\n" +
                "Temperatura w pokoju wynosi: " + room2.temperature + "stopni C.");
        room1.tempDown();
        System.out.println("Temperatura w pokoju wynosi: " + room2.temperature + "stopni C.\n");

        Room room3 = new Room(34, 15, false);
        System.out.println("Pokój ma " + room3.size + "mkw. \nW pokoju jest klimatyzacja: " + room3.airConditioning + "\n" +
                "Temperatura w pokoju wynosi: " + room3.temperature + "stopni C.");
        room1.tempDown();
        System.out.println("Temperatura w pokoju wynosi: " + room3.temperature + "stopni C.\n");

        Room room4 = new Room(34, 25, false);
        System.out.println("Pokój ma " + room4.size + "mkw. \nW pokoju jest klimatyzacja: " + room4.airConditioning + "\n" +
                "Temperatura w pokoju wynosi: " + room4.temperature + "stopni C.");
        room1.tempDown();
        System.out.println("Temperatura w pokoju wynosi: " + room4.temperature + "stopni C.\n");
    }
}
