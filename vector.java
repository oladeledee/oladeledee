package assignment;
import java.util.ListIterator;
import java.util.Vector;

/**
 *
 * @author oladele
 */
public class vector {
String bad,cat,rat;

public vector(){
    Vector<String> st=new Vector<String>();
         String  stt1=new String("cat");
       String  stt2=new String("bar");
       String  stt3=new String("watch");
       String  stt4=new String("batch");
       
       System.out.println("VECTOR SIZE = "+st.size());
        st.add(stt1);
        st.add(stt2);
         st.add(stt3);
           st.add(stt4);     
       
       System.out.println("\nVector after adding the String: "+st);
       System.out.println("Vector size after adding String : "+st.size());
       
       st.remove(stt1);
       
           
            System.out.println("\nVector after removing the String: "+st);
       System.out.println("Vector size after removing String : "+st.size());
       
       System.out.println("\nTHE FINAL VECTOR ARE ");
       ListIterator i=st.listIterator();
       while(i.hasNext())
       {
           System.out.println(i.next());
       } 
    
}
    
    public static void main(String []args)
    {
     vector v =new vector();
    }
}
