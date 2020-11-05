public class SelectionSort {
   public void selection(int v[]) {
      int ini = 0, sch, chg, men;
      while (ini < v.length - 1) {
         chg = ini;
         men = v[ini];
         sch = ini + 1;
         while (sch < v.length) {
            if (v[sch] < men) {
               chg = sch;
               men = v[sch];
            }
            sch++;
         }
         v[chg] = v[ini];
         v[ini] = men;
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