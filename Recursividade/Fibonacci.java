public class Fibonacci {
   public int fibR(int termo) {
      if      (termo <= 0) return 0;
      else if (termo <= 2) return 1;
      else                 return fibR(termo - 1) + fibR(termo - 2);
   }
}