// подсчет расстояния, которое пройдет луч света за указанное количество дней

class Light {
  public static void main(String args[]) {
    int lightspeed = 186000; // скорость света миль с секунду
    long days;
    long seconds;
    long distance;
    
    days = 1000;
    seconds = days * 24 * 60 * 60; 
    distance = lightspeed * seconds; 
    System.out.println("Дистанция пройденна за " + days + " дней равна " + distance);     
  }
}