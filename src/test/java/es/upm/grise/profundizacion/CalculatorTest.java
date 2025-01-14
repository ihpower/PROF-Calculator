package es.upm.grise.profundizacion;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Vector;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

	class CalculatorTest {
		
		Calculator calculator = new Calculator();
		Vector<Double> vector = new Vector<Double>();
	
		@BeforeEach
		void init() {
			Vector<Double> vector = new Vector<Double>();
			calculator = new Calculator();
			calculator.numbers=vector;
			
			double primero = 1.0;
			double segundo = 2.0;
			double tercero = 3.0;
			double cuarto = 4.0;
			
			
			calculator.add(primero);
			calculator.add(segundo);
			calculator.add(tercero);
			calculator.add(cuarto);
			
		}
		
		
		@Test
		void test_add(){
			int correcto = 4;
			assertEquals(correcto, calculator.numbers.size(),"the parameter size isn't 2");
		}

		@Test
		void test_max() {
			double correcto = 4.0;
			assertEquals(correcto, calculator.max(),"the parameter max isn't 2.0");
		}


		@Test
		void test_min() {
			double correcto = 1.0;
			assertEquals(correcto, calculator.min(),"the parameter min isn't 1.0");
		}

		
		@Test
		void test_avg() {
			double correcto = 2.5;
			assertEquals(correcto, calculator.average(),"the parameter avg isn't 1.5");
		}
		
		@Test
		void test_stddev() {
			
			double correct = 1.67;	
			
			assertEquals(correct, Double.parseDouble(String.format("%.2f", (double)calculator.stddev())),"the standard dev isn't 1.6");
			
		}
		
		
		void test_remove() {
			calculator.remove(1.0);
			
			int correcto = 1;
			
			assertEquals(correcto, calculator.numbers.size(), "the size of the vector isn't 1");
		}
		
		
		
}
