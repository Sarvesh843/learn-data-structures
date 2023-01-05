package assignments;

public class SaraPhone {
    /**
     N applications

     each application takes K memory

     Total occupied memory = N * K

     Sara wants to release M units of memory

     Unitary method:

     k memory = 1
     1 memory = 1/k applications
     m memory = m/k applications   1.4 applications.

     Since we cannot delete fraction apps, apps required to
     be deleted will be the nearest integer greater then the decimal

     Apps required = Math.ceil(m/k);

     if Apps to be deleted > N : It is no possible


     */

    static int Phone(int N,int K,int M){
        int minApps = (int) Math.ceil(M*1.0/K);
        if(minApps > N){
            return -1;
        }
        else{
            return minApps;
        }
    }
}
