//Program to remove commas from a string
public class Task {
    public static void main(String [] args){
        String text = "Kareem, Kareeem, Kareeeem, Kareeeeem and Karim";
        text = text.replaceAll(",", "");
        System.out.println("The new string is:" + text);
    }
}