// оператор if

class Example3 {
  public static void main (String args[]){
    int x, y;
    x = 10; 
    y = 20; 
    if (y > x) System.out.println("x меньше y");
    x = x * 2;
    if (y == x) System.out.println("x равно y");
    x = x * 2;
    if (y < x) System.out.println("x больше y");
    if (y == x) System.out.println("Вы не увидите эту строку");
  }
}