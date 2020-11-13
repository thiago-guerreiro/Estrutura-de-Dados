public class SLL { // Single Linked List
   private SingleNode snBegin;

   public SLL() {
      snBegin = null;
   }

   public int size() {
      int        qtde  = 0;
      SingleNode snAux = snBegin;
      while (snAux != null) {
         qtde++;
         snAux = snAux.getNext();
      }
      return qtde;
   }

   public boolean isEmpty() {
      return (size() == 0);
   }

   public void insertFirst(SingleNode snNew) {
      snNew.setNext(snBegin);
      snBegin = snNew;
   }

   public void insertLast(SingleNode snNew) {
      SingleNode snAux = snBegin;
      if (isEmpty()) insertFirst(snNew);
      else {
         while (snAux.getNext() != null) {
            snAux = snAux.getNext();
         }
         snAux.setNext(snNew);
         snNew.setNext(null);
      }
   }

   public void insertAt(SingleNode snNew, int pos) {
      if      (pos <= 0)      insertFirst(snNew);
      else if (pos >= size()) insertLast(snNew);
      else {
         SingleNode snAux = snBegin;
         int        cont;
         for (cont = 1; cont < pos; cont++) {
            snAux = snAux = snAux.getNext();
         }
         snNew.setNext( snAux.getNext() );
         snAux.setNext( snNew );
      }
   }

   public SingleNode removeFirst() {
      SingleNode snAux = snBegin;
      if (isEmpty()) return null;
      else {
         snBegin = snBegin.getNext();
         return snAux;
      }
   }

   public SingleNode removeLast() {
      SingleNode snAux = null, snDel = snBegin;
      if (size() <= 1) return removeFirst();
      else {
         while (snDel.getNext() != null) {
            snAux = snDel;
            snDel = snDel.getNext();
         }
         snAux.setNext(null);
         return snDel;
      }
   }

   public SingleNode removeAt(int pos) {
      if      (pos <= 0)        return removeFirst();
      else if (pos >= size()-1) return removeLast();
      else {
         SingleNode snDel = snBegin, snAux = null;
         for (int cont = 0; cont < pos; cont++) {
            snAux = snDel;
            snDel = snDel.getNext();
         }
         snAux.setNext( snDel.getNext() );
         return snDel;
      }
   }

   public String show() {
      String     resp = "";
      SingleNode snAux = snBegin;
      while (snAux != null) {
         resp += snAux + "   ";
         snAux = snAux.getNext();
      }
      return resp;
   }

   public int seek(int elem) {
      int        i  = 0;
      SingleNode snAux = snBegin;
      while (snAux != null) {

         if (snAux.getElem() == elem) return i;

         i++;
         snAux = snAux.getNext();
      }
      return -1;
   }
}