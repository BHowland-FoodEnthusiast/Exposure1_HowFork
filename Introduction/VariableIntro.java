package Introduction;

public class VariableIntro {

    public static void main(String[] args) {

        /*
         * datatype name = value
         * casting means to change its datatype
         * to change a primitive data type, put the new one in ()
         */
        double salary = 10000.56;
        int bonus = 250;

        bonus = (int) salary;

        System.out.println(salary);
        System.out.println(bonus);
    }
}
