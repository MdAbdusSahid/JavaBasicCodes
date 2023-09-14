import java.util.*;

class Movie {
    private int ticket = 50;
    private static Movie m = null;

    private Movie() {

    }

    public static Movie getObj() {
        if (m == null)
            m = new Movie();
        return m;
    }

    public void bookTickets(int n) {
        if (n > ticket) {
            System.out.println("Tickets are all booked!");
            return;
        }
        System.out.println(n + " Tocket Confrimed");
        ticket -= n;
    }
}

class TicketsBooking {
    static void bookATicket() {
        Scanner scn = new Scanner(System.in);
        System.out.println("How many Tickets do you want");
        int t = scn.nextInt();
        Movie m = Movie.getObj();
        m.bookTickets(t);
    }
}

class MainMovie {
    public static void main(String[] args) {
        TicketsBooking.bookATicket();
        TicketsBooking.bookATicket();
    }
}
