package com.core.FileStrategy;

import java.util.List;

import com.core.Model.Model;

/**
 * CsvFileStrategy
 */
public class CsvFileStrategy<T extends Model> implements FileStrategy<T> {

    @Override
    public List<T> parse(String data) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'parse'");
    }

    @Override
    public String stringify(List<T> data) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'stringify'");
    }

    @Override
    public String getFileExtension() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getFileExtension'");
    }
}
