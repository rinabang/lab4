package lab4;

/** 
 * ����� �������� Human
 * @author ����������� ��������� (3 ���� 3 ������)
*/
public class Human {
	/** ���� id */
	private int id;
	/** ���� ����� */
	private String name;
	/** ���� ���� */
	private String gender;
	/** ���� ������������� */
	private Division div;
	/** ���� �������� */
	private int salary;
	/** ���� ���� �������� */
	private String birthDate;
	/**
     * �����������
     * @param id - id
     * @param name - ���
     * @param gender - ���
     * @param div - �������������
     * @param salary - ��������
     * @param birthDate - ���� ��������
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
     * ����� ��������� id {@link Human#id}
     * @return ���������� id
     */
	public int getID() {
		return this.id;
	}
	/**
     * ����� ��������� ����� {@link Human#name}
     * @return ���������� ���
     */
	public String getName() {
		return this.name;
	}
	/**
     * ����� ��������� ���� {@link Human#gender}
     * @return ���������� ���
     */
	public String getGender() {
		return this.gender;
	}
	/**
     * ����� ��������� ������ � ������������� {@link Human#div}
     * @return ���������� id � �������� �������������
     */
	public Division getDiv() {
		return this.div;
	}
	/**
     * ����� ��������� �������� {@link Human#salary}
     * @return ���������� ��������
     */
	public int getSalary() {
		return this.salary;
	}
	/**
     * ����� ��������� ���� �������� {@link Human#birthDate}
     * @return ���������� ���� ��������
     */
	public String getBirthDate() {
		return this.birthDate;
	}
}