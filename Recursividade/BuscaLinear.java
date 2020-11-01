public class BuscaLinear {
   public int linearR(int seek, int v[]) {
      return linearR(seek, v, 0);
   }
   private int linearR(int seek, int v[], int i) {
      if      (i == v.length) return -1;
      else if (v[i] == seek)  return i;
      else                    return linearR(seek, v, i+1);
   }
}