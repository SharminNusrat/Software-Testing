public class AuthManager {
    private UserRepository userRepository;
    private HashLibrary hashLibrary;

    public AuthManager(UserRepository userRepository, HashLibrary hashLibrary) {
        this.userRepository = userRepository;
        this.hashLibrary = hashLibrary;
    }

    public boolean login(String email, String password) {
        User user = userRepository.findByEmail(email);

        if (user == null) {
            throw new IllegalArgumentException("User not found");
        }

        if(!hashLibrary.hash(password, user.getPassword())) {
            throw new IllegalArgumentException("Invalid password");
        }

        return true;
    }
}
