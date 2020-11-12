public class SingleNode {
   private int elem;
   private SingleNode next;

   public SingleNode() {
      this(0, null);
   }
   public SingleNode(int e) {
      this(e, null);
   }
   public SingleNode(int e, SingleNode n) {
      setElem(e);
      setNext(n);
   }

   public int        getElem() { return elem; }
   public SingleNode getNext() { return next; }

   public void setElem(int        e) { elem = e; }
   public void setNext(SingleNode n) { next = n; }

   public String toString() {
      return "" + elem;
   }
}