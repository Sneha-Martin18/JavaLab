public class UserAccessLogger {

    // Inner User class to demonstrate access modifiers and final keyword
    static class User {
        public String username;            // Public: accesible everywhere 
        protected String email;            // Protected: accessible in the same package
        private String password;           // Private: accessible only within this class
        public static final String SYSTEM_NAME = "UserAccessSystem"; // Final constant

        // Constructor to initialize user details
        User(String username, String email, String password) {
            this.username = username;
            this.email = email;
            this.password = password;
        }

        // Public method to access private field
        public String getPassword() {
            return password;
        }
    }

    // Main method to test access control
    public static void main(String[] args) {
        // Create a User object
        User u = new User("sneha123", "sneha@example.com", "mypassword");

        // Access public field - allowed
        System.out.println("Username: " + u.username);

        // Access protected field - allowed (same class in same file)
        System.out.println("Email: " + u.email);

        // Access private field directly - NOT allowed (would cause error if uncommented)
        // System.out.println("Password: " + u.password); // ❌ Not accessible

        // Access private field using public method
        System.out.println("Password (via method): " + u.getPassword());

        // Access final constant
        System.out.println("System Name: " + User.SYSTEM_NAME);

        // Attempt to change final constant - NOT allowed (would cause error)
        // User.SYSTEM_NAME = "AnotherSystem"; // ❌ Not allowed
    }
}
