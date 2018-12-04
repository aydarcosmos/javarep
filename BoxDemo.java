class Box{
  double vol(double width, double height, double depth) {
    return width * height * depth;
  }
}

class BoxDemo{
  public static void main(String args[]){
    Box mybox = new Box();
    //double vol;    

    //mybox.width = 10;
    //mybox.height = 20;
    //mybox.depth = 30; 
    //vol = mybox.width * mybox.height * mybox.depth;
    System.out.print(mybox.vol(10, 20, 30));
  }
}