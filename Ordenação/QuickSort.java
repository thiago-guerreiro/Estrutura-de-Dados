public class QuickSort {
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