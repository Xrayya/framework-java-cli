package com.core.Model;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * Model
 */
@Data
@RequiredArgsConstructor
public class Model {
    @NonNull
    protected Long id;
    @NonNull
    protected String fileName = "";

}
