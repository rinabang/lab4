package lab4;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;
/** 
 * ����� �������������� ������ csv � List
 * @author ����������� ��������� (3 ���� 3 ������)
*/
public class CSVtoList {
	/**
     * ����� �������������� ������ csv � List
     * @param csvFilePath - ���� � ����� csv
     * @return ���������� ������ ���� Human
     */
	public List<Human> read(String csvFilePath) throws IOException {
		try {
			CSVReader reader = new CSVReader(new FileReader(csvFilePath), ';');
			List<Human> humans = new ArrayList<Human>();
			String[] line;
			line = reader.readNext();
			while ((line = reader.readNext()) != null) {
				humans.add(new Human(Integer.parseInt(line[0]), line[1], line[2], new Division(line[4]), Integer.parseInt(line[5]), line[3]));
			}
			return humans;
		} catch (IOException e) { System.err.println("Problem opening file: " + csvFilePath); }
		return null;
	}
}