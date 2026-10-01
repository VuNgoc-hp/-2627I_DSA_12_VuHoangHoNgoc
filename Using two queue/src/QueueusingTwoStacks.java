import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

class FastIO{
    BufferedReader br;
    StringTokenizer st;

    FastIO(){
        br = new BufferedReader (new InputStreamReader(System.in));
        try{
            String line = br.readLine();
            if (line != null){
                st = new StringTokenizer(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    String next(){
        while (st== null || !st.hasMoreTokens()){
            try {
                String line = br.readLine();
                if (line != null){
                    st=new StringTokenizer(line);
                } else {
                    return null;
                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return st.nextToken();
    }
    int nextInt(){
        String token = next();
        if (token == null){
            return 0;
        }
        return Integer.parseInt(next());
    }
}
public class QueueusingTwoStacks {
    public static void transfer(Stack<Integer> s1,Stack<Integer> s2){
        if (s2 != null ){
            while (!s1.empty()){}
        }
    }
    public static void main(String[] args){
        FastIO f = new FastIO();
    }
}