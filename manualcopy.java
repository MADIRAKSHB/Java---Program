class manualc  opy {
    public static void main(String[] args) {

        int[] a = {10, 20, 30};  
        int[] b = new int[3];

        for(int i = 0; i < b.length; i++) {
            b[i] = a[i];             
        }

        for(int i = 0; i < b.length; i++) {
            System.out.println(b[i]); 
        }
    }
}