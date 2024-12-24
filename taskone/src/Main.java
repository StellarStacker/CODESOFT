import java.util.Scanner;
class Numbergame{
    Scanner sc;
    
    private Numbergame(){
        System.out.println("Initilaizing constructor....");
        sc=new Scanner(System.in);
        startGame();
    }
    private void startGame(){
        int ans=getRandom();
        System.out.println("Welcome to Number game...");
        System.out.println("Enter a number greater than 0 and less than 100 : ");
        int num=sc.nextInt();
        while(true){
            if(num==ans) {
                System.out.println("Yay ! The number is correct");
                break;
            }else if(num<ans) {
                System.out.println("The number entered is lower than ans");
                System.out.println("Enter the number again");
                num=sc.nextInt();
            }else {
                System.out.println("The number entered is higher than the answer");
                System.out.println();
                System.out.println("Enter the number again ");
                num=sc.nextInt();
            }
        }
    }
    public static void main(String...args){
       new Numbergame();
    }
    private static int getRandom() {
        return (int) (Math.random() * 100);
    }
}