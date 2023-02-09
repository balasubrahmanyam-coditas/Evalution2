package Evalution2;

class Pattern{
    public void show(){
        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--) {
                System.out.print(" ");
            }
            for(int k=i;k>=1;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
public class Triangle {
    public static void main(String[] args) {
        Pattern pattern = new Pattern();
        pattern.show();
    }
}
