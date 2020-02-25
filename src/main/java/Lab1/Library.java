package Lab1;

public class Library {
    public static void main(String arg[]){
        Library lib = new Library();
        if(lib.someLibraryMethod())
            System.out.println("When There is a fire, commit and push.");
    }
    public boolean someLibraryMethod(){
         return true;
    }
}
