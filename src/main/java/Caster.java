public class Caster {
    private Magic spellBook;

    public void setSpellBook(Magic spellBook) {
        this.spellBook = spellBook;
    }

    public String getSpellBook() {
        if (this.spellBook == null) {
            throw new NullPointerException("Caster don't have the spell book");
        }
        return this.spellBook.getMagic();
    }
}
