package ss24_su23_fpt.ss3_sort_programing.controller;

import ss24_su23_fpt.ss3_sort_programing.library.ILibrary;
import ss24_su23_fpt.ss3_sort_programing.library.Library;
import ss24_su23_fpt.ss3_sort_programing.view.Menu;

public class SearchPrograming extends Menu<String> {
    private final ILibrary library = new Library();

    public SearchPrograming() {
        super("    Search Programing    ", menu);
    }

    private static final String[] menu = {
            " Linear Search",
            " Binary Search",
            " Return main menu"
    };

    @Override
    public void execute(int n) throws Exception {
        switch (n) {
            case 1:
                library.linearSearch();
                break;
            case 2:
                library.binarySearch();
                break;
            case 3:
                return;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}
