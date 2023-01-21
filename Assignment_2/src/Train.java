import java.util.ArrayList;


public class Train {


    private String trainType;
    private int wagonQuantity;
    private String maxSpeed;
    private String direction;
    private String date;
    private int id;
    private int maxWagon;
    ArrayList<Wagon> wagon= new ArrayList<Wagon>();
    ArrayList<RestaurantWagon> RestaWagon= new ArrayList<RestaurantWagon>();
    ArrayList<FreightWagon> FreiWagon= new ArrayList<FreightWagon>();

//--------------------------------------------------------------------------------------------------------//


    //Getters and setters
    public ArrayList<Wagon> getWagon() {
        return wagon;
    }

    public void setWagon(ArrayList<Wagon> Wagon) {
        this.wagon = Wagon;
    }
    public int getMaxWagon() {
        return maxWagon;
    }

    public void setMaxWagon(int maxWagon) {
        this.maxWagon = maxWagon;
    }

    public String getTrainType() {
        return trainType;
    }

    public void setTrainType(String trainType) {
        this.trainType = trainType;
    }

    public int getWagonQuantity() {
        return wagonQuantity;
    }
    public ArrayList<FreightWagon> getFreiWagon() {
        return FreiWagon;
    }

    public void setFreiWagon(ArrayList<FreightWagon> freiWagon) {
        FreiWagon = freiWagon;
    }

    public ArrayList<RestaurantWagon> getRestaWagon() {
        return RestaWagon;
    }

    public void setRestaWagon(ArrayList<RestaurantWagon> restaWagon) {
        RestaWagon = restaWagon;
    }
    public void setWagonQuantity(int wagonQuantity) {
        this.wagonQuantity = wagonQuantity;
    }

    public String getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(String maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

//--------------------------------------------------------------------------------------------------------//


    public void createWagon(Wagon newWagon,int n) {
        while(wagon.size() < wagonQuantity && wagon.size() < n) {
            wagon.add(newWagon);
            int i =0;
            wagon.get(i).createTickets(new Ticket());
        }

    }
    public void createRestaurantWagon(RestaurantWagon newRestWagon) {
        while(RestaWagon.size() < wagonQuantity-wagon.size()) {
            RestaWagon.add(newRestWagon);
        }
    }
    public void createFreightWagon(FreightWagon newWagon,int n) {
        while(FreiWagon.size() < wagonQuantity) {
            FreiWagon.add(newWagon);
        }
    }
    public void addWagon(Wagon newWagon) {
        if(wagon.size() < maxWagon) {
            wagon.add(newWagon);
            int i =0;
            wagon.get(i).createTickets(new Ticket());

            wagonQuantity++;
        } else {
            System.out.println("Cannot add more wagons. Maximum wagon limit reached.");
        }
    }
    public void addRestaWagon(RestaurantWagon newWagon) {
        if(RestaWagon.size() < maxWagon) {
            RestaWagon.add(newWagon);
            wagonQuantity++;
        } else {
            System.out.println("Cannot add more wagons. Maximum wagon limit reached.");
        }
    }
    public void addFreightWagon(FreightWagon newWagon) {
        if(FreiWagon.size() < maxWagon) {
            FreiWagon.add(newWagon);
            wagonQuantity++;
        } else {
            System.out.println("Cannot add more wagons. Maximum wagon limit reached.");
        }
    }

//--------------------------------------------------------------------------------------------------------//


//Constructors
    Train(){
    }
    Train(String trainType,int id, int wagonQuantity,int maxWagon ,String maxSpeed,String direction,String date){
        this.maxSpeed=maxSpeed;
        this.id=id;
        this.trainType=trainType;
        this.wagonQuantity =wagonQuantity;
        this.maxWagon=maxWagon;
        this.direction=direction;
        this.date=date;
    }

}
