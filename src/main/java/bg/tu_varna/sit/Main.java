package bg.tu_varna.sit;

import bg.tu_varna.sit.files.FileManager;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        FileManager manager = new FileManager();
        System.out.println(
                "Make your choice: \n" +
                "1. Open <file> -> opens <file>\n" +
                "2. Close\n" +
                "3. Save\n" +
                "4. Save as\n" +
                "5. Help\n" +
                "0. Exit -> exits the program\n" +
                '\n' + "Your choice: "
        );
        int ch = scanner.nextInt();
        switch(ch){
            case 1:
                manager.openFile(manager.getPath());
             break;
            case 2:
                manager.closeFile();
            break;
            case 3:
              manager.saveFile();
             break;
            case 4:
                manager.saveFileAs(content, manager.getPath());
            break;
            case 5:{
                System.out.println(
                    "1. Open <file> -> opens <file>" +
                    "2. Close -> closes currently opened file" +
                    "3. Save -> closes currently opened file" +
                    "4. Save as <file> -> saves the currently open file in <file>" +
                    "0. Exit -> exits the program"
                );
            } break ;
            case 0:
                break;
            default:
                System.out.println("Invalid choice!");
        }


    }
}
