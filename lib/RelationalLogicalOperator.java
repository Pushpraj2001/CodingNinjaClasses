public class RelationalLogicalOperator{
    public static void main(String[] args) {
        // Relational Operator 
        int a = 10, b=20;
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a>= b);
        System.out.println(a <=b);

        // Logical Operator 
        // AND , OR , NOT 
        // AND __ && __  if both conditon is true then it's run 
         // OR __ || __ if any one of the statement is correct 
        //  NOT __ !

        System.out.println(a>= 10 && b>=20);
        System.out.println(a>= 10 || b>=20);
        System.out.println(!true);
        byte c=50;
        c= c*50;

    }
}