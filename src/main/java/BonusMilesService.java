public class BonusMilesService {
    public int calculate(int cost, boolean registered) {
        if (registered) {
            return cost / 20;
        } else {
            return 0;
        }
    }
}
