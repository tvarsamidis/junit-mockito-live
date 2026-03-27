package gr.codehub.unit.util;

import gr.codehub.unit.functional.Titler;

import java.util.List;

public class TitleExample {
    public static void main(String[] args) {
        Titler t = (s) -> System.out.println("*** " + s + " ***");
        List<String> bestMovies = List.of("Watch Paint Dry", "The Big Sleep", "Super Non-hero");
        bestMovies.forEach(t::showTitle);
    }
}
