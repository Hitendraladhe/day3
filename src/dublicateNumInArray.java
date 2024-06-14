public class dublicateNumInArray {
    public static void main(String[] args) {
        int num = 3;
        int t=num ;
        for (int i=1; i<2; i++){
            String pa = "";
            for(int j=0; j<i+1; j++){
                pa+=Integer.toString(t)+ " ";
                t++;
                System.out.println(pa);
            }
            t =t+ 1;
        }

    }
}
