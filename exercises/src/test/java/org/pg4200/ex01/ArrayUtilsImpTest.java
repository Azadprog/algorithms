package org.pg4200.ex01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.pg4200.ex01.ArrayUtils;
import org.pg4200.ex01.ArrayUtilsTestTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArrayUtilsImpTest extends ArrayUtilsTestTemplate {

    @Override

    protected ArrayUtils getNewInstance() {
        return new ArrayUtilsImp();
    }


}

