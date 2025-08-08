package wiprodemo;

import java.util.Scanner;

public class Gdrive {
    String fileName;
    String fileType;
    int fileSize;

    void uploadFile(String n, String t, int s) {
        fileName = n;
        fileType = t;
        fileSize = s;
        System.out.println("File '" + fileName + "' uploaded successfully.\n");
    }

    void downloadFile() {
        if (fileName == null) {
            System.out.println("No file uploaded yet.\n");
        } else {
            System.out.println("Downloading file");
            System.out.println("File Name: " + fileName);
            System.out.println("File Type: " + fileType);
            System.out.println("File Size: " + fileSize + " MB");
            System.out.println("Download complete.\n");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Gdrive[] files = new Gdrive[1];
        int count = 0;

        while (true) {
            System.out.println("Google Drive Menu");
            System.out.println("1. Upload File");
            System.out.println("2. Download File");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    if (count < files.length) {
                        files[count] = new Gdrive();
                        System.out.print("Enter file name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter file type: ");
                        String type = sc.nextLine();
                        System.out.print("Enter file size (in MB): ");
                        int size = sc.nextInt();
                        sc.nextLine(); 
                        files[count].uploadFile(name, type, size);
                        count++;
                    } else {
                        System.out.println("Drive storage full (1 files max).\n");
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No files to download.\n");
                    } else {
                        System.out.println("Available files:");
                        for (int i = 0; i < count; i++) {
                            System.out.println((i + 1) + ". " + files[i].fileName);
                        }
                        System.out.print("Enter file number to download: ");
                        int fileNum = sc.nextInt();
                        sc.nextLine();

                        if (fileNum >= 1 && fileNum <= count) {
                            files[fileNum - 1].downloadFile();
                        } else {
                            System.out.println("Invalid file number.\n");
                        }
                    }
                    break;

                case 3:
                    System.out.println("Exiting Google Drive.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option. Try again.\n");
            }
        }
        
    }
}
