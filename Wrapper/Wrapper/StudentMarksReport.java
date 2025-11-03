public class StudentMarksReport {
    public static void main(String[] args) {
        Object[] marks = {"85", 95, Integer.valueOf(88), "null"};
        int total = 0, count = 0;

        for (Object m : marks) {
            try {
                if (m == null || m.equals("null")) continue;
                int val = (m instanceof String) ? Integer.parseInt((String) m) : (Integer) m;
                total += val;
                count++;
            } catch (Exception e) {
                continue;
            }
        }
        double avg = count == 0 ? 0 : (double) total / count;
        System.out.println("Average marks: " + avg);
    }
}