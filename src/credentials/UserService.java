package credentials;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserService {
	

	    private  List<User> users = new ArrayList<>();

	    // Create
	    public User createUser(User user) {
	        users.add(user);
	        return user;
	    }

	    // Read
	    public List<User> getAllUsers() {
	        return users;
	    }

	    public Optional<User> getUserByUsername(String username) {
	        return users.stream()
	                .filter(user -> user.getUsername().equals(username))
	                .findFirst();
	    }

	    // Update
	    public Optional<User> updateUser(String username, User updatedUser) {
	        Optional<User> existingUser = getUserByUsername(username);
	        existingUser.ifPresent(user -> {
	            user.setPassword(updatedUser.getPassword());
	            user.setActive(updatedUser.isActive());
	        });
	        return existingUser;
	    }

	    // Delete
	    public boolean deleteUser(String username) {
	        return users.removeIf(user -> user.getUsername().equals(username));
	    }
	}


