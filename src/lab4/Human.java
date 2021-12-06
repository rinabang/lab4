package lab4;

/** 
 * Класс сущности Human
 * @author Суховеркова Екатерина (3 курс 3 группа)
*/
public class Human {
	/** Поле id */
	private int id;
	/** Поле имени */
	private String name;
	/** Поле пола */
	private String gender;
	/** Поле подразделения */
	private Division div;
	/** Поле зарплаты */
	private int salary;
	/** Поле даты рождения */
	private String birthDate;
	/**
     * Конструктор
     * @param id - id
     * @param name - имя
     * @param gender - пол
     * @param div - подразделение
     * @param salary - зарплата
     * @param birthDate - дата рождения
     */
	public Human(int id, String name, String gender, Division div, int salary, String birthDate) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.div = div;
		this.salary = salary;
		this.birthDate = birthDate;
	}
	/**
     * Метод получения id {@link Human#id}
     * @return возвращает id
     */
	public int getID() {
		return this.id;
	}
	/**
     * Метод получения имени {@link Human#name}
     * @return возвращает имя
     */
	public String getName() {
		return this.name;
	}
	/**
     * Метод получения пола {@link Human#gender}
     * @return возвращает пол
     */
	public String getGender() {
		return this.gender;
	}
	/**
     * Метод получения данных о подразделении {@link Human#div}
     * @return возвращает id и название подразделения
     */
	public Division getDiv() {
		return this.div;
	}
	/**
     * Метод получения зарплаты {@link Human#salary}
     * @return возвращает зарплату
     */
	public int getSalary() {
		return this.salary;
	}
	/**
     * Метод получения даты рождения {@link Human#birthDate}
     * @return возвращает дату рождения
     */
	public String getBirthDate() {
		return this.birthDate;
	}
}