public class Q3 {
    public static void main(String [] args){
        String pin = "881120-1068234";
        String yyyymmdd = pin.substring(0,6);
        String num = pin.substring(7);
        System.out.println(yyyymmdd);
        System.out.println(num);
    }
}
