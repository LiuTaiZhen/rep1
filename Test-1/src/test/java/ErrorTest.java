import java.util.ArrayList;
import java.util.List;

/**
 * Created by 刘台振 on 15-3-30.
 */
public class ErrorTest {
    public byte[] place=new byte[64*1024];
    public static void fill(int num) throws Exception{
       List<ErrorTest> list=new ArrayList<ErrorTest>();
       for(int i=0;i<num;i++){
         Thread.sleep(100);
         list.add(new ErrorTest());
       }
    }
    public static void main(String[]args) throws Exception{
      fill(1000);
    }

}
