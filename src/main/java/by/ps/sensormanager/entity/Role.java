package by.ps.sensormanager.entity;

public enum Role {

    ADMIN("Administrator"),
    VIEWER("Viewer");

    private final String description;

    Role(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
