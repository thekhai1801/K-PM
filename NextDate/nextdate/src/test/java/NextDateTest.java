import com.nextdate.example.NextDate;

public class NextDateTest {

    @Test
    public void testNextDateNormal() {
        assertEquals("03/02/2012", NextDate.nextDate(3, 1, 2012)); // Normal case
    }

    private void assertEquals(String string, String nextDate) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
    }

    @Test
    public void testNextDateLastDayOfMonth() {
        assertEquals("01/02/2012", NextDate.nextDate(31, 1, 2012)); // Last day of month
    }

    @Test
    public void testNextDateLeapYear() {
        assertEquals("01/03/2012", NextDate.nextDate(29, 2, 2012)); // Leap year
    }

    @Test
    public void testNextDateFirstDayOfYear() {
        assertEquals("01/01/2013", NextDate.nextDate(31, 12, 2012)); // First day of year
    }

    @Test
    public void testNextDateLastDayOfYear() {
        assertEquals("01/01/1813", NextDate.nextDate(31, 12, 1812)); // Last day of year
    }
}
