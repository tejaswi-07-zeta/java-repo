public class ConditionalStatements {
    public static int randomNumber(int range) {
        int randomValue = (int)(Math.random() * range);
        return randomValue;
    }
    public static void main(String[] args) {
        String[] weekDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        int dayIndex = randomNumber(10);
        int age = 21;

        boolean isEligible = (age >= 18) ? true : false;

        if (isEligible) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }

        switch (dayIndex) {
            case 0:
                System.out.println(weekDays[0]); break;
                
            case 1:
                System.out.println(weekDays[1]); break;
                
            case 2:
                System.out.println(weekDays[2]); break;
                
            case 3:
                System.out.println(weekDays[3]); break;
                
            case 4:
                System.out.println(weekDays[4]); break;
                
            case 5:
                System.out.println(weekDays[5]); break;
                
            case 6:
                System.out.println(weekDays[6]); break;
                
            default:
                System.out.println("No Day"); break;
                
        }

       
        
    }
    
}