package com.core.Accessor;

import java.util.List;

import com.core.Model.Model;

/**
 * FileStrategy
 */
public interface FileStrategy<T extends Model> {

    List<T> parse(String data);
    String stringify(List<T> data);
    String getFileExtension();
}
