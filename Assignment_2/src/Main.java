public class Main {
    public static void main(String[] args) {
        Train T340L= new Train("Talgo",2281337,15,20,
                "250 km/h","Almaty - Astana","12.10.2023");
        Train K85W= new Train("Mixed",667890,20,30,
                "130 km/h","Almaty - Astana","24.4.2023");
        Train FT228= new Train("Freight Train",69420,36,50,
                "90 km/h","Almaty - Astana","3.8.2023");
        T340L.createWagon(new Wagon(),10);
        K85W.createWagon(new Wagon(),12);
        FT228.createFreightWagon(new FreightWagon(),36);
        T340L.createRestaurantWagon(new RestaurantWagon());
        K85W.createRestaurantWagon(new RestaurantWagon());
        T340L.wagon.get(1).buyTicket();

    }
    public static class IDcount{
        public static int id =1;
    }

}

