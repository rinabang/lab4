package lab4;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;

import java.io.IOException;

import org.junit.jupiter.api.Test;

class CSVTest {

	@Test
	void testRead() throws IOException {
		CSVtoList csvfile = new CSVtoList();
		String file = "names.csv";
	    Throwable thrown = assertThrows(IOException.class, () -> {
	    	csvfile.read(file);
	    });
	    assertNotNull(thrown.getMessage());
	}
}
