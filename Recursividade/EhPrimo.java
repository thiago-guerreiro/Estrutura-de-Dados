public class EhPrimo {
   public boolean ehPrimoR(int num) {
      if (num <= 1) return false;
      else          return ehPrimoR(num, 2);
   }
   private boolean ehPrimoR(int num, int div) {
      if      (num == div)     return true;
      else if (num % div == 0) return false;
      else                     return ehPrimoR(num, div + 1);
   }
}