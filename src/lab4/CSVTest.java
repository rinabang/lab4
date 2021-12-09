package lab4;

import java.io.IOException;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class CSVTest {

	@Test
	void testRead() throws IOException {
		CSVtoList csvfile = new CSVtoList();
		String file = "names.csv";
	    try {
	    	csvfile.read(file);
	    	} catch (IOException thrown) {
	    		Assert.assertNotEquals("", thrown.getMessage());
	    		}
	}
}
