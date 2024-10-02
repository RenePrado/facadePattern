public class FrontDesk {
    private Valet valet;
    private Cart cart;
    private HouseKeeping houseKeeping;

    public FrontDesk(Valet valet, Cart cart, HouseKeeping houseKeeping) {
        this.valet = valet;
        this.cart = cart;
        this.houseKeeping = houseKeeping;
    }

    public void performService()
    {
        valet.service();
        houseKeeping.service();
        cart.service();
    }
}
