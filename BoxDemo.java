class Box{
  private double width, height, depth;
  
  Box(Box obj){
    width = obj.width;
    height = obj.height;
    depth = obj.depth;
  }  
  
  Box(double w, double h, double d){
    width = w;
    height = h; 
    depth = d; 
  }

  Box(){
    width = -1;
    height = -1;
    depth = -1;
  }

  Box(double len){
    width = height = depth = len;
  }
  double vol() {
    return width * height * depth;
  }
}

class BoxWeight extends Box{
  double weight; 
    
  BoxWeight(double w, double h, double d, double m){
    super(w, h, d); 
    weight = m;    
  }
  

  BoxWeight(double len, double m){
    super(len);
    weight = m;  
  }
  
  
}
class BoxDemo{
  public static void main(String args[]){
    BoxWeight mybox1 = new BoxWeight(3, 4, 5, 10);
    BoxWeight mybox2 = new BoxWeight(10, 5);
    double vol = mybox1.vol(); 
    System.out.println(mybox1.vol() + " " + mybox2.vol() + " " + mybox1.weight + " " + mybox2.weight);
  }
}