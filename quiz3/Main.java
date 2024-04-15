import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Get the list of persons
        List<Person> persons = PersonManager.getPersons();

        // Create a new person with the name "Nikoloz Bakuradze"
        Person nikoloz = new Person();
        nikoloz.setName("Nikoloz");
        nikoloz.setSurname("Bakuradze");
        nikoloz.setId("0000000000"); // Assuming a unique ID for Nikoloz

        // Choose one of the persons from the list as a reference for the room
        // Let's assume we check Nikoloz into the same room as the first person in the list
        Person referencePerson = !persons.isEmpty() ? persons.get(0) : null;

        // Create a HotelManager
        HotelManager hotelManager = new HotelManager();

        // Check in Nikoloz into the same room as the reference person
        if (referencePerson != null) {
            Room room = new Room(referencePerson.getId());
            hotelManager.checkIn(nikoloz, room);
        } else {
            System.out.println("No available rooms.");
        }

        // Display hotel guests and room information
        hotelManager.displayInfo();
    }
}
