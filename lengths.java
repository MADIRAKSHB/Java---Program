class lengths {
    public static void main(String[] args) {

        String str = "  Java Programming  ";
        String str2 = "java programming";

        
        System.out.println("Length: " + str.length());
        System.out.println("isEmpty: " + str.isEmpty());
        System.out.println("isBlank: " + str.isBlank());

       
        System.out.println(str.equals(str2));
        System.out.println(str.equalsIgnoreCase(str2));
        System.out.println(str.compareTo(str2));
        System.out.println( str.contains("Java"));

        
        System.out.println(str.charAt(2));
        System.out.println(str.substring(2, 6));
        System.out.println( str.indexOf('a'));
        System.out.println( str.lastIndexOf('a'));

        
        System.out.println( str.startsWith("  Ja"));
        System.out.println(str.endsWith("  "));

        
        
        System.out.println(str.replace("Java", "Python"));
        System.out.println( str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println("Hi ".repeat(3));
    }
}