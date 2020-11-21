public class Ordenacao {
   // ordenacao por trocas ou BubbleSort
   public void bubble(int v[]) {
      int ini = 1, fim, chg;
      while (ini < v.length) {
         fim = v.length - 1;
         while (fim >= ini) {
            if (v[fim-1] > v[fim]) {
               chg       = v[fim-1];
               v[fim-1]  = v[fim];
               v[fim]    = chg;
            }
            fim--;
         }
         ini++;
      }
   }
   // ordenacao por Selecao
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
   // ordenacao por Inserção
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
   // ordenacao por QuickSort
   public void quick(int v[]) {
      quick(v, 0, v.length - 1);
   }
   private void quick(int v[], int lef, int rig) {
      int aPiv, aLef, aRig, piv;
      aLef = lef;
      aRig = rig;
      piv  = v[lef];
      while (lef < rig) {
         while ((v[rig] >= piv) && (lef < rig)) {
            rig--;
         }
         if (lef != rig) {
            v[lef] = v[rig];
            lef++;
         }
         while ((v[lef] <= piv) && (lef < rig)) {
            lef++;
         }
         if (lef != rig) {
            v[rig] = v[lef];
            rig--;
         }
      }
      v[lef] = piv;
      aPiv   = lef;
      if (aLef < aPiv) quick(v, aLef, aPiv - 1);
      if (aRig > aPiv) quick(v, aPiv + 1, aRig);
   }
   
   public String showVetor(int v[]) {
      int    i;
      String msg = "";
      for (i = 0; i < 4; i++) {
         msg += v[i] + "   ";
      }
      msg += "...    ";
      for (i = v.length - 4; i < v.length; i++) {
         msg += v[i] + "   ";
      }
      return msg;
   }
}