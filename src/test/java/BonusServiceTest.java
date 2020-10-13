import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @org.junit.jupiter.api.Test
    void shouldCalculateUnregisteredUnderLimit() {
        BonusService service = new BonusService();
        long amount = 1000_60;
        boolean registered = false;
        long expected = 30;
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateRegistered() {
        BonusService service = new BonusService();
        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateUnregistered() {
        BonusService service = new BonusService();
        long amount = 1000_60;
        boolean registered = false;
        long expected = 10;
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }
}
