package Evalution2;

class Days{
    int num;
    String day = "Thursday";
    public void display(){
    switch(day){
            case Monday:
                System.out.println("ITs a start of week");
                break;
            case Tuseday:
                System.out.println("Its a second day of week");
            break;
            case Wednesday:
                System.out.println("Its a third day of week");
                break;
            case Thursday:
                System.out.println("Its a fourth day of week");
                break;
            case Firday:
                System.out.println("Its a last day of week.....enjoy your weekend");
                break;
            case Saturday:
                System.out.println("Its a weekend!!!majjanilife:");
                break;
            case Sunday:
                System.out.println("Last day of week");
                break;


        }
    }

}
public class CurrentDate {
    public static void main(String[] args) {
        Days days = new Days();
        days.display();
    }
}
