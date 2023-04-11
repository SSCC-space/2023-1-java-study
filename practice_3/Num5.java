public class Num5 {
    //문자열 바꾸기
    public static void main(String[] args) {

        String a = "a:b:c:d";
        System.out.print("old : "+a+"\n");
        a = a.replace(":","#");
        System.out.print("new : "+a);


    }
}
