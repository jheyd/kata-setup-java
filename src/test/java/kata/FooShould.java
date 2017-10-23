package kata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class FooShould {

	@Test
	public void name() throws Exception {
		assertThat("foo", is("bar"));
	}
}
