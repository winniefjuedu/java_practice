package Beginner;
public class LoopsApp {
    public static void main (String[] args) {
        System.out.println("while-loop");
        int i = 1;
        while (i <= 0){
            System.out.println(i +". BEING RIGHT SUCKS");
            i++;
        }
        System.out.println("Value of i: " + i);
        System.out.println();

        System.out.println("do-while-loop");
        int j = 1;
        do {
            System.out.println(j +". BEING RIGHT SUCKS");
            j++;
        } while(j <= 0);
        System.out.println("Value of j: " + j);
        System.out.println();

        System.out.println("for-loop break");
        for (int k = 1; k<=5; k++){
            if(k ==3){
                // k==3時跳出迴圈
                break;
            }
            System.out.println(k +". BEING RIGHT SUCKS");
        }
        System.out.println();

        System.out.println("for-loop continue");
        for (int k = 1; k<=5; k++){
            if(k ==3){
                // k==3時，直接回到k++，不執行下面的程式碼
                continue;
            }
            System.out.println(k +". BEING RIGHT SUCKS");
        }
        System.out.println();

        System.out.println("for-loop");
        for (int k = 1; k<=5; k++){
            for (int l = 1; l<=2; l++){
                System.out.println("k=" + k + " l=" + l + " BEING RIGHT SUCKS");
            }
        }
        System.out.println();
    }
}
