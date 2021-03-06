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

   // exibe parte do vetor
   public String showVetor(int v[]) {
      int i;
      String resp = "";
      for (i = 0; i < 3; i++) {
         resp += "[" + i + "]: " + v[i] + "    ";
      }
      resp += "...   ";
      for (i = v.length-3; i < v.length; i++) {
         resp += "[" + i + "]: " + v[i] + "    ";
      }
      return resp;
   }
}