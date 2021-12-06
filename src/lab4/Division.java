package lab4;
/** 
 * Класс сущности Division
 * @author Суховеркова Екатерина (3 курс 3 группа)
*/
public class Division {
	/** Поле id подразделения */
	private int id;
	/** Поле названия */
	private String title;
	/**
     * Конструктор
     * @param title - название
     */
	public Division(String title) {
		this.id = 100 + (int) title.toCharArray()[0];
		this.title = title;
	}
	/**
     * Метод получения id подразделения {@link Division#id}
     * @return возвращает id подразделения
     */
	public int getDivID() {
		return this.id;
	}
	/**
     * Метод получения названия подразделения {@link Division#title}
     * @return возвращает название
     */
	public String getTitle() {
		return this.title;
	}
}
