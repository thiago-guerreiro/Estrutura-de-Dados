public class InsertionSort {
   public void insertion(int v []) {
      int ini = 1, chg, men;
      while (ini < v.length) {
         men = v[ini];
         chg = ini - 1;
         while (chg >= 0 && men < v[chg]) {
            v[chg + 1] = v[chg];
            chg--;
         }
         v[chg + 1] = men;
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