public class Spell extends Magic{
    private Integer difficultyClass;
    private String damage;

    public Spell(String description, Integer dc, String damage) {
        super(description);
        this.difficultyClass = dc;
        this.damage = damage;
    }

    public int getDifficultyClass() {
        return difficultyClass;
    }

    public void setDifficultyClass(Integer difficultyClass) {
        this.difficultyClass = difficultyClass;
    }

    public String getMagic() {
        return "Spell: " + this.getDescription() + " - DC: " + this.difficultyClass + "\n" + " - Damage: " + this.damage + "\n";
    }
}
