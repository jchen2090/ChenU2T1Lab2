public class ChatBotRunner {
    public static void main(String[] args) {
        ChatBot debbie = new ChatBot("Debbie", 5);

        debbie.greeting("Jason");
        debbie.creationDate();
        debbie.favoriteNumber(7);
        debbie.weather();

        System.out.println("3 feet is approximately " + debbie.convertFeetToMeters(3) + " meters!");
        System.out.println("The sum of 1, 2, and 3 is " + debbie.addNumbers(1, 2, 3) + "!");
        System.out.println("2 squared is " + debbie.squaredNum(2));
        System.out.println(debbie.goodbye());

    }
}
