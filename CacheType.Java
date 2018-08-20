public abstract class CacheType {


    public static void load(FileRead F, Proces[] Procese) {
        for(int i = 0; i < F.NumberOfEvents; i++) {
            if(F.ProccesName[i].equals("Fibonacci")) {
                Procese[i]  = new Fibonacci(F.Weight[i], "Fibonacci");
            }
            if(F.ProccesName[i].equals("CheckPrime")) {
                Procese[i] = new CheckPrime(F.Weight[i], "CheckPrime");
            }
            if(F.ProccesName[i].equals("NextPrime")) {
                Procese[i] = new NextPrime(F.Weight[i], "NextPrime");
            }
            if(F.ProccesName[i].equals("Sqrt")) {
                Procese[i] = new Sqrt(F.Weight[i], "Sqrt");
            }
            if(F.ProccesName[i].equals("Cube")) {
                Procese[i] = new Cube(F.Weight[i], "Cube");
            }
            if(F.ProccesName[i].equals("Square")) {
                Procese[i] = new Square(F.Weight[i], "Square");
            }
            if(F.ProccesName[i].equals("Factorial")) {
                Procese[i] = new Factorial(F.Weight[i], "Factorial");
            }
        }
    }
}
