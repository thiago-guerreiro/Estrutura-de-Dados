public class MaximoDivisorComum {
   public int mdcR(int num, int div) {
      if      (num == 0 || div == 0) return 0;
      else if (num % div == 0)       return div;
      else                           return mdcR(div, num % div);   }
}