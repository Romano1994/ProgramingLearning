public class idk {
    public static void main(String[] args) {
        InstanceMemberEx03 in = new InstanceMemberEx03("year");
        System.out.println(in.month);
    }
}

class InstanceMemberEx03 {
	String year;
	String month;
	String day;

	public InstanceMemberEx03(String year) {
		this(year, "what" , null);
	}

	public InstanceMemberEx03(String year, String month) {
		this(year, month, null);
	}

	public InstanceMemberEx03(String year, String month, String day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public static void main(String[] args) {
		InstanceMemberEx03 im1 = new InstanceMemberEx03("2017년");
		System.out.println(im1.year);
		InstanceMemberEx03 im2 = new InstanceMemberEx03("2017년", "3월");
		System.out.println(im2.year + im2.month);
		InstanceMemberEx03 im3 = new InstanceMemberEx03("2017년", "3월", "13일");
		System.out.println(im3.year + im3.month + im3.day);
	}
}