package groupId.QuantumOperations;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import Operations.Complex;
import Operations.MatrizComplex;
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

}
