import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CasterTest {

    @Test
    void needReturnSpellBookCaster() {
        School school1 = new School("Abjuração");

        School school2 = new School("Conjuração");
        Spell spell21 = new Spell("Invocar Elemental Menor", 15, "1d6 de dano elemental");
        school2.addMagic(spell21);

        School school3 = new School("Evocação");
        Spell spell31 = new Spell("Bola de Fogo", 18, "4d6 de dano de Fogo");
        Spell spell32 = new Spell("Mísseis Mágicos", 12, "2d4 de dano Mágico");
        school3.addMagic(spell31);
        school3.addMagic(spell32);

        School spellBook = new School("Spell Book");
        spellBook.addMagic(school1);
        spellBook.addMagic(school2);
        spellBook.addMagic(school3);

        Caster caster = new Caster();
        caster.setSpellBook(spellBook);

        assertEquals("School: Spell Book\n" +
                "School: Abjuração\n" +
                "School: Conjuração\n" +
                "Spell: Invocar Elemental Menor - DC: 2 - Damage: 1d6 de dano elemental\n" +
                "School: Evocação\n" +
                "Spell: Bola de Fogo - DC: 3 - Damage: 4d6 de dano de Fogo\n" +
                "Spell: Mísseis Mágicos - DC: 4 - Damage: 2d4 de dano Mágico\n", caster.getSpellBook());
    }

    @Test
    void needReturnExceptionCasterWithoutSpellBook() {
        try {
            Caster caster = new Caster();
            caster.getSpellBook();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Caster don't have the spell book", e.getMessage());
        }
    }
}
