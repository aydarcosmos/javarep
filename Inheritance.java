class SuperClass{
  int i;
  private int j; 
  
  void setij(int x, int y){
    i = x;
    j = y; 
  }
    
}

class SubClass extends SuperClass{
  int k = 10; 
  int sum(){
    return i + k;
  }
}

class Inheritance{
  public static void main(String args[]){
    System.out.println("This is the start of program");
    SubClass subobj = new SubClass();
    subobj.setij(20, 50);
    int sumOfIandK = subobj.sum();
    System.out.println("Sum of " + subobj.i + " and " + subobj.k + " = " + sumOfIandK);
   }
}