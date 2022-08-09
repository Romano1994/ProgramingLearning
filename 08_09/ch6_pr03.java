public class ch6_pr03 {
    public static void main(String[] args) {
        Student3 s3 = new Student3();
        s3.name = "홍길동";
        s3.ban = 1;
        s3.no = 1;
        s3. kor = 100;
        s3.eng = 60;
        s3.math = 76;
        
        System.out.println("이름:" + s3.name);
        System.out.println("총점"+s3.getTotal());
        System.out.println("평균"+s3.getAverage());
    }
}

class Student3{
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;
    
    Student3(){}

    int getTotal(){
        return kor+eng+math;
    }
    
    float getAverage(){
        return ((int)((kor+eng+math)/3f*10)/10f);
    }
}