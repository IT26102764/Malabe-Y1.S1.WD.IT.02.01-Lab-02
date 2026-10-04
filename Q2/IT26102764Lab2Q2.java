public class IT26102764Lab2Q2 {
    public static void main(String [] args) {
        double square_perimeter,s_length,circumference,radius,PI;
        
        // define s_length
        s_length = 10;

        //define PI
         PI = 22/7;

        //define circumference 
        circumference = 4 * s_length;

        //calculate the square perimeter
         square_perimeter = 4 * s_length;

        // calculate the radius
        
         radius = square_perimeter / (2*PI);

        // print the radius of the circular fence
        System.out.println("Radius of the circular fence:" + radius);

    }
}