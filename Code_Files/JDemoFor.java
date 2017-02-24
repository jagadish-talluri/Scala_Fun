public class JDemoFor {
    public static void main (String args[]) {
        System.out.println("Hello, World");
        
        for(String s:args) System.out.println("The word is : " + s);
        
        for(int i = 0; i<args.length; i++) System.out.println("The arg is : " + args[i]);
        
    }
}
