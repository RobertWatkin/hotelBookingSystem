/*
Written By : Robert Watkin
Date Created : 11/10/2019
*/
package hotelbooking;

import database.InitDatabase;
import javax.swing.*;
import java.awt.*;

// This class holds all other windows for the software
public class Window  {
    // VARIABLE DECLARATION
    private static JFrame f;
    static boolean loggedIn;
    private static JPanel mainMenu;
    private static JPanel loginScreen;
    private static JPanel createBooking;
    private static JPanel viewBooking;

    public static Color backgroundColor = Color.orange;
    // END OF VARIABLE DECLARATION

    // Program entry point - main function
    public static void main(String[] args) {
        // initialises a new window object
        Window w = new Window();
        InitDatabase.initDB();
        w.init(); // calls the init function of window
    }

    // init function sets up the applications window
    private void init() {
        // creates a new JFrame where all components will be held

        f = new JFrame();
        loggedIn = false;   // ensure that no one is logged in when the application is started

        // Settings for the JFrame
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // tells the software to close when the 'x' is clicked
        f.setResizable(false);                              // stops users from resizing the window
        f.setSize(500,400);                    // sets the width and height for the window
        f.setLocationRelativeTo(null);                      // gives the window a null starting location

        startMainMenu();    // calls a function to start the main menu
    }

    // the function below starts the main menu
    public static void startMainMenu(){
        // creates a new GraphicalMainMenu
        mainMenu = new GraphicalMainMenu();
        mainMenu.setVisible(true);          // sets the menus visibility to true
        f.getContentPane().removeAll();     // remove all current elements (other menus) from the JFrame
        f.getContentPane().add(mainMenu);   // adds the newly created menu
        f.pack();                           // packs the window so it is ready to view
        f.setVisible(true);                 // ensures the JFrame is visible
    }

    // this function starts the login screen
    public static void startLoginScreen(){
        // creates a new LoginScreen
        loginScreen = new LoginScreen();
        loginScreen.setVisible(true);           // sets the login screen visibility to true
        f.getContentPane().removeAll();         // removes all other elements (other menus) from the JFrame
        f.getContentPane().add(loginScreen);    // adds the newly created login screen
        f.pack();                               // packs the window so it is ready to view
        f.setVisible(true);                     // ensures the JFrame is visible
    }

    // this function starts the create booking screen
    public static void startCreateBookingScreen(){
        createBooking = new CreateBooking();
        createBooking.setVisible(true);
        f.getContentPane().removeAll();
        f.getContentPane().add(createBooking);
        f.pack();
        f.setVisible(true);
    }

    public static void startViewBookingScreen(){
        viewBooking = new ViewBookings();
        f.getContentPane().removeAll();
        f.getContentPane().add(viewBooking);
        f.pack();
        f.setVisible(true);
    }
}
