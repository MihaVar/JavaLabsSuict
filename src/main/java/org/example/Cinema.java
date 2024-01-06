package org.example;
public class Cinema {
    private int[][][] hall;

    public Cinema(int hallNum, int rows, int seats) {
        hall = new int[hallNum][rows][seats];
    }

    public boolean bookSeats(int hallNum, int row, int[] seats) {

        if (row < 0 || row >= hall[hallNum].length ||
                hallNum < 0 || hallNum >= hall.length) {
            System.out.println("Invalid hall or row number");
            return false;
        }

        for (int seat : seats) {
            if (seat < 0 || seat >= hall[hallNum][row].length) {
                System.out.println("Incorrect seat number");
                return false;
            }
            if (hall[hallNum][row][seat] == 0)
            {
                hall[hallNum][row][seat] = 1;
            } else {
                System.out.println("This seat is already booked");
                return false;
            }
        }
        return true;
    }

    public boolean cancelBooking(int hallNum, int row, int[] seats)  {
        if (row < 0 || row >= hall[hallNum].length ||
                hallNum < 0 || hallNum >= hall.length) {
            System.out.println("Invalid hall or raw number");
            return false;
        }

        for (int seat : seats) {
            if (seat < 0 || seat >= hall[hallNum][row].length) {
                System.out.println("Incorrect seat number");
                return false;
            }
            hall[hallNum][row][seat] = 0;
        }
        return true;
    }

    public boolean checkAvailability(int screen, int numSeats) {
        if (screen < 0 || screen >= hall.length || numSeats <= 0) {
            System.out.println("Invalid screen or number of seats");
            return false;
        }


        for (int[] row : hall[screen]) {
            int availableSeats = 0;
            for (int seat : row) {
                if (seat == 0) {
                    availableSeats++;
                    if (availableSeats == numSeats) {
                        return true;
                    }
                } else {
                    availableSeats = 0;
                }
            }
        }

        System.out.println("No available seats found");
        return false;
    }


    public void printSeatingArrangement(int hallNum) {
        System.out.print("\t\t");
        for(int i = 0; i < hall[hallNum][0].length; i++) {
            System.out.print(i+1 + "\t");
        }
        System.out.println();
        for (int row = 1; row <= hall[hallNum].length; row++) {
            if(row >= 10) {
                System.out.print("   ");
            }
            else {
                System.out.print("\t");
            }
            System.out.print(row + " |");
            for(int seat: hall[hallNum][row-1]) {
                System.out.print("\t" + seat);
            }
            System.out.println(" | " + row);
        }
        System.out.print("\t\t");
        for(int i = 0; i < hall[hallNum][0].length; i++) {
            System.out.print(i+1 + "\t");
        }
        System.out.println();
    }
}
