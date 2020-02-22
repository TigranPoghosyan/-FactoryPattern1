
public class Main {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperByspecialty("java");
        Developer developer = developerFactory.createDeveloper();
        developer.writeProgram();
    }

    static DeveloperFactory createDeveloperByspecialty(String specialty){
        if (specialty.equalsIgnoreCase("java")){
            return new JavaDeveloperFactory();
        }else if (specialty.equalsIgnoreCase("cpp")){
            return  new CppDeveloperFactory();
        }else if (specialty.equalsIgnoreCase("php")){
            return new PhpDeveloperFactory();
        }else {
            throw new RuntimeException(specialty + " is unknown specialty!");
        }
    }
}
