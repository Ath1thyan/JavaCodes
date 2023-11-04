package Numbers;

import java.util.Scanner;

public class Prime_num {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt(), i,j,c=0;
        Boolean a[] = new Boolean[n+1];
        for(i=2; i<=n; i++){
            if(a[i]==false){
                for(j=i*2;j<=n;j=j+i){
                    a[i]=true;
                }
            }
            
            }
            for(i=2;i<=n;i++){
                if(a[i]==false){
                    c++;
                }
        }
        System.out.println(c);
        s.close();
        
    }
}
