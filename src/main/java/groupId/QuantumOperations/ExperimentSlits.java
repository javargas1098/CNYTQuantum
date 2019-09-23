package groupId.QuantumOperations;

import Operations.Complex;
import Operations.MatrixCalculator;
import Operations.MatrizComplex;
import Operations.VectorComplex;

public class ExperimentSlits {


	public static MatrizComplex slitsProb(int number) {
		int blancas = (number * 2) + 1;
		int matsize = 1 + number + blancas;
		double n1 = 1 / (float) number;
		double n2 = 1 / (float) 3;
		int total = number;
		MatrizComplex mat1 = new MatrizComplex(matsize, matsize);

		for (int i = 0; i < mat1.getFilas(); i++) {
			for (int j = 0; j < mat1.getColumnas(); j++) {
				mat1.addComplex(i, j, new Complex(0, 0));
			}
		}

		for (int i = 0; i < mat1.getFilas(); i++) {
			for (int j = 0; j < mat1.getColumnas(); j++) {
				//
				if (j > 0 && j <= number && i == 0) {
					mat1.addComplex(i, j, new Complex(n1, 0));
				}
				if (1 <= j && j <= number && i == 1) {
					int p = total;
					for (int z = 0; z < 3; z++) {
						mat1.addComplex(j + p, j, new Complex(n2, 0));
						p += 1;
					}
					total += 1;
				}
				if (i == j && i > number && j > number) {
					mat1.addComplex(i, j, new Complex(1, 0));
				}

			}
		}
		return mat1;

	}

	
}
