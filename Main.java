import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int money = 50;
    while(money > 0){
      Scanner scan = new Scanner(System.in);
      System.out.print("Your balance is "+money+" tokens. Press ENTER to run the slot machine");
      scan.nextLine();
      int firstNumber = (int) (Math.random() * 10);
      int secondNumber = (int) (Math.random() * 10);
      int thirdNumber = (int) (Math.random() * 10);
      System.out.println(firstNumber+" "+secondNumber+" "+thirdNumber);
      if(firstNumber == secondNumber && secondNumber == thirdNumber && firstNumber == thirdNumber){
        System.out.println("Amazing! You got 3 of the same numbers! You earned 50 tokens!");
        money+=50;
      }else if(firstNumber == secondNumber || secondNumber == thirdNumber || firstNumber == thirdNumber){
        System.out.println("Amazing! You got 2 of the same numbers! You earned 25 tokens!");
        money+=25;
      }else{
        System.out.println("You got no similar numbers. You lost 10 tokens.");
        if(money<=10){
          money=0;
        }else{
          money-=10;
        }
      }
    }
    System.out.println("You are now bankrupt!");
  }
}