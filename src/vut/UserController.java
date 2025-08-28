package vut;
import java.util.ArrayList;
import java.util.List;

public class UserController {
    private List<User> users = new ArrayList<>();
    private long userIdCounter = 1;

    public User register(String name, String email, String password, Role role) {
        User user = new User(userIdCounter++, name, email, password, role);
        users.add(user);
        System.out.println("Registered " + role + ": " + name);
        return user;
    }

    public void verifySeller(User seller, String idNumber, String idPdfPath) {
        if (seller.getRole() != Role.SELLER) {
            System.out.println("User is not a seller.");
            return;
        }
        seller.setVerified(true);
        seller.setIdNumber(idNumber);
        seller.setIdPdfPath(idPdfPath);
        System.out.println("Seller verified: " + seller.getName());
    }

    public List<User> getAllUsers() {
        return users;
    }
}
