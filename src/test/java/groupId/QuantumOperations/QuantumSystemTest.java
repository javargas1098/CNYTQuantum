package groupId.QuantumOperations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import Operations.Complex;
import Operations.MatrixCalculator;
import Operations.MatrizComplex;
import Operations.VectorComplex;

public class QuantumSystemTest {
	@Test
	public void probabilityTest() {
		MatrizComplex ket1 = new MatrizComplex(4, 4);
		Complex c1 = new Complex(-3, -1);
		Complex c2 = new Complex(0, -2);
		Complex c3 = new Complex(0, 1);
		Complex c4 = new Complex(2, 0);
		Complex c5 = new Complex(0, 0);

		ket1.addComplex(0, 0, c1);
		ket1.addComplex(0, 1, c5);
		ket1.addComplex(0, 2, c5);
		ket1.addComplex(0, 3, c5);
		ket1.addComplex(1, 0, c2);
		ket1.addComplex(1, 1, c5);
		ket1.addComplex(1, 2, c5);
		ket1.addComplex(1, 3, c5);
		ket1.addComplex(2, 0, c3);
		ket1.addComplex(2, 1, c5);
		ket1.addComplex(2, 2, c5);
		ket1.addComplex(2, 3, c5);
		ket1.addComplex(3, 0, c4);
		ket1.addComplex(3, 1, c5);
		ket1.addComplex(3, 2, c5);
		ket1.addComplex(3, 3, c5);

		double result1 = QuantumSystem.probability(ket1, 2);
		double Compare1 = Math.pow(1.0, 2) / Math.pow(19.0, 2);
		assertEquals(result1, Compare1);

	}

	@Test
	public void transicionalBraKetTest() {
		VectorComplex ket1 = new VectorComplex(2);
		VectorComplex ket2 = new VectorComplex(2);
		Complex c1 = new Complex(Math.sqrt(2) / 2.0, -0);
		Complex c2 = new Complex(0, Math.sqrt(2) / 2.0);
		Complex c3 = new Complex(0, Math.sqrt(2) / 2.0);
		Complex c4 = new Complex(-Math.sqrt(2) / 2.0, 0);

		ket1.addToMatrix(0, c1);
		ket1.addToMatrix(1, c2);

		ket2.addToMatrix(0, c3);
		ket2.addToMatrix(1, c4);

		Complex result = QuantumSystem.probabilityTwoKets(ket1, ket2);
		Complex result1 = new Complex(Math.round(result.getReal() * 100.0) / 100.0,
				Math.round(result.getImaginario() * 100.0) / 100.0);
		Complex resultToCompare1 = new Complex(0, -1.0);
		assertEquals(result1, resultToCompare1);

	}

	@Test
	public void obsTest() {
		MatrizComplex mat1 = new MatrizComplex(2, 2);
		VectorComplex ket2 = new VectorComplex(2);

		Complex c1 = new Complex(1, 0);
		Complex c2 = new Complex(0, -1);
		Complex c3 = new Complex(0, 1);
		Complex c4 = new Complex(2, 0);
		Complex c5 = new Complex(Math.sqrt(2) / 2.0, 0);
		Complex c6 = new Complex(0, Math.sqrt(2) / 2.0);

		mat1.addComplex(0, 0, c1);
		mat1.addComplex(0, 1, c2);
		mat1.addComplex(1, 0, c3);
		mat1.addComplex(1, 1, c4);

		ket2.addToMatrix(0, c5);
		ket2.addToMatrix(1, c6);

		Complex result = QuantumSystem.mean(mat1, ket2);
		Complex result1 = new Complex(Math.round(result.getReal() * 100.0) / 100.0,
				Math.round(result.getImaginario() * 100.0) / 100.0);
		Complex resultToCompare1 = new Complex(2.5, 0);
		assertEquals(result1, resultToCompare1);
	}

	@Test
	public void varianzaTest() {

		MatrizComplex mat1 = new MatrizComplex(2, 2);
		VectorComplex ket2 = new VectorComplex(2);

		Complex c1 = new Complex(1, 0);
		Complex c2 = new Complex(0, -1);
		Complex c3 = new Complex(0, 1);
		Complex c4 = new Complex(2, 0);
		Complex c5 = new Complex(Math.sqrt(2) / 2.0, 0);
		Complex c6 = new Complex(0, Math.sqrt(2) / 2.0);

		mat1.addComplex(0, 0, c1);
		mat1.addComplex(0, 1, c2);
		mat1.addComplex(1, 0, c3);
		mat1.addComplex(1, 1, c4);

		ket2.addToMatrix(0, c5);
		ket2.addToMatrix(1, c6);

		Complex result = QuantumSystem.variance(mat1, ket2);
		Complex result1 = new Complex(Math.round(result.getReal() * 100.0) / 100.0,
				Math.round(result.getImaginario() * 100.0) / 100.0);
		Complex resultToCompare1 = new Complex(6.5, 0);
		assertEquals(result1, resultToCompare1);
	}

	@Test
	public void valPropTest() throws IOException {
		MatrizComplex mat1 = new MatrizComplex(2, 2);
		Complex c1 = new Complex(-1, 0);
		Complex c2 = new Complex(0, -1);
		Complex c3 = new Complex(0, 1);
		Complex c4 = new Complex(1, 0);

		mat1.addComplex(0, 0, c1);
		mat1.addComplex(0, 1, c2);
		mat1.addComplex(1, 0, c3);
		mat1.addComplex(1, 1, c4);

		VectorComplex result = QuantumSystem.valProp(mat1);

		VectorComplex ket2 = new VectorComplex(2);

		Complex c5 = new Complex(-Math.sqrt(2), 0);
		Complex c6 = new Complex(Math.sqrt(2), 0);

		ket2.addToMatrix(0, c5);
		ket2.addToMatrix(1, c6);

		assertEquals(result, ket2);

	}

	@Test
	public void dinamicTest() {
		MatrizComplex mat1 = new MatrizComplex(2, 2);
		Complex c1 = new Complex(-1, 0);
		Complex c2 = new Complex(0, -1);
		Complex c3 = new Complex(0, 1);
		Complex c4 = new Complex(1, 0);

		mat1.addComplex(0, 0, c1);
		mat1.addComplex(0, 1, c2);
		mat1.addComplex(1, 0, c3);
		mat1.addComplex(1, 1, c4);

		VectorComplex ket2 = new VectorComplex(2);

		Complex c5 = new Complex(-Math.sqrt(2), 0);
		Complex c6 = new Complex(Math.sqrt(2), 0);

		ket2.addToMatrix(0, c5);
		ket2.addToMatrix(1, c6);
		VectorComplex result = QuantumSystem.dinamica(2, ket2, mat1);
		VectorComplex ket3 = new VectorComplex(2);

		Complex c7 = new Complex(-2.8284271247461903, 0);
		Complex c8 = new Complex(2.8284271247461903, 0);
		ket3.addToMatrix(0, c7);
		ket3.addToMatrix(1, c8);
		assertEquals(result, ket3);
	}
	
	@Test
	 public void stringMatrizTest() {
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
			assertEquals(result, resultToCompare);
	 }
	 

}
