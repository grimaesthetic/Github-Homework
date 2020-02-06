
package github.homework;

public class GithubHomework {
    static double numbers[] = new double[20];
    public static void main(String[] args) {
        for(int x = 0; x < numbers.length; x++){
            numbers[x] = x+1;
            System.out.println(numbers[x]);
        }
    }
    
}
