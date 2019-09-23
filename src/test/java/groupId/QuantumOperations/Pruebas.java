package groupId.QuantumOperations;

import static org.junit.jupiter.api.Assertions.assertEquals;

import Operations.Complex;
import Operations.MatrizComplex;

public class Pruebas {
	public static void main(String[] args) {
		
		
		
		MatrizComplex mat1 = new MatrizComplex(8, 8);

		// math1
		Complex c1 = new Complex(0.5, 0);
		Complex c2 = new Complex(0, 0);
		Complex c3 = new Complex(1, 0);
		Complex c4 = new Complex(0.3333333432674408, 0);
		
		// add

		mat1.addComplex(0, 0, c2);
		mat1.addComplex(0, 1, c1);
		mat1.addComplex(0, 2, c1);
		mat1.addComplex(0, 3, c2);
		mat1.addComplex(0, 4, c2);
		mat1.addComplex(0, 5, c2);
		mat1.addComplex(0, 6, c2);
		mat1.addComplex(0, 7, c2);
		mat1.addComplex(1, 0, c2);
		mat1.addComplex(1, 1, c2);
		mat1.addComplex(1, 2, c2);
		mat1.addComplex(1, 3, c2);
		mat1.addComplex(1, 4, c2);
		mat1.addComplex(1, 5, c2);
		mat1.addComplex(1, 6, c2);
		mat1.addComplex(1, 7, c2);
		mat1.addComplex(2, 0, c2);
		mat1.addComplex(2, 1, c2);
		mat1.addComplex(2, 2, c2);
		mat1.addComplex(2, 3, c2);
		mat1.addComplex(2, 4, c2);
		mat1.addComplex(2, 5, c2);
		mat1.addComplex(2, 6, c2);
		mat1.addComplex(2, 7, c2);
		mat1.addComplex(3, 0, c2);
		mat1.addComplex(3, 1, c4);
		mat1.addComplex(3, 2, c2);
		mat1.addComplex(3, 3, c3);
		mat1.addComplex(3, 4, c2);
		mat1.addComplex(3, 5, c2);
		mat1.addComplex(3, 6, c2);
		mat1.addComplex(3, 7, c2);
		mat1.addComplex(4, 0, c2);
		mat1.addComplex(4, 1, c4);
		mat1.addComplex(4, 2, c2);
		mat1.addComplex(4, 3, c2);
		mat1.addComplex(4, 4, c3);
		mat1.addComplex(4, 5, c2);
		mat1.addComplex(4, 6, c2);
		mat1.addComplex(4, 7, c2);
		mat1.addComplex(5, 0, c2);
		mat1.addComplex(5, 1, c4);
		mat1.addComplex(5, 2, c4);
		mat1.addComplex(5, 3, c2);
		mat1.addComplex(5, 4, c2);
		mat1.addComplex(5, 5, c3);
		mat1.addComplex(5, 6, c2);
		mat1.addComplex(5, 7, c2);
		mat1.addComplex(6, 0, c2);
		mat1.addComplex(6, 1, c2);
		mat1.addComplex(6, 2, c4);
		mat1.addComplex(6, 3, c2);
		mat1.addComplex(6, 4, c2);
		mat1.addComplex(6, 5, c2);
		mat1.addComplex(6, 6, c3);
		mat1.addComplex(6, 7, c2);
		mat1.addComplex(7, 0, c2);
		mat1.addComplex(7, 1, c2);
		mat1.addComplex(7, 2, c4);
		mat1.addComplex(7, 3, c2);
		mat1.addComplex(7, 4, c2);
		mat1.addComplex(7, 5, c2);
		mat1.addComplex(7, 6, c2);
		mat1.addComplex(7, 7, c3);

		
		MatrizComplex mathfinal = ExperimentSlits.slitsProb(2);
		
		System.out.println(mathfinal.toString2());
		System.out.println(mat1.toString2());
		assertEquals(mat1.toString2(), mathfinal.toString2());
		
	}

}
