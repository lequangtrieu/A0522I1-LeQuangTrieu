package ss24_su23_fpt.ss4_count_base_programing.view;

import ss24_su23_fpt.ss4_count_base_programing.controller.FunctionManagement;

public class Main {
    public static void main(String[] args) {
        FunctionManagement functionManagement = new FunctionManagement();
        try {
            functionManagement.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
