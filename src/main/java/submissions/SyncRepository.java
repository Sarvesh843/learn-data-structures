package submissions;

import java.io.*;

public class SyncRepository {
    private static final String GITHUB_USERNAME = "hk1997";
    private static final String SUBMISSION_ROOT = "src/main/java/submissions";
    private static final String CORE_ROOT = "./src/main/java/core";


    private static void recursivePrintUtil(File[] arr, int index, int level)
    {
        // terminate condition
        if (index == arr.length)
            return;

        // tabs for internal levels
        for (int i = 0; i < level; i++)
            System.out.print("\t");

        // for files
        if (arr[index].isFile())
            System.out.println("File"+arr[index].getAbsolutePath());

            // for sub-directories
        else if (arr[index].isDirectory()) {
            System.out.println("[" + arr[index].getName()
                    + "]");

            // recursion for sub-directories
            recursivePrintUtil(arr[index].listFiles(), 0,
                    level + 1);
        }

        // recursion for main directory
        recursivePrintUtil(arr, ++index, level);
    }

    private static void recursivePrint(String path)
    {
        File[] arr = new File(path).listFiles();

        recursivePrintUtil(arr, 0, 0);
    }

    // Creates a folder if it doesn't exist
    private static void createFolder(String filePath){
        File f = new File(filePath);
        System.out.println("Filepath "+filePath);

        if(f.exists()){
            System.out.println("Skipping creation of folder as it already exists");
            return;
        }

        boolean isFolderCreated = f.mkdir();

        if(isFolderCreated){
            System.out.println("Folder successfully created for the user");
        }
        else{
            System.out.println("Error in folder creation. Please try again...");
        }
    }

//    private static void updateFiles(){
//        File coreRepo = new File(CORE_ROOT);
//
//        for(File dir : coreRepo.listFiles()){
//            for(File f: dir.listFiles()){
//
//            }
//        }
//    }

    private static void runSync(){
        String submissionFolderPath = SUBMISSION_ROOT+"/"+GITHUB_USERNAME;
        createFolder(submissionFolderPath);
        recursivePrint(CORE_ROOT);
    }

    public static void main(String[] args) {
         runSync();
    }
}
