package org.example;

public class Main {
    public static void main(String[] args) {
        Cinema cinema = new Cinema(2, 10, 19);
        cinema.bookSeats(1, 3, new int[]{1, 2, 6, 7, 8, 9, 13, 16});
        cinema.bookSeats(1, 8, new int[]{5, 6, 8, 14, 17});
        cinema.bookSeats(1, 5, new int[]{4, 5, 6, 9, 10, 11});
        cinema.bookSeats(1, 9, new int[]{6, 9, 10, 17, 18});
        cinema.bookSeats(1, 1, new int[]{10, 11});
        cinema.bookSeats(1, 2, new int[]{5, 6, 7, 8, 17, 18});

        cinema.printSeatingArrangement(1);
        cinema.checkAvailability(0, 3);
    }
}
