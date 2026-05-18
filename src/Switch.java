public class Switch {
    public static void main(String[] args) {
        int role = 1;
        switch (role) {
            case 1:
                System.out.println("System is  Admin");
                break;

            case 2:
                System.out.println("System  is moderator");
                break;

            default:
                System.out.println("This is default user");
        }

    }

}
