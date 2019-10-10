package groupId.QuantumOperations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.IOException;
import java.util.List;

import Operations.Complex;
import Operations.MatrixCalculator;
import Operations.MatrizComplex;
import Operations.VectorComplex;

public class Pruebas {
	public static void main(String[] args) throws IOException {

//		MatrizComplex mat1 = new MatrizComplex(2, 2);
//		Complex c1 = new Complex(-1, 0);
//		Complex c2 = new Complex(0, -1);
//		Complex c3 = new Complex(0, 1);
//		Complex c4 = new Complex(1, 0);
//		
//		mat1.addComplex(0, 0, c1);
//		mat1.addComplex(0, 1, c2);
//		mat1.addComplex(1, 0, c3);
//		mat1.addComplex(1, 1, c4);
//		

//		MatrizComplex ket1 = new MatrizComplex(4, 4);
//		Complex c1 = new Complex(-3, -1);
//		Complex c2 = new Complex(0, -2);
//		Complex c3 = new Complex(0, 1);
//		Complex c4 = new Complex(2, 0);
//		Complex c5 = new Complex(0, 0);
//		
//		ket1.addComplex(0, 0, c1);
//		ket1wdwaddComplex(0, 1, c5);
//		ket1.addComplex(0, 2, c5);
//		ket1.addComplex(0, 3, c5);	
//		ket1.addComplex(1, 0, c2);
//		ket1.addComplex(1, 1, c5);
//		ket1.addComplex(1, 2, c5);
//		ket1.addComplex(1, 3, c5);
//		ket1.addComplex(2, 0, c3);	
//		ket1.addComplex(2, 1, c5);
//		ket1.addComplex(2, 2, c5);
//		ket1.addComplex(2, 3, c5);
//		ket1.addComplex(3, 0, c4);
//		ket1.addComplex(3, 1, c5);	
//		ket1.addComplex(3, 2, c5);
//		ket1.addComplex(3, 3, c5);
//
// 

//		

//		MatrizComplex mat1 = new MatrizComplex(8, 8);
//
//		// math1
//		Complex c1 = new Complex(0.5, 0);
//		Complex c2 = new Complex(0, 0);
//		Complex c3 = new Complex(1, 0);
//		Complex c4 = new Complex(0.3333333432674408, 0);
//		
//		// add
//
//		mat1.addComplex(0, 0, c2);
//		mat1.addComplex(0, 1, c1);
//		mat1.addComplex(0, 2, c1);
//		mat1.addComplex(0, 3, c2);
//		mat1.addComplex(0, 4, c2);
//		mat1.addComplex(0, 5, c2);
//		mat1.addComplex(0, 6, c2);
//		mat1.addComplex(0, 7, c2);
//		mat1.addComplex(1, 0, c2);
//		mat1.addComplex(1, 1, c2);
//		mat1.addComplex(1, 2, c2);
//		mat1.addComplex(1, 3, c2);
//		mat1.addComplex(1, 4, c2);
//		mat1.addComplex(1, 5, c2);
//		mat1.addComplex(1, 6, c2);
//		mat1.addComplex(1, 7, c2);
//		mat1.addComplex(2, 0, c2);
//		mat1.addComplex(2, 1, c2);
//		mat1.addComplex(2, 2, c2);
//		mat1.addComplex(2, 3, c2);
//		mat1.addComplex(2, 4, c2);
//		mat1.addComplex(2, 5, c2);
//		mat1.addComplex(2, 6, c2);
//		mat1.addComplex(2, 7, c2);
//		mat1.addComplex(3, 0, c2);
//		mat1.addComplex(3, 1, c4);
//		mat1.addComplex(3, 2, c2);
//		mat1.addComplex(3, 3, c3);
//		mat1.addComplex(3, 4, c2);
//		mat1.addComplex(3, 5, c2);
//		mat1.addComplex(3, 6, c2);
//		mat1.addComplex(3, 7, c2);
//		mat1.addComplex(4, 0, c2);
//		mat1.addComplex(4, 1, c4);
//		mat1.addComplex(4, 2, c2);
//		mat1.addComplex(4, 3, c2);
//		mat1.addComplex(4, 4, c3);
//		mat1.addComplex(4, 5, c2);
//		mat1.addComplex(4, 6, c2);
//		mat1.addComplex(4, 7, c2);
//		mat1.addComplex(5, 0, c2);
//		mat1.addComplex(5, 1, c4);
//		mat1.addComplex(5, 2, c4);
//		mat1.addComplex(5, 3, c2);
//		mat1.addComplex(5, 4, c2);
//		mat1.addComplex(5, 5, c3);
//		mat1.addComplex(5, 6, c2);
//		mat1.addComplex(5, 7, c2);
//		mat1.addComplex(6, 0, c2);
//		mat1.addComplex(6, 1, c2);
//		mat1.addComplex(6, 2, c4);
//		mat1.addComplex(6, 3, c2);
//		mat1.addComplex(6, 4, c2);
//		mat1.addComplex(6, 5, c2);
//		mat1.addComplex(6, 6, c3);
//		mat1.addComplex(6, 7, c2);
//		mat1.addComplex(7, 0, c2);
//		mat1.addComplex(7, 1, c2);
//		mat1.addComplex(7, 2, c4);
//		mat1.addComplex(7, 3, c2);
//		mat1.addComplex(7, 4, c2);
//		mat1.addComplex(7, 5, c2);
//		mat1.addComplex(7, 6, c2);
//		mat1.addComplex(7, 7, c3);
//
//		
//		MatrizComplex mathfinal = ExperimentSlits.slitsProb(2);
//		
//		System.out.println(mathfinal.toString2());
//		System.out.println(mat1.toString2());
//		assertEquals(mat1.toString2(), mathfinal.toString2());
//		

//		MatrizComplex mat1 = new MatrizComplex(2, 2);
//		VectorComplex ket2 = new VectorComplex(2);
//		
//		
//		Complex c1 = new Complex(1, 0);
//		Complex c2 = new Complex(0, -1);
//		Complex c3 = new Complex(0, 1);
//		Complex c4 = new Complex(2, 0);
//		Complex c5 = new Complex(Math.sqrt(2) / 2.0, 0);
//		Complex c6 = new Complex(0, Math.sqrt(2) / 2.0);
//
//		
//		
//
//		mat1.addComplex(0, 0, c1);
//		mat1.addComplex(0, 1, c2);
//		mat1.addComplex(1, 0, c3);
//		mat1.addComplex(1, 1, c4);
//		
//		
//		ket2.addToMatrix(0, c5);
//		ket2.addToMatrix(1,  c6);
//		
//		Complex result = QuantumSystem.mean(mat1, ket2);
//        Complex result1 = new Complex(Math.round(result.getReal() * 100.0) / 100.0, Math.round(result.getImaginario() * 100.0) / 100.0);
//        Complex resultToCompare1 = new Complex(2.5, 0);
//        
//        System.out.println(result1);

//		MatrizComplex mat1 = new MatrizComplex(2, 2);
//		VectorComplex ket2 = new VectorComplex(2);
//
//		Complex c1 = new Complex(1, 0);
//		Complex c2 = new Complex(0, -1);
//		Complex c3 = new Complex(0, 1);
//		Complex c4 = new Complex(2, 0);
//		Complex c5 = new Complex(Math.sqrt(2) / 2.0, 0);
//		Complex c6 = new Complex(0, Math.sqrt(2) / 2.0);
//
//		mat1.addComplex(0, 0, c1);
//		mat1.addComplex(0, 1, c2);
//		mat1.addComplex(1, 0, c3);
//		mat1.addComplex(1, 1, c4);
//
//		ket2.addToMatrix(0, c5);
//		ket2.addToMatrix(1, c6);
//		
//		 Complex result = QuantumSystem.variance(mat1, ket2);
//         Complex result1 = new Complex(Math.round(result.getReal() * 100.0) / 100.0, Math.round(result.getImaginario() * 100.0) / 100.0);
//         Complex resultToCompare1 = new Complex(6.5, 0);
		// System.out.println(result1);

//		MatrizComplex mat1 = new MatrizComplex(2, 2);
//		Complex c1 = new Complex(-1, 0);
//		Complex c2 = new Complex(0, -1);
//		Complex c3 = new Complex(0, 1);
//		Complex c4 = new Complex(1, 0);
//
//		mat1.addComplex(0, 0, c1);
//		mat1.addComplex(0, 1, c2);
//		mat1.addComplex(1, 0, c3);
//		mat1.addComplex(1, 1, c4);
//
//		VectorComplex ket2 = new VectorComplex(2);
//
//		Complex c5 = new Complex(-Math.sqrt(2), 0);
//		Complex c6 = new Complex(Math.sqrt(2), 0);
//
//		ket2.addToMatrix(0, c5);
//		ket2.addToMatrix(1, c6);
//		VectorComplex result = QuantumSystem.dinamica(2, ket2, mat1);
//		System.out.println(result);

//		

		MatrizComplex mat1 = new MatrizComplex(2, 2);
		Complex c1 = new Complex(-1, 0);
		Complex c2 = new Complex(0, -1);
		Complex c3 = new Complex(0, 1);
		Complex c4 = new Complex(1, 0);

		mat1.addComplex(0, 0, c1);
		mat1.addComplex(0, 1, c2);
		mat1.addComplex(1, 0, c3);
		mat1.addComplex(1, 1, c4);

		String result = MatrixCalculator.stringMatriz(mat1);
		String resultToCompare = "{{-1.0,-1.0i},{1.0i,1.0}}";
		System.out.println(result);
	}

}
