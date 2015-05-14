/**
 * Created by 刘台振 on 15-3-30.
 */
public class ReferenceCountingGC {
    public Object instance =null;
    private static final int _1Mb=1024*1024;
    private byte[] bigSize =new byte[2*_1Mb];

    public static void Main(String []args){
      ReferenceCountingGC A=new ReferenceCountingGC();
      ReferenceCountingGC B=new ReferenceCountingGC();
        A.instance=B;
        B.instance=A;
        A=null;
        B=null;
        System.gc();

    }

}
