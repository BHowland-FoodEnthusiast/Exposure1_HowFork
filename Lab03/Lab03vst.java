package Lab03;


public class Lab03vst {
    public static void main(String[] args) {
        int milliseconds = 10001123;



        System.out.println("Starting milliseconds: \t" + milliseconds);
        int hours = milliseconds / 3600000;
        System.out.println("Hours: \t\t\t\t\t" + hours);


        int minutes = milliseconds % 3600000 / 60000;
        System.out.println("Minutes: \t\t\t\t" + minutes);

        int seconds = milliseconds % 3600000 % 60000 / 1000;
        System.out.println("Seconds: \t\t\t\t" + seconds);

        int millisecondsOutPut = milliseconds %1000;
        System.out.println("Milliseconds: \t\t\t" + millisecondsOutPut);



    }
}
