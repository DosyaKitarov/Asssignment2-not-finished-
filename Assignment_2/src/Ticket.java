import java.util.Scanner;

public class Ticket extends Wagon {
    private int ticketID=0;
    private String passengerName;
    private String passengerSurname;
    private int passengerAge;

    public int getTicketID() {
        return ticketID;
    }

    public void setTicketID(int ticketID) {
        this.ticketID = ticketID;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getPassengerSurname() {
        return passengerSurname;
    }

    public void setPassengerSurname(String passengerSurname) {
        this.passengerSurname = passengerSurname;
    }

    public int getPassengerAge() {
        return passengerAge;
    }

    public void setPassengerAge(int passengerAge) {
        this.passengerAge = passengerAge;
    }

    Ticket(){
        this(0,false,false,"","",0);
    }



    public Ticket(int ticketID, boolean isInvalid, boolean isChild,
                  String passengerName, String passengerSurname, int passengerAge) {
        this.ticketID = ticketID;
        this.passengerName = passengerName;
        this.passengerSurname = passengerSurname;
        this.passengerAge = passengerAge;
    }

}
