import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusMilesServiceTest {

    @Test
    void shouldCalculateForRegistreredUnderLimit() {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        boolean registered = true;
        int miles = service.calculate(price, registered);
        int expected = 500;
        assertEquals(expected, miles);
    }

    @Test
    void shouldCalculateForRegistreredOverLimit() {
        BonusMilesService service = new BonusMilesService();
        int price = 1_000_000_60;
        boolean registered = true;
        int miles = service.calculate(price, registered);
        int expected = 500;
        assertEquals(expected, miles);
    }

    @Test
    void shouldCalculateForUnregistrered() {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        boolean registered = false;
        int miles = service.calculate(price, registered);
        int expected = 0;
        assertEquals(expected, miles);
    }
}