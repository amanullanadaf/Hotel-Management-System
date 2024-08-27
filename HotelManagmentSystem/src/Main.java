public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();

        // Add rooms to the hotel
        hotel.addRoom(new Room(101, "Single"));
        hotel.addRoom(new Room(102, "Double"));
        hotel.addRoom(new Room(103, "Suite"));

        // Show available rooms
        System.out.println("Available rooms:");
        hotel.showRooms();

        // Create a guest and book a room
        Guest guest = new Guest("samiulla nadaf", "123-456-7890");
        hotel.bookRoom(guest, 102);

        // Show bookings
        System.out.println("\nCurrent bookings:");
        hotel.showBookings();

        // Show available rooms after booking
        System.out.println("\nAvailable rooms after booking:");
        hotel.showRooms();
    }
}
