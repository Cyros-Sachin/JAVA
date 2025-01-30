import java.util.Scanner;

class first{
    public static void main(String args[]){
        System.out.println("Enter the radius of circle:");
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        double area = 3.14 * radius * radius;
        System.out.println("Area of circle is:"+area);
    }
}