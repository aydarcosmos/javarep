class SimpleNum {
  public static void main(String args[])
    throws java.io.IOException {
    System.out.print("Введите число для проверки: ");
    int num = System.in.read();
    System.out.println("Вы ввели число:" + num);
    boolean Check = true;

    for (int i = 2; i < num; i++) {
      if (num % i == 0) {
        Check = false;
        break;
      }
    }
    if (Check) System.out.println(num + " - простое!");
    else System.out.println(num + " - не простое!");
    }  
  
}