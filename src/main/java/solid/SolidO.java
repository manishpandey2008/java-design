package solid;


import java.io.File;

class RunningExcel {
     String fileName;
     Double fileSize;
     File fileData;

    public RunningExcel(String fileName, Double fileSize, File fileData) {
        this.fileName = fileName;
        this.fileSize = fileSize;
        this.fileData = fileData;
    }

    public void saveInLocalMachine(){
        // Write logic to save in local file storage
    }

    ///  // Now My new Requirment i save in DB
    // Add New Function in this classs

    // This is not a correct way to implement
//    public void saveInDatabase(){
//        // Write logic to save in Database
//    }

}

/// Create a interface and implements to other class

interface FileSave{
    void save(RunningExcel runningExcel);
}

class SaveInLocalFile implements FileSave{
    @Override
    public void save(RunningExcel runningExcel) {
        // Write code for save in local storage
    }
}


class SaveInDatabase implements FileSave{
    @Override
    public void save(RunningExcel runningExcel) {
        // Write code for save in database
    }
}





public class SolidO {

    public static void main(String[] args) {
        // Open close principle
        // This principle said, If you want to add new feature or function in any running class than create a new class and inherit old class




    }
}
