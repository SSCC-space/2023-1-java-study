public class chap03_1 {
    public static void main(String[] args) {
        int kor=80;
        int eng=75;
        int math=55;
        int sum=0;
        double avg;
        sum=kor+eng+math;
        avg=(double)sum/3;
        System.out.println("평균 점수 : "+avg);
    }
}
