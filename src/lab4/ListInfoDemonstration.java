package lab4;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/** 
 * Класс для демонстрации данных в List
 * @author Суховеркова Екатерина (3 курс 3 группа)
*/
public class ListInfoDemonstration {

	public static void main(String[] args) throws IOException {
		CSVtoList csvfile = new CSVtoList();
		List<Human> humans = new ArrayList<Human>();
		humans = csvfile.read("foreign_names.csv");
		System.out.println("id     name   gender  divID  title  salary  birthDate");
		for(int i = 0; i < humans.size(); i++) {
			System.out.println(humans.get(i).getID() + "  " + humans.get(i).getName() + "  " + humans.get(i).getGender() + "   " + 
		        humans.get(1).getDiv().getDivID() + "   " + humans.get(1).getDiv().getTitle() + "   " + humans.get(i).getSalary() + "   " + 
					humans.get(i).getBirthDate());
		}
	}
}
