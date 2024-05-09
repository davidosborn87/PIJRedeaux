import java.util.Scanner;

public class MailServer {

    private static void sendEmail(String sender, String receiver) {
        Scanner scan = new Scanner(System.in);
        String input = "";
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println("Please enter the text you wish to send. \n To send the email, enter a new line with a single full stop");
        while (!input.equals(".")) {
            input = scan.nextLine();
            stringBuilder = new StringBuilder(stringBuilder + "\n" + input);
        }
        input = stringBuilder.toString();

        System.out.println("Sending email...\n From: " + sender + "\n To: " + receiver);
        System.out.println(input);
    }

    private static String takeInput(String input) {
        String email = input;
        boolean invalid;

        invalid = false;
        boolean oneAt = false;
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                if (oneAt) {
                    invalid = true;
                }
                oneAt = true;
            }
        }
        if (!(email.contains("@") & email.contains(".")) || (email.startsWith("@")) || (email.endsWith("@")) || (email.endsWith(".")) || invalid) {
            System.out.println("Invalid command; please enter a valid email");
            return "";
        } else {
            int emailStartIndex = 0;
            for (int i = email.length(); i > 0; i--) {
                if (email.charAt(i - 1) == ' ') {
                    emailStartIndex = i;
                    break;
                }
            }
            email = email.substring(emailStartIndex);
            System.out.println("Email address entered is: " + email);
        }

        return email;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // must create scanner object to call scan methods, which are non-static.
        String sender = null;
        String receiver = null;
        String input = "";
        while (!input.equals("quit")) {
            System.out.println("Hi, welcome to the mail server. Enter a command (type QUIT to exit)");
            input = scan.nextLine().toLowerCase();
            if (input.contains("mail from")) {
                sender = takeInput(input);
            } else if (input.contains("mail to")) {
                receiver = takeInput(input);
            } else if (input.contains("data") && (!(sender == null || receiver == null))) {
                sendEmail(sender, receiver);

            } else {
                System.out.println("Please enter a valid command (\"MAIL FROM\"; \"MAIL TO\"; \"DATA\"; OR \"QUIT\")");
            }
        }
        System.out.println("Program Terminating...");
    }
}





//“DATA”. The program reads then the body of the email, line after line, until the user enters a line
//that consists of only a dot. At that point, the email is ready and the program must write on the screen
//who is sending the email, to whom, and what the email says.
//If at any point the users types “QUIT” the program must terminate. If the user enters any other command, or types one of these commands at the wrong time (e.g., RCPT before MAIL), the program
//must say “Invalid command” on screen. See a simple example below:
//5
//Welcome to My Mail Server!
//>>> DATA
//Invalid command.
//>>> MAIL FROM: me@mypc.com
//OK
//>>> RCPT TO: bro
//Invalid email address
//>>> RCPT TO: bro@hispc.com
//OK
//>>> DATA
//Hi bro,
//Call Mum asap.
//Take care,
//.
//Sending email...
//from: me@mypc.com
//to: bro@hispc.com
//Hi bro,
//Call Mum asap.
//Take care,
//...done!
//>>> QUIT
//Bye!
//When you send an email from Thunderbird, Outlook, or your favourite email program, it communicates with a mail server in a way very similar to what you do in this exercise. Now you know why it
//seems easy for spammers to fake a sender’s email adress: it really is that easy.