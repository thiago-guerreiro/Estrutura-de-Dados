public class Fatorial {
   public long fatR(int n) throws Exception {
      if      (n <  0) throw new Exception("Nao ha fatorial de numeros negativos");
      else if (n == 0) return 1;
      else             return n * fatR(n - 1);
   }
}