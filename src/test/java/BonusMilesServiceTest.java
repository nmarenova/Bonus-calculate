import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusMilesServiceTest {

    @Test
    void shudCalculateForRegistreredUnderLimit() {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        boolean registered = true;
        int miles = service.calculate(price, registered);
        int expected = 500;
        assertEquals(expected, miles);
    }

    @Test
    void shudCalculateForRegistreredOverLimit() {
        BonusMilesService service = new BonusMilesService();
        int price = 1000_000_60;
        boolean registered = true;
        int miles = service.calculate(price, registered);
        int expected = 500;
        assertEquals(expected, miles);
    }

    @Test
    void shudCalculateForUnregistrered() {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        boolean registered = false;
        int miles = service.calculate(price, registered);
        int expected = 0;
        assertEquals(expected, miles);
    }
}