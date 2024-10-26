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