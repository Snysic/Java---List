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

}