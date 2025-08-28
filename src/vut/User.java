package vut;
public class User {
    private Long id;
    private String name;
    private String email;
    private String password;
    private Role role;
    private boolean verified = false;
    private String idNumber;
    private String idPdfPath;

    public User(Long id, String name, String email, String password, Role role) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPassword() { return password; }
    public Role getRole() { return role; }
    public boolean isVerified() { return verified; }
    public void setVerified(boolean verified) { this.verified = verified; }
    public String getIdNumber() { return idNumber; }
    public void setIdNumber(String idNumber) { this.idNumber = idNumber; }
    public String getIdPdfPath() { return idPdfPath; }
    public void setIdPdfPath(String idPdfPath) { this.idPdfPath = idPdfPath; }
}
