// �������� For

class Example4 {
  public static void main(String args[]){
    int x; 
    int y = 20; 
    for (x = 0; x < 10; x = x + 1) {
      System.out.println("�������� x = "+ x);
      System.out.println("�������� � = " + y);
      y = y - 2;
    }
  }
}