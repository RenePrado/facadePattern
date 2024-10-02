public class HotelApp {
    public static void main(String[] args) {
        Valet valet = new Valet("NKN-8792");
        Cart cart = new Cart(4);
        HouseKeeping houseKeeping = new HouseKeeping(102);

        FrontDesk frontDesk = new FrontDesk(valet, cart, houseKeeping);

        frontDesk.performService();
    }
}
