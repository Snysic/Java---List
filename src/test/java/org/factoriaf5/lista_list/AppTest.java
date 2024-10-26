package org.factoriaf5.lista_list;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;

class HandlerWeekDaysTest {
    private HandlerWeekDays handler;

    @BeforeEach
    void setUp() {
        handler = new HandlerWeekDays();
        handler.createList();
    }

    @Test
    void testCreateList() {
        assertEquals(7, handler.getSizeList());
    }

    @Test
    void testGetDays() {
        List<String> days = handler.getDays();
        assertEquals(7, days.size());
        assertTrue(days.contains("Lunes"));
        assertTrue(days.contains("Domingo"));
    }

    @Test
    void testGetSizeList() {
        assertEquals(7, handler.getSizeList());
    }

    @Test
    void testDeleteDay() {
        handler.deleteDay("Martes");
        assertEquals(6, handler.getSizeList());
        assertFalse(handler.dayExist("Martes"));
    }

    @Test
    void testGetSpecificDayByName() {
        assertEquals("Viernes", handler.getSpecificDayByName("Viernes"));
        assertNull(handler.getSpecificDayByName("InvalidDay"));
    }

    @Test
    void testGetSpecificDayByIndex() {
        assertEquals("Lunes", handler.getSpecificDayByIndex(0));
        assertEquals("Domingo", handler.getSpecificDayByIndex(6));
        assertNull(handler.getSpecificDayByIndex(7));
    }

    @Test
    void testDayExist() {
        assertTrue(handler.dayExist("Sábado"));
        assertFalse(handler.dayExist("NoExistente"));
    }

    @Test
    void testSortByAlphabet() {
        handler.sortByAlphabet();
        assertEquals("Domingo", handler.getDays().get(0));
        assertEquals("Viernes", handler.getDays().get(6));
    }

    @Test
    void testEmptyList() {
        handler.emptyList();
        assertEquals(0, handler.getSizeList());
    }
}