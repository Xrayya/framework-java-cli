package com.core.Accessor;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import com.core.FileStrategy.FileStrategy;
import com.core.Model.Model;

/**
 * FileAccessor
 */
public class FileAccessor<T extends Model> {
    private FileStrategy<T> fileStrategy;
    private String fileName;
    private File recordFile;

    public FileAccessor(FileStrategy<T> fileStrategy, String fileName) {
        this.fileStrategy = fileStrategy;
        this.fileName = fileName;
        this.recordFile = new File(String.format("./src/main/java/com/RecordFile/%s.%s", this.fileName, fileStrategy.getFileExtension()));
        this.recordFile.getParentFile().mkdirs();
        try {
            System.out.println(String.format("\"%s\" record file found", this.fileName) );
        } catch (Exception e) {
            try {
                recordFile.createNewFile();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            System.out.println(String.format("\"%s\" record file not found, create a new one", this.fileName) );
        }
    }

    public void setFileStrategy(FileStrategy<T> fileStrategy) {
        this.fileStrategy = fileStrategy;
    }

    public List<T> readData() {
        String data = "";
        try {
            Scanner scanner = new Scanner(this.recordFile);
            while (scanner.hasNext()) {
                data += scanner.nextLine();
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return fileStrategy.parse(data);
    }

    public boolean writeData(List<T> data) {
        try {
            FileWriter fileWriter = new FileWriter(recordFile);
            fileWriter.write(fileStrategy.stringify(data));
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }
}
