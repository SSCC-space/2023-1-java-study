import java.util.Scanner;
public class JavaStudyCarTest {
    public static void main(String[] args){
    Scanner a = new Scanner(System.in);
    System.out.println("자동차의 갯수를 입력하세요.");
    int b = a.nextInt();
    int[] speed=new int[b]; /*배열 선언과 배열 생성의 차이를 모르겠네요.. 결국 선언 자체가 생성하는 것 아닌가요? 또한 배열은 원소크기를 무조건 설정하거나 원소를 무조건
    넣어야하나요? int[] speed=new int[]로 설정해서 for문으로 값을 입력받을 때 마다 배열의 원소크기가 하나 씩 증가하도록 구상하려 했는데 미리 원소크기를 지정안해서인지
    컴파일 오류가 뜨더라구요    */
    String[] name=new String[b];
    for(int i=0; i<b; i++) { //i++이 아닌 ++i 로 지정하면 b-1번 반복해야하는 것 아닌가요.. i=0부터 시작이 아니라 i=1부터 시작할 거 라 생각해서 한 개 덜 반복 할 줄 알았는데..
        Scanner x = new Scanner(System.in);
        System.out.println(i + 1 + "번 째 자동차의 스피드를 입력하세요.");
        speed[i] = x.nextInt();
        Scanner y = new Scanner(System.in);
        System.out.println(i+1+"번 째 자동차의 이름을 입력하세요.");
        name[i] = y.nextLine();
    }

    System.out.println("------경기 참가자 소개-----");
    for(int i=0; i<b; i++){
        System.out.println("스피드는 "+speed[i]+"이고, 이름은 "+name[i]+"입니다.");
    }
    /*여기 행에서 scanner.close();로 스캐너를 닫으려 하는데 왜 컴파일 오류가 뜰까요..cannot find symbol variable scanner라고 떠요ㅜ
       구글링 nextLine()은 scanner를 못 닫는다는 내용이 있던데 이해가 안되네요..
    */

    /*질문있습니당.
    scanner
    println 순서로 입력하면 결과가 scanner를 받고 print문이 나올 거라 예상이 되는데 실제로는 print문이 먼저 나오더라고요
     scanner문을 사용해도 scanner문으로 설정 한 변수를 사용하지 않다면 입력받는 것이 생략이 되더라구요. 즉
         Scanner x = new Scanner(System.in);
        System.out.println(i + 1 + "번 째 자동차의 스피드를 입력하세요.");
        speed[i] = x.nextInt()
     를 본다면 Scanner문이 먼저 오더라도 x라는 변수를 사용 할 일이 speed[i] = x.nextInt() 에서 나오니까 print문이 먼저나오고
     speed[i] = x.nextInt()이전에 나오는건가요? 제가 필력이 떨어져서 제 질문 내욜을 이해하실 지 모르겠네요ㅜ
     */


    }
}
