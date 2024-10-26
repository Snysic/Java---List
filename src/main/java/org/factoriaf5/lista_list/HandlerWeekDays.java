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

   public List<String> getDays() {
    return new ArrayList<>(days);
}

public int getSizeList() {
    return days.size();
}

public void deleteDay(String day) {
    days.remove(day);
}

public String getSpecificDayByName(String day) {
    return days.contains(day) ? day : null;
}

public String getSpecificDayByIndex(int index) {
    return (index >= 0 && index < days.size()) ? days.get(index) : null;
}

public boolean dayExist(String day) {
    return days.contains(day);
}

public void sortByAlphabet() {
    Collections.sort(days);
}

public void emptyList() {
    days.clear();
}
}