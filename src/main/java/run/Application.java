package run;
import view.Menu;


public class Application {
    public static void main(String[] args) {
        Menu menu = new Menu();
        do {
            menu.mainMenu();
        } while(menu.input != 12);
    }
}
