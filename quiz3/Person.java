package quizes.q3.nikoloz_bakuradze_2;

public class Person {

    private String id;
    private String name;
    private String surname;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    
    public void checkIn(String roomId) {
        this.id = roomId;
    }
    
    public void checkOut() {
        this.id = null;
    }
}