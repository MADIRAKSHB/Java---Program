class stringbuilder {
    public static void main(String[] args) {

        String firstName = "Arun";
        String city = "Chennai";
        String hobby = "Cricket";

        StringBuilder sb = new StringBuilder();

        sb.append(firstName);
        sb.append(" FROM ");
        sb.append(city);
        sb.append(" LOVES ");
        sb.append(hobby);

        String result = sb.toString().toUpperCase();

        System.out.println(result);
    }
}