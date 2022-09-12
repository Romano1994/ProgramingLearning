import java.util.Calendar;

public class Ch10_4 {
	public static void main(String[] args) {
		Calendar data = Calendar.getInstance();
		data.set(2019, 7, 31);

		System.out.println(toString(data));
		System.out.println("= 1일 후=");
		data.add(Calendar.DATE, 1);
		System.out.println(toString(data));

		System.out.println("= 6달 전=");
		data.add(Calendar.MONTH, -6);
		System.out.println(toString(data));

		System.out.println("= 31일 후 roll=");
		data.roll(Calendar.DATE, 31);
		System.out.println(toString(data));
		
		System.out.println("= 31일 후 add=");
		data.add(Calendar.DATE, 31);
		System.out.println(toString(data));
	}

	static String toString(Calendar data) {
		return data.get(Calendar.YEAR) + "년 " + data.get(Calendar.MONTH) + "월 " + data.get(Calendar.DATE) + "일 ";
	}
}
