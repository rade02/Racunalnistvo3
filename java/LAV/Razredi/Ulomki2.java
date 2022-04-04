package Razredi.Ulomek;

public class Ulomki2 {

    static class Ulomek{
        int stevec;
        int imenovalec;

        Ulomek(int st, int im){
            stevec = st;
            imenovalec = im;
        }

        public void pokrajsaj(){
            int skupni_delitelj = skupniDelitelj(stevec, imenovalec);
            this.stevec = stevec / skupni_delitelj;
            this.imenovalec = imenovalec / skupni_delitelj;
        }

        public int skupniDelitelj(int st, int im){
            int min = Math.min(st, im);
            int i = min;
            for(; i >= 1; i--){
                if(st % i == 0 && im % i == 0){
                    break;
                }
            }
            return i;
        }
    }
    public static void main(String[] args){
        int a = 9;
        int b = 3;

        Ulomek prvi = new Ulomek(a, b);
        prvi.pokrajsaj();
        System.out.println(prvi.stevec + "/" + prvi.imenovalec);
    }
}
