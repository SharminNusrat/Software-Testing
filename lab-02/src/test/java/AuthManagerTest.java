import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
public class AuthManagerTest {

    private UserRepository userRepository;
    private HashLibrary hashLibrary;
    private AuthManager authManager;

    @org.junit.Before
    public void setUp() throws Exception {
        userRepository = Mockito.mock(UserRepository.class);
        hashLibrary = Mockito.mock(HashLibrary.class);
        authManager = new AuthManager(userRepository, hashLibrary);

        User user = new User("nusrat@gmail.com", "123456");
        when(userRepository.findByEmail("nusrat@gmail.com")).thenReturn(user);
        when(hashLibrary.hash("123456", "123456")).thenReturn(true);
        when(hashLibrary.hash("wrongpassword", "123456")).thenReturn(false);
        when(userRepository.findByEmail("invalidemail@gmail.com")).thenThrow(IllegalArgumentException.class);
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void testLoginSucces() {
        boolean result = authManager.login("nusrat@gmail.com", "123456");
        assertTrue(result);
    }

    @Test
    public void testLoginUserNotFound() {
        assertThrows(IllegalArgumentException.class, () -> {
            authManager.login("invalidemail@gmail.com", "password");
        });
    }

    @Test
    public void testLoginPasswordMismatch() {
        assertThrows(IllegalArgumentException.class, () -> {
            authManager.login("nusrat@gmail.com", "wrongpassword");
        });
    }
}