public class BonusMilesService {
    public int calculate(int cost, boolean registered) {
        if (registered) {
            int bonus = cost / 20;
            int limit = 500;
            if (bonus > limit) {
                bonus = limit;
            }
            return bonus;
        } else {
            return 0;
        }
    }
}
