class Main {
  public static void main(String[] args) {

    /*

    System.out.println("Hello world!");

    int num1 = 5;

    int num2 = 7;

    int sum = num1 + num2;


    System.out.println("MY AWESOME CALCULATOR");
    System.out.println(num1 + " + " + num2);
    System.out.println(" = " + sum);

    */

    Calculator calculator1 = new Calculator();
    calculator1.operand1 = 5;
    calculator1.operand2 = 7;

    calculator1.sumOperands();

    calculator1.displayResults();

    Calculator calculator2 = new Calculator();

    calculator2.operand1 = 99;
    calculator2.operand2 = 1599;

    calculator2.sumOperands();

    calculator2.displayResults();
    


  }
}
