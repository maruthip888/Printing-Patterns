package patterns.java;
public class pattern08{
    public static void pattern(int n){
        for(int i=0; i < n;i++){
            //Space(n-i-1)
            for(int j=0; j <n-i-1;j++){
                System.out.print("  ");
            }
            for(int j=0; j<2 * i +1;j++){
                System.out.print("*");
            }
            for(int j=0; j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(5);
    }
}