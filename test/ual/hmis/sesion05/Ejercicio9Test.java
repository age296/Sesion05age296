package ual.hmis.sesion05;


import static org.junit.jupiter.api.Assertions.assertEquals;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class Ejercicio9Test {
	static Stream<Arguments> Lists(){
		
		
		return Stream.of(
                Arguments.of(new ArrayList<Integer>(Arrays.asList(1,3,5)), 
                		new ArrayList<Integer>(Arrays.asList()),
                		new ArrayList<Integer>(Arrays.asList(1,3,5))),
                Arguments.of(new ArrayList<Integer>(Arrays.asList()), 
                		new ArrayList<Integer>(Arrays.asList(1,3,5)),
                		new ArrayList<Integer>(Arrays.asList(1,3,5))),
                Arguments.of(new ArrayList<Integer>(Arrays.asList(1,2)), 
                		new ArrayList<Integer>(Arrays.asList(1,3,5)),
                		new ArrayList<Integer>(Arrays.asList(1,2,3,5))),
                Arguments.of(new ArrayList<Integer>(Arrays.asList(1,3,5)), 
                		new ArrayList<Integer>(Arrays.asList(1,2)),
                		new ArrayList<Integer>(Arrays.asList(1,2,3,5))),
                Arguments.of(new ArrayList<Integer>(Arrays.asList(1,2,3)), 
                		new ArrayList<Integer>(Arrays.asList(4,5)),
                		new ArrayList<Integer>(Arrays.asList(1,2,3,4,5))),
                Arguments.of(new ArrayList<String>(Arrays.asList("a","b","c")), 
                		new ArrayList<String>(Arrays.asList("c","d")),
                		new ArrayList<String>(Arrays.asList("a","b","c","d")))
            
                );
	}
	
    @ParameterizedTest(name = "{index} => A {0} B {1} result {2}")
    @MethodSource("Lists")
    <T extends Comparable<? super T>> void  testWithExplicitLocalMethodSourceVehiculos(ArrayList<T> v1, ArrayList<T> v2, ArrayList<T> expected) {
    	Ejercicio9 e9 = new Ejercicio9();
    	assertEquals(e9.listaCadenasOrdenadas(v1, v2), expected);
    }

}