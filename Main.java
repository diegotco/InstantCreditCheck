import java.util.Scanner;


class Main {

static int requiredSalary = 25000;
static int requiredCreditScore = 700;
static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {

  /*  
  //Initializa what we know
  int requiredSalary = 25000;
  int requiredCreditScore = 700;
  */

  //Ask what we don't know
  double s = getSalary();
  int c = getCreditScore();
  scanner.close(); 

  //Check if the user is qualified
  boolean q = isUserQualified(s,c);

  //Notify the user
  notifyUser(q);

  }

  public static double getSalary(){
      System.out.println("Enter your salary: ");
      double salary = scanner.nextDouble();
      return salary;
  }

  public static int getCreditScore(){
      System.out.println("Enter your credti score: ");
      int creditScore = scanner.nextInt();
      return creditScore;
  }

  public static boolean isUserQualified(double salary, int creditScore){
      if (salary >= requiredSalary && creditScore >= requiredCreditScore){
          return true;
      else{
          return false;
      }

      }
  }

  public static void notifyUser(boolean isQualified){
      if(isQualified){
          System.out.println("Congrast you've been aproved");
      }
      else{
          System.out.println("Sorry, you are not qualified");
      }

  }




}