class Calculator {

  // what a calculator is
  int operand1;
  int operand2;
  int result;

  // what a calculator does
  void sumOperands() {
    result = operand1 + operand2;
  }

  void displayResults() {
    System.out.println(operand1 + " + " + operand2 + " = " + result);
  }

}
