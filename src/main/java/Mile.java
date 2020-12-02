public class Mile {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        boolean registered = true;
        int miles = service.calculate(price, registered);
        System.out.println(miles);
    }
}
