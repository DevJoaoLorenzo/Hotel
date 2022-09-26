package entities;

public class Reserva {
    private String name;
    private String email;

    public Reserva(String name, String email){
        this.name = name;
        this.email = email;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String toString() {
        return "Hóspede: "
                + name
                + "\nContato: "
                + email;
    }
}
