
class parcel{
    public static void main(String[] args) {

        String[] parcel = new String[5];

        parcel[0] = "1";
        parcel[1] = "2";
        parcel[2] = "3";
        parcel[3] = "4";
        parcel[4] = "5";

        parcel[2] = "8";   
        System.out.println("Parcel Tracking Numbers:");
        for(int i = 0; i < parcel.length; i++) {
            System.out.println(parcel[i]);
        }
    }
}