package org.example.department.utility;

import org.example.department.services.FileInputServices;
import java.io.*;


public class FileInputServiceImpl implements FileInputServices {

    public BufferedReader openFile(String fileName) throws IOException{
        String line;

        File file = new File(fileName);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufReader = new BufferedReader(fileReader);
        return bufReader;

    }
}
