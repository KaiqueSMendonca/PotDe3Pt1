package potenciasde3pt1;

public class PotenciasDe3Pt1 {

    public static void main(String[] args) {
        int i = 0;
        
        while (i<=15){
            int r = (int) Math.pow(3, i);
            System.out.println(r+", ");
            i++;
        }
    }
    
}
