package fixação;

public class Client {
    private String name;
    private String email;
    private String birthDate;

    public Client (String name, String email, String birthDate){
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getBirthDate() {
        return birthDate;
    }
}
