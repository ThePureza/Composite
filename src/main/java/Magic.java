public abstract class Magic {
    private String description;

    public Magic(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract String getMagic();
}
