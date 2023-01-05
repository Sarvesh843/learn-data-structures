package assignments;

public class IceCream {
    static void Icecreams (int N, int D){
//Enter your code here
        int ice_creams = N;

        for(int i=1; i<=D; i++){
            // ice creams eaten by sara
            int eaten = ice_creams / 2;
            // remaining ice creams
            ice_creams = ice_creams - eaten;
            // ice creams which increases at night
            ice_creams = 3*ice_creams;
        }

        System.out.println(ice_creams);
    }

}
