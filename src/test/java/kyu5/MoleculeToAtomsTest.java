package kyu5;

import org.assertj.core.api.Assertions;
import org.assertj.core.data.MapEntry;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

class MoleculeToAtomsTest {

    @Test
    void testWaterMolecule() {
        // given/when
        Map<String, Integer> atoms = MoleculeToAtoms.getAtoms("H2O");

        // then
        assertThat(atoms).contains(MapEntry.entry("H", 2), MapEntry.entry("O", 1));
    }

    @Test
    void testMagensiumHydroxideMolecule() {
        // given/when
        Map<String, Integer> atoms = MoleculeToAtoms.getAtoms("Mg(OH)2");

        // then
        assertThat(atoms).contains(MapEntry.entry("Mg", 1), MapEntry.entry("O", 2), MapEntry.entry("H", 2));
    }

    @Test
    void testFremySaltMolecule() {
        // given/when
        Map<String, Integer> atoms = MoleculeToAtoms.getAtoms("K4[ON(SO3)2]2");

        // then
        assertThat(atoms).contains(MapEntry.entry("K", 4), MapEntry.entry("O", 14), MapEntry.entry("N", 2),
                MapEntry.entry("S", 4));
    }

    @Test
    void testFBadInput() {
        // given/when
        Throwable thrown = catchThrowable(() -> MoleculeToAtoms.getAtoms("pie"));

        // then
        assertThat(thrown).isInstanceOf(IllegalArgumentException.class);
    }
}