import java.util.ArrayList;

public class Hotel {
    private ArrayList<Room> rooms;
    private ArrayList<Booking> bookings;

    public Hotel() {
        rooms = new ArrayList<>();
        bookings = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void bookRoom(Guest guest, int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber && !room.isBooked()) {
                bookings.add(new Booking(guest, room));
                System.out.println("Room " + roomNumber + " successfully booked for " + guest.getName());
                return;
            }
        }
        System.out.println("Room " + roomNumber + " is not available.");
    }

    public void showBookings() {
        if (bookings.isEmpty()) {
            System.out.println("No bookings found.");
        } else {
            for (Booking booking : bookings) {
                System.out.println(booking);
            }
        }
    }

    public void showRooms() {
        for (Room room : rooms) {
            System.out.println(room);
        }
    }
}
