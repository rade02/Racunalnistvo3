public class RazlicniElementi {
    public static void main(String[] args){
        
        int[] tab = {6, 3, 9, 7, 2, 1, 8};
        int[] pojavitev = new int[100];
        boolean razlicni = true;

        for(int i = 0; i < tab.length - 1; i++){
            pojavitev[tab[i]]++;
            if(pojavitev[tab[i]] > 1){
                razlicni = false;
                break;
            }
        }
        if(razlicni)
            System.out.println("DA");
        else
            System.out.println("NE");
    }
}
