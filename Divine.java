import java.util.*;
class Manage
{
    int Apos=5;
    int Aneg=5;
    int Bpos=5;
    int Bneg=5;
    int Opos=5;
    int Oneg=5;
    int ABpos=5;
    int ABneg=5;
    int kidneys=10;
    int lungs=10;
    int eye=10;
    int livers=10;
    int x=0;
    String str="";
}
class ConsoleColors 
{
    public static final String RESET = "\033[0m";
    public static final String YELLOW = "\033[0;33m"; 
    public static final String RED = "\033[0;31m";  
    public static final String WHITE = "\033[0;37m";
    public static final String ORANGE = "\033[38;2;255;165;0m";
    public static final String PURPLE = "\033[0;35m"; 
    public static final String CYAN = "\033[0;36m"; 
    public static final String GREEN = "\033[0;32m"; 
    public static final String LIGHT_BLUE = "\033[0;94m";
    public static final String BLUE = "\033[0;34m";
    public static final String AQUA = "\033[0;36m";
    public static final String ULTRAMARINE = "\033[38;5;21m";
    public static final String RUBY = "\033[38;5;197m";
    public static final String BLACK = "\033[0;30m";
    public static final String LAVENDER = "\033[38;5;133m";
    public static final String BRONZE = "\033[38;5;94m";
    public static final String CERULEAN = "\033[38;5;37m";
    public static final String APPLE_GREEN_BACKGROUND = "\033[48;5;154m";
    public static final String RED_BACKGROUND = "\033[41m";
    public static final String YELLOW_BACKGROUND = "\033[43m";
    public static final String RED_BACKGROUND_BRIGHT = "\033[0;101m";
    public static final String WHITE_BACKGROUND = "\033[47m";
    public static final String GREEN_BACKGROUND = "\033[42m"; 
    public static final String BLUE_BACKGROUND = "\033[44m";
    public static final String BOLD = "\033[1m";
}
class User 
{
    private String username;
    private String password;
    public String getUsername() 
    {
        return username;
    }
    public void setUsername(String username) 
    {
        this.username = username;
    }
    public String getPassword() 
    {
        return password;
    }
    public void setPassword(String password) 
    {
        this.password = password;
    }
    public static int validation(String username, String password) 
    {
        boolean isPasswordValid = (password.length() >= 6) && (password.matches(".*[A-Z].*"))&& (password.matches(".*[a-z].*"))&&(password.matches(".*[0-9].*"))&&(password.matches(".*[!@#$%^&()_+|~=`{}\\[\\]:\";'<>?,./].*")); 
        if (!isPasswordValid) 
        {
            System.out.println(ConsoleColors.RED_BACKGROUND + "\nPassword must be at least 6 characters, contain one uppercase letter, and one special character.\n" + ConsoleColors.RESET);
            return 0;
        }
        System.out.println(ConsoleColors.YELLOW_BACKGROUND+ConsoleColors.BOLD+ "\nSuccessfully Signed Up!" + ConsoleColors.RESET);
        return 1;
    }
}
// login---------------------------------------------------
class SignUpandLogin
{
    static User obj=new User();
    public int login() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print(ConsoleColors.PURPLE +"Enter Username: " + ConsoleColors.RESET);
        String username = sc.nextLine();
        System.out.print(ConsoleColors.PURPLE +"Enter Password: " + ConsoleColors.RESET);
        String password = sc.nextLine();
        if (obj.getPassword().equals(password) && obj.getUsername().equals(username)) 
        {
            System.out.println(ConsoleColors.PURPLE + ConsoleColors.BLUE_BACKGROUND+"\nWELCOME, " + username + "!" + ConsoleColors.RESET);
            return 1;            
        }
        System.out.println(ConsoleColors.RED_BACKGROUND_BRIGHT+ "\nTHE ACCOUNT DOES NOT EXIST, PLEASE ENTER YOUR ACCOUNT INFORMATION AGAIN OR SIGN UP.\n" + ConsoleColors.RESET);
        return 0;
    }
}
interface Donar
{
    String donation();
}
abstract class Receiver
{
    abstract String receving();
}
class Donate extends Manage
{
    static Scanner sc=new Scanner(System.in);
    class Blood implements Donar
    {
        public String donation()
        {
            x=0;
            System.out.println(ConsoleColors.BRONZE+"\nPlease enter your age: "+ConsoleColors.RESET);
            int age=sc.nextInt();
            if(age>=18&&age<=60)
            {
                System.out.println(ConsoleColors.BRONZE+"\nPlease enter your weight:  "+ConsoleColors.RESET);
                int weight=sc.nextInt();
                if(weight>=50)
                {
                    System.out.println(ConsoleColors.BRONZE+"\nPlease provide the dates of your recent donations: "+ConsoleColors.RESET);
                    int days=sc.nextInt();
                    if(days>=90)
                    {
                        System.out.println(ConsoleColors.GREEN_BACKGROUND+"\nYou are eligible to donate blood.\n"+ConsoleColors.RESET);
                        System.out.println(ConsoleColors.CERULEAN+"\nHow many units of blood would you like to donate? "+ConsoleColors.RESET);
                        int blood=sc.nextInt();
                        System.out.println(ConsoleColors.BRONZE+"\nPlease enter your choice  "+ConsoleColors.RESET);
                        System.out.println(ConsoleColors.LAVENDER+"\n1. A+ \n2. A- \n3. B+ \n4. B- \n5. O+ \n6. O- \n7. AB+ \n8. AB-\n"+ConsoleColors.RESET);
                        int ch=sc.nextInt();
                        switch(ch)
                        {
                            case 1:
                            {
                                Apos=Apos+blood;
                                return "\nThankyou for Donating A+ blood.\n";
                            }
                            case 2:
                            {
                                Aneg=Aneg+blood;
                                return "\nThankyou for Donating A- blood.\n";
                            }
                            case 3:
                            {
                                Bpos=Bpos+blood;
                                return "\nThankyou for Donating B+ blood.\n";
                            }
                            case 4:
                            {
                                Bneg=Bneg+blood;
                                return "\nThankyou for Donating B- blood.\n";
                            }
                            case 5:
                            {
                                Opos=Opos+blood;
                                return "\nThankyou for Donating O+ blood.\n";
                            }
                            case 6:
                            {
                                Oneg=Oneg+blood;
                                return "\nThankyou for Donating O- blood.\n";
                            }
                            case 7:
                            {
                                ABpos=ABpos+blood;
                                return "\nThankyou for Donating AB+ blood.\n";
                            }
                            case 8:
                            {
                                ABneg=ABneg+blood;
                                return "\nThankyou for Donating AB- blood.\n";
                            }
                            default:
                            {
                                x=1;
                                return "\nYou have entered the wrong choice.\n";
                            }
                        }
                    }
                    else
                    {
                        x=1;
                        return "\nSoorryy...! You are not eligible to donate blood as you have donated within the last 90 days.\n";
                    }
                }
                else    
                {
                    x=1;
                    return "\nSorrryy...! Your weight does not meet the eligibility requirements for donating blood.\n";
                }
            }
            else
            {
                x=1;
                return "\nSorry....!  Your age does not meet the eligibility requirements for donating blood.\n";
            }
        }
    }
    class Lungs implements Donar
    {
        public String donation()
        {
            x=0;
            System.out.println(ConsoleColors.BRONZE+"Please enter your choice:"+ConsoleColors.RESET);
            System.out.println(ConsoleColors.LAVENDER+"1. The person smokes. \n2. The person does not smoke."+ConsoleColors.RESET);
            int ch=sc.nextInt();
            if(ch==1)
            {
                x=1;
                return "\nSorry...! you are not eligible to donate lungs due to smoking.\n";
            }
            else 
            {  
                System.out.println(ConsoleColors.CERULEAN+"Enter the no of lungs you need to donate"+ConsoleColors.RESET);
                int num=sc.nextInt();
                lungs=lungs+num;
                return "\nThankyou for donating your lungs.\n";
            }
        }
    }
    class Liver implements Donar
    {
        public String donation()
        {
            x=0;
            System.out.println(ConsoleColors.BRONZE+"Please enter your choice: "+ConsoleColors.RESET);
            System.out.println(ConsoleColors.LAVENDER+"1. Consumes alcohol. \n2. Does not consume alcohol."+ConsoleColors.RESET);
            int ch=sc.nextInt();
            if(ch==1)
            {
                x=1;
                return "\nSorry...! you are not eligible to donate your liver due to alcohol consumption.\n";
            }
            else 
            {
                System.out.println(ConsoleColors.CERULEAN+"Enter the no of livers you need to donate"+ConsoleColors.RESET);
                int num=sc.nextInt();
                livers=livers+num;
                return "\nThank you for donating your liver.\n";
            }
        }
    }
    class Kidney implements Donar
    {
        public String donation()
        {
            x=0;
            System.out.println(ConsoleColors.BRONZE+"Please enter your age: "+ConsoleColors.RESET);
            int age=sc.nextInt();
            if(age>=18)
            {
                System.out.println(ConsoleColors.BRONZE+"Please enter your choice: "+ConsoleColors.RESET);
                System.out.println(ConsoleColors.LAVENDER+"1. Consumes alcohol. \n2. Does not consume alcohol."+ConsoleColors.RESET);
                int ch=sc.nextInt();
                if(ch==1)
                {
                    x=1;
                    return "\nSorry....! you are not eligible to donate your kidney due to alcohol consumption.\n";
                }
                else 
                {
                    System.out.println(ConsoleColors.CERULEAN+"Enter the no of kidneys you need to donate"+ConsoleColors.RESET);
                    int num=sc.nextInt();
                    kidneys=kidneys+num;
                    return "\nThankyou for donating the lungs\n";
                }
            }
            else
            {
                x=1;
                return "\nSoorryy...! Your age does not meet the eligibility requirements for donating kidneys.\n";
            }
        }
    }
    class Eyes implements Donar
    {
        public String donation()
        {
            x=0;
            System.out.println(ConsoleColors.BRONZE+"Please indicate if the eye is infected or not:"+ConsoleColors.RESET);
            System.out.println(ConsoleColors.LAVENDER+"1. Infected \n2. Not infected"+ConsoleColors.RESET);
            int ch=sc.nextInt();
            if(ch==1)
            {
                x=1;
                return "\nSorry....! you are not eligible to donate your eyes due to an eye infection.\n";
            }
            else 
            {
                System.out.println(ConsoleColors.BRONZE+"Please select your condition: "+ConsoleColors.RESET);
                System.out.println(ConsoleColors.RUBY+"1. Have cancer \n2. Do not have cancer"+ConsoleColors.RESET);
                int c=sc.nextInt();
                if(c==1)
                {
                    x=1;
                    return "\nSorry.....! you are not eligible to donate your eyes due to cancer.\n";
                }
                else
                {
                    System.out.println(ConsoleColors.CERULEAN+"Enter the no of eyes you need to donate"+ConsoleColors.RESET);
                    int num=sc.nextInt();
                    eye=eye+num;
                    return "\nThank you for donating your lungs.\n";
                }
            }
        }
    }
    int donatee()
    {
        Donar blood=new Blood();
        Donar lung=new Lungs();
        Donar liver=new Liver();
        Donar kidney=new Kidney();
        Donar eyes=new Eyes();
        while (true) 
        { 
            System.out.println(ConsoleColors.ULTRAMARINE+"Please enter your choice:"+ ConsoleColors.RESET );
            System.out.println(ConsoleColors.RUBY+"1. Blood\n2. Lungs \n3. Liver \n4. Kidney \n5. Eyes \n6. Back \n7. Exit"+ ConsoleColors.RESET);
            int choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println(ConsoleColors.BLACK  +ConsoleColors.APPLE_GREEN_BACKGROUND+ ConsoleColors.BOLD+ "Available blood "+ConsoleColors.RESET);
                    System.out.println(ConsoleColors.RUBY+"1. A+ ===> "+Apos+"\n2. A-  ===> "+Aneg+"\n3. B+  ===> "+Bpos+"\n4. B-  ===> "+Bneg+"\n5. O+  ===> "+Opos+"\n6. O-  ===> "+Oneg+"\n7. AB+  ===> "+ABpos+"\n8. AB- ===> "+ABneg+ConsoleColors.RESET);
                    str=blood.donation();
                    if(x==0)
                        System.out.println(ConsoleColors.GREEN+str+ConsoleColors.RESET); 
                    else
                        System.out.println(ConsoleColors.RED+str+ConsoleColors.RESET); 
                    System.out.println(ConsoleColors.WHITE  +ConsoleColors.WHITE_BACKGROUND+ ConsoleColors.BOLD+ "Available blood "+ConsoleColors.RESET);
                    System.out.println(ConsoleColors.LAVENDER+"1. A+ ===> "+Apos+"\n2. A-  ===> "+Aneg+"\n3. B+  ===> "+Bpos+"\n4. B-  ===> "+Bneg+"\n5. O+  ===> "+Opos+"\n6. O-  ===> "+Oneg+"\n7. AB+  ===> "+ABpos+"\n8. AB- ===> "+ABneg+ConsoleColors.RESET);
                    break;
                case 2:
                    System.out.println(ConsoleColors.BLACK  +ConsoleColors.APPLE_GREEN_BACKGROUND+ ConsoleColors.BOLD+ "Available lungs ===> "+lungs+ConsoleColors.RESET);
                    str=lung.donation();
                    if(x==0)
                        System.out.println(ConsoleColors.GREEN+str+ConsoleColors.RESET);
                    else
                        System.out.println(ConsoleColors.RED+str+ConsoleColors.RESET);
                    System.out.println(ConsoleColors.WHITE +ConsoleColors.WHITE_BACKGROUND+ ConsoleColors.BOLD+ "Available lungs ===> "+lungs+ConsoleColors.RESET);
                    break;
                case 3:
                    System.out.println(ConsoleColors.BLACK  +ConsoleColors.APPLE_GREEN_BACKGROUND+ ConsoleColors.BOLD+ "Available livers ===> "+livers+ConsoleColors.RESET);
                    str=liver.donation();
                    if(x==0)
                        System.out.println(ConsoleColors.GREEN+ConsoleColors.BOLD+liver.donation()+ConsoleColors.RESET);
                    else
                        System.out.println(ConsoleColors.RED+ConsoleColors.BOLD+liver.donation()+ConsoleColors.RESET);
                    System.out.println(ConsoleColors.WHITE  +ConsoleColors.WHITE_BACKGROUND+ ConsoleColors.BOLD+ "Available livers ===> "+livers+ConsoleColors.RESET);
                    break;
                case 4:
                    System.out.println(ConsoleColors.BLACK  +ConsoleColors.APPLE_GREEN_BACKGROUND+ ConsoleColors.BOLD+ "Available Kidney ===> "+kidneys+ConsoleColors.RESET);
                    str=kidney.donation();
                    if(x==0)
                        System.out.println(ConsoleColors.GREEN+ConsoleColors.BOLD+str+ConsoleColors.RESET);
                    else
                        System.out.println(ConsoleColors.RED+ConsoleColors.BOLD+str+ConsoleColors.RESET);  
                    System.out.println(ConsoleColors.WHITE  +ConsoleColors.WHITE_BACKGROUND+ ConsoleColors.BOLD+ "Available Kidney ===> "+kidneys+ConsoleColors.RESET);
                    break;
                case 5:
                    System.out.println(ConsoleColors.BLACK  +ConsoleColors.APPLE_GREEN_BACKGROUND+ ConsoleColors.BOLD+ "Available eyes ===> "+eye+ConsoleColors.RESET);
                    str=eyes.donation();
                    if(x==0)
                        System.out.println(ConsoleColors.GREEN+ConsoleColors.BOLD+str+ConsoleColors.RESET);
                    else
                        System.out.println(ConsoleColors.RED+ConsoleColors.BOLD+str+ConsoleColors.RESET);
                    System.out.println(ConsoleColors.BLACK  +ConsoleColors.WHITE_BACKGROUND+ ConsoleColors.BOLD+ "Available eyes ===> "+eye+ConsoleColors.RESET);
                    break;
                case 6:
                    return 1;   
                case 7:
                    System.exit(0);
                default:
                    System.out.println(ConsoleColors.RED_BACKGROUND_BRIGHT+"Invalid choice entered. Please select a valid option."+ConsoleColors.RESET);
            }
        }
    }
}
class Receive extends Manage
{
    static Scanner sc=new Scanner(System.in);
    class Blood extends Receiver
    {
        String receving()
        {
            x=0;
            System.out.println(ConsoleColors.AQUA+"Please enter your choice: "+ConsoleColors.RESET);
            System.out.println(ConsoleColors.RUBY+"1. A+ \n2. A- \n3. B+ \n4. B- \n5. O+ \n6. O- \n7. AB+ \n8. AB-"+ConsoleColors.RESET);
            int ch=sc.nextInt();
            System.out.println(ConsoleColors.BLUE+"Please enter the required amount of blood."+ConsoleColors.RESET);
            int blood=sc.nextInt();
            switch(ch)
            {
                case 1:
                    if(Apos>=blood)
                    {
                        Apos=Apos-blood;
                        return "\nYes, we have the required amount of A+ blood in stock.\n";
                    }
                    else
                    {
                        x=1;
                        return "\nUnfortunately, we do not have the required amount of A+ blood in stock.\n";
                    }
                case 2:
                    if(Aneg>=blood)
                    {
                        Aneg=Aneg-blood;
                        return "\nYes, we have the required amount of A- blood in stock.\n";
                    }
                    else
                    {
                        x=1;
                        return "\nUnfortunately, we do not have the required amount of A- blood in stock.\n";
                    }
                case 3:
                    if(Bpos>=blood)
                    {
                        Bpos=Bpos-blood;
                        return "\nYes, we have the required amount of B+ blood in stock.\n";
                    }
                    else
                    {
                        x=1;
                        return "\nUnfortunately, we do not have the required amount of B+ blood in stock.\n";
                    }
                case 4:
                    if(Bneg>=blood)
                    {
                        Bneg=Bneg-blood;
                        return "\nYes, we have the required amount of B- blood in stock.\n";
                    }
                    else
                    {
                        x=1;
                        return "\nUnfortunately, we do not have the required amount of B- blood in stock.\n";
                    }
                case 5:
                    if(Opos>=blood)
                    {
                        Opos=Opos-blood;
                        return "\nYes, we have the required amount of O+ blood in stock.\n";
                    }
                    else
                    {
                        x=1;
                        return "\nUnfortunately, we do not have the required amount of O+ blood in stock.\n";
                    }
                case 6:
                    if(Oneg>=blood)
                    {
                        Oneg=Oneg-blood;
                        return "\nYes, we have the required amount of O- blood in stock.\n";
                    }
                    else
                    {
                        x=1;
                        return "\nUnfortunately, we do not have the required amount of O- blood in stock.\n";
                    }
                case 7:
                    if(ABpos>=blood)
                    {
                        ABpos=ABpos-blood;
                        return "\nYes, we have the required amount of AB+ blood in stock.\n";
                    }
                    else
                    {
                        x=1;
                        return "\nUnfortunately, we do not have the required amount of AB+ blood in stock.\n";
                    }
                case 8:
                    if(ABneg>=blood)
                    {
                        ABneg=ABneg-blood;
                        return "\nYes, we have the required amount of AB- blood in stock.\n";
                    }
                    else
                    {
                        x=1;
                        return "\nUnfortunately, we do not have the required amount of AB- blood in stock.\n";
                    }
                default:
                {
                    x=1;
                    return "\nYou have selected an invalid option.\n";
                }
            }
        }
    }
    class Lungs extends Receiver
    {
        String receving()
        {
            x=0;
            System.out.println(ConsoleColors.AQUA+"Please provide the number of lungs required: "+ConsoleColors.RESET);
            int num=sc.nextInt();
            if(lungs>=num)
            {
                lungs=lungs-num;
                return "\nYes, we have the required amount in stock.\n";
            }
            else
            {
                x=1;
                return "\nUnfortunately, we do not have the required no.of lungs in stock.\n";
            }
        }
    }
    class Liver extends Receiver
    {
        String receving()
        {
            x=0;
            System.out.println(ConsoleColors.AQUA+"Please provide the number of liver required: "+ConsoleColors.RESET);
            int num=sc.nextInt();
            if(livers>=num)
            {
                livers=livers-num;
                return "\nYes, we have the required amount in stock.\n";
            }
            else
            {
                x=1;
                return "\nUnfortunately, we do not have the required no.of livers in stock.\n";
            }
        }
    }
    class Kidney extends Receiver
    {
        String receving()
        {
            x=0;
            System.out.println(ConsoleColors.AQUA+"Please provide the number of kidney required: "+ConsoleColors.RESET);
            int num=sc.nextInt();
            if(kidneys>=num)
            {
                kidneys=kidneys-num;
                return "\nYes, we have the required amount in stock.\n";
            }
            else
            {
                x=1;
                return "\nUnfortunately, we do not have the required no.of kidneys in stock.\n";
            }
        }
    }
    class Eyes extends Receiver
    {
        String receving()
        {
            x=0;
            System.out.println(ConsoleColors.AQUA+"Please provide the number of eyes required: "+ConsoleColors.RESET);
            int num=sc.nextInt();
            if(eye>num)
            {
                eye=eye-num;
                return "\nYes, we have the required amount in stock.\n";
            }
            else
            {
                x=1;
                return "\nUnfortunately, we do not have the required no.of eyes in stock.\n";
            }
        }
    }
    int receive()
    {
        Receiver blood=new Blood();
        Receiver lung=new Lungs();
        Receiver liver=new Liver();
        Receiver kidney=new Kidney();
        Receiver eyes=new Eyes();
        while (true) 
        { 
            System.out.println(ConsoleColors.ULTRAMARINE + "Please enter your choice: "+ ConsoleColors.RESET );
            System.out.println(ConsoleColors.RUBY+"\n1. Blood\n2. Lungs \n3. Liver \n4. Kidney \n5. Eyes \n6. Back \n7. Exit"+ ConsoleColors.RESET);
            int choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println(ConsoleColors.BLACK +ConsoleColors.WHITE_BACKGROUND+ ConsoleColors.BOLD+"Available blood"+ ConsoleColors.RESET);
                    System.out.println(ConsoleColors.ULTRAMARINE+"1. A+ ===> "+Apos+"\n2. A-  ===> "+Aneg+"\n3. B+  ===> "+Bpos+"\n4. B-  ===> "+Bneg+"\n5. O+  ===> "+Opos+"\n6. O-  ===> "+Oneg+"\n7. AB+  ===> "+ABpos+"\n8. AB- ===> "+ABneg+ ConsoleColors.RESET);
                    str=blood.receving();
                    if(x==0)
                        System.out.println(ConsoleColors.GREEN+str+ConsoleColors.RESET); 
                    else
                        System.out.println(ConsoleColors.RED+str+ ConsoleColors.RESET); 
                    System.out.println(ConsoleColors.AQUA+ ConsoleColors.BLUE_BACKGROUND+"Available blood"+ ConsoleColors.RESET);
                    System.out.println(ConsoleColors.ULTRAMARINE+"1. A+ ===> "+Apos+"\n2. A-  ===> "+Aneg+"\n3. B+  ===> "+Bpos+"\n4. B-  ===> "+Bneg+"\n5. O+  ===> "+Opos+"\n6. O-  ===> "+Oneg+"\n7. AB+  ===> "+ABpos+"\n8. AB- ===> "+ABneg+ ConsoleColors.RESET);
                    break;
                case 2:
                    System.out.println(ConsoleColors.BLACK +ConsoleColors.WHITE_BACKGROUND+ ConsoleColors.BOLD+"Available lungs ===> "+lungs+ ConsoleColors.RESET);
                    str=lung.receving();
                    if(x==0)
                        System.out.println(ConsoleColors.GREEN+str+ConsoleColors.RESET);
                    else
                        System.out.println(ConsoleColors.RED+str+ConsoleColors.RESET);
                    System.out.println(ConsoleColors.ULTRAMARINE+ ConsoleColors.BLUE_BACKGROUND+"Available lungs ===> "+lungs+ ConsoleColors.RESET);
                    break;
                case 3:
                    System.out.println(ConsoleColors.BLACK +ConsoleColors.WHITE_BACKGROUND+ ConsoleColors.BOLD+"Available livers ===> "+livers+ ConsoleColors.RESET);
                    str=liver.receving();
                    if(x==0)
                        System.out.println(ConsoleColors.GREEN+str+ConsoleColors.RESET);
                    else
                        System.out.println(ConsoleColors.RED+str+ ConsoleColors.RESET);
                    System.out.println(ConsoleColors.ULTRAMARINE+ ConsoleColors.BLUE_BACKGROUND+"Available livers ===> "+livers+ ConsoleColors.RESET);
                    break;
                case 4:
                    System.out.println(ConsoleColors.BLACK +ConsoleColors.WHITE_BACKGROUND+ ConsoleColors.BOLD+"Available kidneys ===> "+kidneys+ ConsoleColors.RESET);
                    str=kidney.receving();
                    if(x==0)
                        System.out.println(ConsoleColors.GREEN+str+ConsoleColors.RESET);
                    else
                        System.out.println(ConsoleColors.GREEN+str+ConsoleColors.RESET);
                    System.out.println(ConsoleColors.ULTRAMARINE+ConsoleColors.BLUE_BACKGROUND+"Available kidneys ===> "+kidneys+ ConsoleColors.RESET);
                    break;
                case 5:
                    System.out.println(ConsoleColors.BLACK +ConsoleColors.WHITE_BACKGROUND+ ConsoleColors.BOLD+"Available eyes ===> "+eye+ ConsoleColors.RESET);
                    str=eyes.receving();
                    if(x==0)
                        System.out.println(ConsoleColors.GREEN+str+ ConsoleColors.RESET);
                    else
                        System.out.println(ConsoleColors.RED+str+ConsoleColors.RESET);
                    System.out.println(ConsoleColors.ULTRAMARINE+ ConsoleColors.BLUE_BACKGROUND+"Available eyes ===> "+eye+ ConsoleColors.RESET);
                    break;
                case 6:
                    return 1;  
                case 7:
                    System.exit(0);
                default:
                    System.out.println(ConsoleColors.RED_BACKGROUND_BRIGHT+"invalid choice entered"+ ConsoleColors.RESET);
            }
        }
    }
}
class Divine extends SignUpandLogin
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(ConsoleColors.BLUE + ConsoleColors.BOLD + ConsoleColors.WHITE_BACKGROUND + "MAIN MENU:" + ConsoleColors.RESET);
        System.out.println(ConsoleColors.YELLOW + "1. LOGIN OR SIGNUP \n2. QUIT" + ConsoleColors.RESET);
        int choice = sc.nextInt();
        sc.nextLine();
        while (choice == 1) 
        {
            System.out.println(ConsoleColors.ORANGE + "1. SIGNUP \n2. LOGIN" + ConsoleColors.RESET);
            int ch = sc.nextInt();
            sc.nextLine();
            if (ch == 1) 
            {
                System.out.print(ConsoleColors.PURPLE + "Enter Username: " + ConsoleColors.RESET);
                String username = sc.nextLine();
                System.out.print(ConsoleColors.PURPLE + "Enter Password: " + ConsoleColors.RESET);
                String password = sc.nextLine();
                int result = User.validation(username, password);
                while (result == 0) 
                {
                    System.out.print(ConsoleColors.PURPLE + "Enter Username: " + ConsoleColors.RESET);
                    username = sc.nextLine();
                    System.out.print(ConsoleColors.PURPLE + "Enter Password: " + ConsoleColors.RESET);
                    password = sc.nextLine();
                    result = User.validation(username, password);
                }
                if (result == 1) 
                {
                    obj.setUsername(username);
                    obj.setPassword(password);
                    System.out.println(ConsoleColors.CYAN+ConsoleColors.BOLD+"********************Created Successfully********************" + ConsoleColors.RESET);
                }
            }
            if (ch == 2) 
            {
                int z= new SignUpandLogin().login();
                if(z==1)
                {
                    System.out.println(ConsoleColors.GREEN_BACKGROUND+ ConsoleColors.WHITE+ConsoleColors.BOLD+"\nGIVE THE GIFT OF LIFE. WHILE YOU MAY NOT CHANGE THE WORLD, YOU HAVE THE POWER TO CHANGE SOMEONE'S LIFE FOREVER—BOTH YOURS AND THEIRS.\n" + ConsoleColors.RESET);    
                    System.out.println(ConsoleColors.AQUA + "Would you like to Donate or Receive? \n"+ ConsoleColors.RESET);
                   
                    int t=0;
                    while(true)
                    {
                        System.out.println(ConsoleColors.YELLOW+ "1. Donate. \n2. Receive. \n3. Main Menu\n4. Exit" + ConsoleColors.RESET);
                        int c=sc.nextInt();
                        switch(c)
                        {
                            case 1:
                                new Donate().donatee();
                                break;
                            case 2:
                                new Receive().receive();;
                                break;
                            case 3:
                                t=1;
                                break;
                            case 4:
                                System.exit(0);
                            default:
                                System.out.println(ConsoleColors.RED_BACKGROUND_BRIGHT+"You have selected an invalid option."+ ConsoleColors.RESET);
                        }
                        if(t==1)
                        {
                            break;
                        }  
                    } 
                }
            }
        }
    }
}