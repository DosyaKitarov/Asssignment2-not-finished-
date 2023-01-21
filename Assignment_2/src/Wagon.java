import java.util.ArrayList;
import java.util.Scanner;

public class Wagon {

    private int seatQuantity;

    private int ID;

    private ArrayList<Ticket> Tickets;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }


    public void createTickets(Ticket newTicket) {
        while(Tickets.size() < seatQuantity) {
            Tickets.add(newTicket);
        }
    }
    public Wagon( int seatQuantity, int ID) {
        this.seatQuantity = seatQuantity;
        this.ID=ID;
    }

    public int getSeatQuantity() {
        return seatQuantity;
    }

    public void setSeatQuantity(int seatQuantity) {
        this.seatQuantity = seatQuantity;
    }

    public ArrayList<Ticket> getTickets() {
        return Tickets;
    }

    public void setTickets(ArrayList<Ticket> tickets) {
        Tickets = tickets;
    }
    Wagon(){
        this.seatQuantity = 40;

    }
    public void buyTicket(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your name: ");
        Tickets.get(Main.IDcount.id).setPassengerName(scanner.next());

        System.out.println("Your Surname: ");
        Tickets.get(Main.IDcount.id).setPassengerSurname(scanner.next());

        System.out.println("Your age: ");
        Tickets.get(Main.IDcount.id).setPassengerAge(scanner.nextInt());

        Tickets.get(Main.IDcount.id).setTicketID(Main.IDcount.id);
        Main.IDcount.id++;
        System.out.println("Congratulation! You bought ticket.\n Your ID:"+Tickets.get(Main.IDcount.id).getTicketID()+"\n" );
    }
    public Wagon(int seatQuantity) {
        this.seatQuantity = seatQuantity;
    }

}
