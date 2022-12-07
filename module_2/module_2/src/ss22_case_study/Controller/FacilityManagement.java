package ss22_case_study.Controller;

import ss22_case_study.Services.FacilityService;
import ss22_case_study.Services.Implement.FacilityServiceImp;

import java.util.Scanner;

public class FacilityManagement {
    private static Scanner input = new Scanner(System.in);
    private static FacilityService facilityService = new FacilityServiceImp();
    public static void manageFacility() {
        while (true) {
            System.out.println("1. Display list facility");
            System.out.println("2. Add new facility");
            System.out.println("3. Display list facility maintenance"); // sự bảo trì
            System.out.println("4. Return main menu");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    facilityService.display(); break;
                case 2:
                    facilityService.add(); break;
                case 3:
                    facilityService.displayMaintenance(); break;
                case 4:
                    return;
            }
        }
    }
}
