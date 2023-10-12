package org.example;

public enum Role {
    USER("User"),
    MODERATOR("Moderator"),
    DEVELOPER("Developer"),
    ADMIN("Admin");

    private final String role;

    Role(String role) {
        this.role = role;
    }

    public String getRole() {
        return this.role;
    }
}
