public class Num3 {
    //주민등록번호 나누기
    public static void main(String[] args) {

        String RRN = "881120-1068234";

        String birth = RRN.substring(0,6);
        String last = RRN.substring(7);

        System.out.print("주민등록번호 연월일: "+birth+"\n");
        System.out.print("주민등록번호 뒷부분: "+last);

    }
}
