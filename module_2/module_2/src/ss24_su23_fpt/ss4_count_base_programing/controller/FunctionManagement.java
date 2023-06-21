package ss24_su23_fpt.ss4_count_base_programing.controller;

import ss24_su23_fpt.ss4_count_base_programing.library.ILibrary;
import ss24_su23_fpt.ss4_count_base_programing.library.Library;
import ss24_su23_fpt.ss4_count_base_programing.view.Menu;

public class FunctionManagement extends Menu<String> {
    private final ILibrary library = new Library();

    public FunctionManagement() {
        super("    Function Management    ", menu);
    }

    private static final String[] menu = {
            " Count Character",
            " Base Number Programing",
            " Exit"
    };

    @Override
    public void execute(int n) throws Exception {
        switch (n) {
            case 1:
                library.countNumber();
                break;
            case 2:
                library.baseNumber();
                break;
            case 3:
                return;
        }
    }
}
