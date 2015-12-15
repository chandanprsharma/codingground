/*  Implementation - 1
    () -> System.out.println("Hello raju")
*/

/*  Implementation - 2
    () -> {
            System.out.println("Hello raju");
            System.out.println("Hello srinu");
        }
*/

/*  Implementation - 3
    () -> {
            System.out.println("Hello raju");
            System.out.println("Hello srinu");
            return 14;
        }
*/

/*  Implementation - 4
    () -> {
            return 14;
        }
*/

/*  Implementation - 5
    () -> return 14
*/

/*  Implementation - 6
    Executable ex = () -> {return 14;};
    runner.run(ex);
*/

/*  Implementation - 7
    Object obj = (Executable)() -> {return 14;};
    runner.run((Executable)obj);
*/

/*  Implementation - 8
    (int a) -> {return 200 + a;}
*/

/*  Implementation - 9
    (a) -> {return 200 + a;}
*/

public class HelloWorld{

     public static void main(String []args){
        System.out.println("Hello World");
        
        Runner runner = new Runner();
        runner.run(new Executable() {
            
            public int execute(int a) {
                System.out.println("Hello there");
                return 100 + a;
            }
        });
        
        System.out.println("-------------------using lambda expression-----------------------------");
        // using lambda expression
        runner.run((a) -> {
            int b = 1000;
            System.out.println("declaring local variable: " + b);
            return 200 + a;
            
        });
        
        System.out.println("------------------------------------------------");
        // using lambda expression
        Executable ex = (int a) -> {return 300 + a;};
        runner.run(ex);
        
        System.out.println("------------------------------------------------");
        // using lambda expression
        Object obj = (Executable)(int a) -> {return 400 + a;};
        runner.run((Executable)obj);
     }
}
