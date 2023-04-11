// package String;

public class Route {
    public static void findRoute(String str) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'N') {
                y++;
            } else if (str.charAt(i) == 'S') {
                y--;
            } else if (str.charAt(i) == 'E') {
                x++;
            } else {
                x--;
            }
        }
        float distance = (float) Math.sqrt((x * x) + (y * y));
        System.out.println(distance);
    }

    public static void main(String[] args) {
        String str = "WNEENESENNN";
        findRoute(str);
    }
}
