package com.andreev.unitTests;

import com.andreev.doingTasks.SelectedFromThreeArrays;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DisplayName("Юнит-тесты для задачи - поиск повторов в трех массивах")
public class SelectedFromThreeArraysTests extends SelectedFromThreeArrays {

    @CsvSource(value = {
            "1, 4, 5, 5, 5, 6; 1, 6, 5; 5, 1; 1, 5",
            "0, 0, -1, 4, 7; 7, 0, 0; 9, 7, 0; 0, 7",
            "1, 2, 3, 4; 5, 6, 777, 9, 99, 999; -9, 0, 10; No repeats",
            "0, 0; 0, 0; 0, 0; 0",
            "1; 1; 1; 1"
    }, delimiter = ';')
    @ParameterizedTest(name = "Значения на входе: {0}; {1}; {2}. На выходе: {3}")
    @DisplayName("Проверки метода getSelectedFromThreeArrays. ")
    void positiveTests(String value1, String value2, String value3, String result) {
        assertThat(SelectedFromThreeArrays.getSelectedFromThreeArrays(value1, value2, value3)).isEqualTo(result);
    }
}
