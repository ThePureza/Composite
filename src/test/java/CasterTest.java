import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CasterTest {

    @Test
    void needReturnSpellBookCaster() {
        School school1 = new School("Padrões de Criacao");

        School school2 = new School("Padrões Estruturais");
        Spell spell21 = new Spell("Padrão Composite", 2);
        school2.addMagic(spell21);

        School school3 = new School("Padrões Comportamentais");
        Spell spell31 = new Spell("Padrão Observer", 3);
        Spell spell32 = new Spell("Padrão State", 4);
        school3.addMagic(spell31);
        school3.addMagic(spell32);

        School ementa = new School("Padrões de Projeto");
        ementa.addMagic(school1);
        ementa.addMagic(school2);
        ementa.addMagic(school3);

        Disciplina disciplina = new Disciplina();
        disciplina.setEmenta(ementa);

        assertEquals("School: Padrões de Projeto\n" +
                "School: Padrões de Criacao\n" +
                "School: Padrões Estruturais\n" +
                "Tópico: Padrão Composite - carga horária: 2\n" +
                "School: Padrões Comportamentais\n" +
                "Tópico: Padrão Observer - carga horária: 3\n" +
                "Tópico: Padrão State - carga horária: 4\n", disciplina.getEmenta());
    }

    @Test
    void deveRetornarExecacaoDisciplinaSemEmenta() {
        try {
            Disciplina disciplina = new Disciplina();
            disciplina.getEmenta();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Disciplina sem ementa", e.getMessage());
        }
    }
}
