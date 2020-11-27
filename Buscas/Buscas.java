public class Buscas {

   public int buscaSeq(int seek, int v[]) {
      int i;
      for (i = 0; i < v.length; i++) {
         if (seek == v[i]) {
            return i; // achou
         }
      }
      return -1; // não achou
   }

   public int buscaBin(int seek, int v[]) {
      int ini = 0, meio, fim = v.length - 1;
      while (ini <= fim) {
         meio = (ini + fim) / 2;
         if      (seek < v[meio]) fim = meio - 1;
         else if (seek > v[meio]) ini = meio + 1;
         else {
            return meio; // achou
         }
      }
      return -1; // não achou
   }
   // 0rdenação por inserção
   public void insertSort(int v[]) {
      int ini, iChange, menor;
      for (ini = 1; ini < v.length; ini++) {
         menor = v[ini];
         iChange = ini - 1;
         while(iChange >= 0 && menor < v[iChange]) {
            v[iChange + 1] = v[iChange--];
         }
         v[iChange + 1] = menor;
      }
   }
}