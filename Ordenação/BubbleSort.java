public class BubbleSort {
   public void bubble(int v[]) {
      int ini = 1, fim, chg;
      while (ini < v.length) {
         fim = v.length - 1;
         while (fim >= ini) {
            if (v[fim-1] > v[fim]) {
               chg      = v[fim-1];
               v[fim-1] = v[fim];
               v[fim]   = chg;
            }
            fim--;
         }
         ini++;
      }
   }
}