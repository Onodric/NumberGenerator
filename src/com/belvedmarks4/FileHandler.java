package com.belvedmarks4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Class to handle file operations
 */
public class FileHandler {
    private String fileName;

    public FileHandler(String path) {
        this.fileName = path;
        try {
            File myObj = new File(fileName);
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists. Deleting contents...");
                this.eraseFile();
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    /**
     * Appends the given integer on to the end of the file
     * @param line
     */
    public void writeLineToFile(int line) {
        try {
            FileWriter fWriter = new FileWriter(fileName, true);
            BufferedWriter bWriter = new BufferedWriter(fWriter);
            bWriter.write("" + line);
            bWriter.newLine();
            bWriter.close();
        } catch (IOException e) {
            System.out.println("A file write error occurred.");
            e.printStackTrace();
        }
    }

    /**
     * Helper method to wipe a file if it exists already
     */
    private void eraseFile() {
        try {
            new FileWriter(this.fileName, false).close();
        } catch (IOException e) {
            System.out.println("A file write error occurred.");
            e.printStackTrace();
        }
    }
}
