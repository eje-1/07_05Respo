public class Greeter {
    String name;

    public Greeter(String name) {
        this.name = name;
    }

    public String greet(){
        return "Hello " + name + ", what a wonderful day.";
    }

    public String happyBirthady(){
        return "Happy Birthday to you, "+ name;
    }
}
