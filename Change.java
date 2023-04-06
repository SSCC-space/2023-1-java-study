public class Change {

    public static void main(String args[]) {
//1start
/*
        String a = "a:b:c:d";
        char changed[] = a.toCharArray();

        for (int n = 0; n < a.length(); n++) {
            if (changed[n] == ':') {
                changed[n] = '#';
            }
        }
*/
//1end
// 2start
        String a = "a:b:c:d";
        a = a.replace(":", "#");//2end
        System.out.println(a);//주석을 지우면 a 대신 changed를 넣어도 됨

    }
}
