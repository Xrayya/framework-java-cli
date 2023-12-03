package com.core.Service;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import com.core.Accessor.FileAccessor;
import com.core.FileStrategy.FileStrategy;
import com.core.Model.Model;

/**
 * Service
 */
public class Service {
    public <T extends Model> List<T> importData(Class<T> model, FileStrategy<T> fileStrategy) {
        try {
            List<T> list = new ArrayList<>();
            list.addAll(new FileAccessor<>(fileStrategy,
                    ((T) model.getConstructor((Class<?>[]) null).newInstance()).getFileName()).readData());
            return list;
        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
                | NoSuchMethodException | SecurityException e) {
            e.printStackTrace();
        }

        return new ArrayList<>();
    }

    public <T extends Model> void syncData(Class<T> model, List<T> models, FileStrategy<T> fileStrategy) {
        try {
            new FileAccessor<>(fileStrategy,
                    ((T) model.getConstructor((Class<?>[]) null).newInstance()).getFileName()).writeData(models);
        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
                | NoSuchMethodException | SecurityException e) {
            e.printStackTrace();
        }
    }
}
