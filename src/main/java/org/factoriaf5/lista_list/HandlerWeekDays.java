package org.factoriaf5.lista_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HandlerWeekDays {
    private List<String> days;

    public HandlerWeekDays() {
        days = new ArrayList<>();
    }

    public void createList() {
        days.clear();
        days.add("Lunes");
        days.add("Martes");
        days.add("Miércoles");
        days.add("Jueves");
        days.add("Viernes");
        days.add("Sábado");
        days.add("Domingo");
    }

  