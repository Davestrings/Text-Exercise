public class Triangle{
    public static void main(String[] args){
        int counter = 1;

        while(counter <= 4){
            
            int counter2 = counter;  // this loop prints empty space as an inverted triangle 
                while(counter2 <= 4 ){
                    System.out.print(" ");
                    counter2 += 1;
                }

            int counter3 = 1;  // this loop prints astericks a right angle triangle
            while(counter3 <= counter){
                System.out.print("* ");
                counter3 +=1;
            }
            System.out.println();
            counter += 1;
        }
    }
}