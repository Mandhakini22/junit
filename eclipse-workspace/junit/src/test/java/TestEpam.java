
import static org.junit.Assert.*;

	import org.junit.Test;

	public class TestEpam {

		@Test
		public void test() {
			Epam a=new Epam();
			assertEquals("BCD",a.remove("ABCD"));
			assertEquals("CD",a.remove("AACD"));
			assertEquals("BCD",a.remove("BACD"));
			assertEquals("BBAA",a.remove("BBAA"));
			assertEquals("BAA",a.remove("AABAA"));
		}

}
