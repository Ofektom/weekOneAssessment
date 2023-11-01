package org.example.department.services;

import java.io.BufferedReader;
import java.io.IOException;

public interface FileInputServices {
    public BufferedReader openFile(String fileName) throws IOException;
}
