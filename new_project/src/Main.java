public class Main {
   public static void main(String[] args) {
      System.out.println(convert(20));
      System.out.println(points(4, 5));
      System.out.println(footballPoints(3,4,2));
      System.out.println(divisiblebyFive(12));
      System.out.println(and(true, false));
      System.out.println(howManyWalls(70, 12, 5));
      System.out.println(squared(7));
      System.out.println(profitableGamble(0.3, 7, 1));
      System.out.println(frames(20, 5));
      System.out.println(mod(18, 7));

   }
   public static int convert (int x) {return x*60;}
   public static int points (int x, int y) {return (x*2)+(y*3);}
   public static int footballPoints(int x, int y, int z) {return (x*3)+y;}
   public static boolean divisiblebyFive(int x) {return x%5==0;}
   public static boolean and(boolean a, boolean b) {return a&&b;}
   public static int howManyWalls(int n, int w, int h) {return n / (w*h);}
   public static int squared(int a) {return a * a;}
   public static boolean profitableGamble(double prob, int prize, int pay) {return prob*prize>pay;}
   public static int frames (int a, int b) {return a*b*60;}
   public static int mod(int x, int y) {
       while (x-y>y) {x=x-y;}
       return x;
   }
}
