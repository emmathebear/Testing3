import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void dataToItalianLONG_ISO() {
        String iso = Main.dataToItalianLONG("2023-03-01T13:00:00Z");
        assertEquals("01 marzo 2023", iso);
    }

    @Test
    public void dataToItalianLONG_ISO_2() {
        String iso = Main.dataToItalianLONG("2023-04-02T13:00:00Z");
        assertEquals("02 aprile 2023", iso);
    }

    @Test
    public void dataToItalianLONG_ISO_null() {
        String iso = Main.dataToItalianLONG(null);
        assertNull(iso);
    }

    @Test
    public void dataToItalianLONG_ISO_exception() {
        String iso = Main.dataToItalianLONG("ciao");
        assertNull(iso);
    }

}