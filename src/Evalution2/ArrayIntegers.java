package Evalution2;

class Even{
    int arr[] = {2,3,4,5,6,7,8,9};
    int sum1=0;
    int sum2=0;
    public void display() {
        for(int i=0;i<arr.length;i=i+2){
            sum1 =sum1+arr[i];
        }
        for(int i=1;i<arr.length;i=i+2){
            sum2 =sum2+arr[i];
        }
        System.out.println("Sum of even index is:"+sum1);
        System.out.println("Sum of odd index is:"+sum2);
    }
}
public class ArrayIntegers {
    public static void main(String[] args) {
        Even even = new Even();
        even.display();
    }
}
