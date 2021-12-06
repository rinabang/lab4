package lab4;
/** 
 * ����� �������� Division
 * @author ����������� ��������� (3 ���� 3 ������)
*/
public class Division {
	/** ���� id ������������� */
	private int id;
	/** ���� �������� */
	private String title;
	/**
     * �����������
     * @param title - ��������
     */
	public Division(String title) {
		this.id = 100 + (int) title.toCharArray()[0];
		this.title = title;
	}
	/**
     * ����� ��������� id ������������� {@link Division#id}
     * @return ���������� id �������������
     */
	public int getDivID() {
		return this.id;
	}
	/**
     * ����� ��������� �������� ������������� {@link Division#title}
     * @return ���������� ��������
     */
	public String getTitle() {
		return this.title;
	}
}