public class BuscaBinaria {
   public int binariaR(int seek, int v[]) {
      return binariaR(seek, v, 0, v.length - 1);
   }
   private int binariaR(int seek, int v[], int ini, int fim) {
      int meio = (ini + fim) / 2;
      if      (ini > fim)      return -1;
      else if (v[meio] < seek) return binariaR(seek, v, meio+1, fim);
      else if (v[meio] > seek) return binariaR(seek, v, ini, meio-1);
      else                     return meio;
   }
}