public class Main {

    public static float S1,S2,S3,S4,S5,S6,S7,workWeek;

    public static void main(String[] args) {
	// write your code here
        workWeek = 40;
        calcWork();
        System.out.printf("With 8 devs working a 3 hour sprint, for %.0f hrs/wk, we would be at %.0f percent of capacity.\n",workWeek,100*calcCapacity()/S1);
        System.out.printf("With 8 devs working a 3 hour sprint, for %.0f hrs/wk, we would be at %.0f percent of capacity.\n",workWeek,100*calcCapacity()/S2);
        System.out.printf("With 8 devs working a 3 hour sprint, for %.0f hrs/wk, we would be at %.0f percent of capacity.\n",workWeek,100*calcCapacity()/S3);
        System.out.printf("With 8 devs working a 3 hour sprint, for %.0f hrs/wk, we would be at %.0f percent of capacity.\n",workWeek,100*calcCapacity()/S4);
        System.out.printf("With 8 devs working a 3 hour sprint, for %.0f hrs/wk, we would be at %.0f percent of capacity.\n",workWeek,100*calcCapacity()/S5);
        System.out.printf("With 8 devs working a 3 hour sprint, for %.0f hrs/wk, we would be at %.0f percent of capacity.\n",workWeek,100*calcCapacity()/S6);
        System.out.printf("With 8 devs working a 3 hour sprint, for %.0f hrs/wk, we would be at %.0f percent of capacity.\n",workWeek,100*calcCapacity()/S7);

        System.out.print("-----------------------------------------------------------------------------------------------\n");

        workWeek = 35;
        calcWork();
        System.out.printf("With 8 devs working a 3 hour sprint, for %.0f hrs/wk, we would be at %.0f percent of capacity.\n",workWeek,100*calcCapacity()/S1);
        System.out.printf("With 8 devs working a 3 hour sprint, for %.0f hrs/wk, we would be at %.0f percent of capacity.\n",workWeek,100*calcCapacity()/S2);
        System.out.printf("With 8 devs working a 3 hour sprint, for %.0f hrs/wk, we would be at %.0f percent of capacity.\n",workWeek,100*calcCapacity()/S3);
        System.out.printf("With 8 devs working a 3 hour sprint, for %.0f hrs/wk, we would be at %.0f percent of capacity.\n",workWeek,100*calcCapacity()/S4);
        System.out.printf("With 8 devs working a 3 hour sprint, for %.0f hrs/wk, we would be at %.0f percent of capacity.\n",workWeek,100*calcCapacity()/S5);
        System.out.printf("With 8 devs working a 3 hour sprint, for %.0f hrs/wk, we would be at %.0f percent of capacity.\n",workWeek,100*calcCapacity()/S6);
        System.out.printf("With 8 devs working a 3 hour sprint, for %.0f hrs/wk, we would be at %.0f percent of capacity.\n",workWeek,100*calcCapacity()/S7);

        System.out.print("-----------------------------------------------------------------------------------------------\n");

        workWeek = 30;
        calcWork();
        System.out.printf("With 8 devs working a 3 hour sprint, for %.0f hrs/wk, we would be at %.0f percent of capacity.\n",workWeek,100*calcCapacity()/S1);
        System.out.printf("With 8 devs working a 3 hour sprint, for %.0f hrs/wk, we would be at %.0f percent of capacity.\n",workWeek,100*calcCapacity()/S2);
        System.out.printf("With 8 devs working a 3 hour sprint, for %.0f hrs/wk, we would be at %.0f percent of capacity.\n",workWeek,100*calcCapacity()/S3);
        System.out.printf("With 8 devs working a 3 hour sprint, for %.0f hrs/wk, we would be at %.0f percent of capacity.\n",workWeek,100*calcCapacity()/S4);
        System.out.printf("With 8 devs working a 3 hour sprint, for %.0f hrs/wk, we would be at %.0f percent of capacity.\n",workWeek,100*calcCapacity()/S5);
        System.out.printf("With 8 devs working a 3 hour sprint, for %.0f hrs/wk, we would be at %.0f percent of capacity.\n",workWeek,100*calcCapacity()/S6);
        System.out.printf("With 8 devs working a 3 hour sprint, for %.0f hrs/wk, we would be at %.0f percent of capacity.\n",workWeek,100*calcCapacity()/S7);
    }

    public static float calcCapacity() {
        return 100+50+20+360+80+160+500+240+40+40;
    }

    public static void calcWork() {
        // 40 hour work week
        S1 = 8*3*workWeek;
        S2 = 9*3*workWeek;
        S3 = 10*3*workWeek;
        S4 = 11*3*workWeek;
        S5 = 8*3*workWeek;
        S6 = 8*5*workWeek;
        S7 = 8*6*workWeek;
    }
}
