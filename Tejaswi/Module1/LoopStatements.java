public class LoopStatements {
    public static void main(String[] args) {
        String[] weekDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int index = 0;
        while (index < weekDays.length) {
            System.out.println(weekDays[index]);
            index++;
        }

        for (int ind = 0; ind < weekDays.length; ind++) {
            System.out.println(weekDays[ind]);
        }

        index = 0;

        do {
            System.out.println(weekDays[index]);
            index += 1;
        } while (index < weekDays.length);

        
    }
    
}
