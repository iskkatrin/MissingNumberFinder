import org.example.MissingNumberFinder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MissingNumberFinderTest {

    @Test
    public void testFindMissingNumber() {

        assertEquals(4, MissingNumberFinder.findMissingNumber(new int[]{5, 0, 1, 3, 2}));

        assertEquals(8, MissingNumberFinder.findMissingNumber(new int[]{7, 9, 10, 11, 12}));

        assertEquals(1, MissingNumberFinder.findMissingNumber(new int[]{0, 2, 3}));

        assertEquals(3, MissingNumberFinder.findMissingNumber(new int[]{0, 1, 2}));

        assertEquals(3, MissingNumberFinder.findMissingNumber(new int[]{0, 1, 2}));

        assertEquals(4, MissingNumberFinder.findMissingNumber(new int[]{0, 1, 2, 3, 5}));
    }
}
