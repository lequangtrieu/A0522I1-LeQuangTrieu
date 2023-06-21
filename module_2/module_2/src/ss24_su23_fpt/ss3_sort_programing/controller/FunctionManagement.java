package ss24_su23_fpt.ss3_sort_programing.controller;

import ss24_su23_fpt.ss3_sort_programing.library.ILibrary;
import ss24_su23_fpt.ss3_sort_programing.library.Library;
import ss24_su23_fpt.ss3_sort_programing.view.Menu;

public class FunctionManagement extends Menu<String> {

    public FunctionManagement() {
        super("    Function Management    ", menu);
    }

    private static final String[] menu = {
            " Sort Programing",
            " Search Programing",
            " Exit"
    };

    @Override
    public void execute(int n) throws Exception {
        switch (n) {
            case 1:
                SortPrograming sortPrograming = new SortPrograming();
                sortPrograming.run();
                break;
            case 2:
                SearchPrograming searchPrograming = new SearchPrograming();
                searchPrograming.run();
                break;
            case 3:
                return;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}
