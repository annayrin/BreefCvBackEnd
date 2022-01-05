package com.company.repository;

import com.company.commons.constants.fileConstants;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileRepository {
    private File dataFolder = null;
    private File dataFile = null;

    public FileRepository() {
        createDataFolder();
        createDataFile();
    }

    private void createDataFolder() {

        dataFolder = new File(System.getProperty("user.home") + File.separator + fileConstants.WHERE_PATH + File.separator + fileConstants.FOLDER_NAME);
        boolean createdFolder = true;

        if (!dataFolder.exists()) {
            dataFolder.mkdir();
        } else if (dataFolder.exists() && !dataFolder.isDirectory()) {
            dataFolder.mkdir();
        }

    }


    private void createDataFile() {

        try {
            dataFile = new File(dataFolder.getAbsolutePath() + File.separator + fileConstants.USER_CV_DATA);
            dataFile.createNewFile();

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }


    public void writeInFile(String str) {
        try {
            FileWriter myWriter = new FileWriter(dataFile.getAbsolutePath());
            myWriter.write(str);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

    public String readFromFile() {
        String data = "";
        try {
            File myObj = new File(dataFile.getAbsolutePath());
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                data += myReader.nextLine();
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return data;
    }

}
