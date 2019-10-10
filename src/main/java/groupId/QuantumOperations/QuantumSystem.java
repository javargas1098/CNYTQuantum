package groupId.QuantumOperations;

import java.io.IOException;
import java.util.List;

import Operations.Complex;
import Operations.MatrixCalculator;
import Operations.MatrizComplex;
import Operations.VectorComplex;
import groupId.Web.HttpConnection;

public class QuantumSystem {
	// PROBABILITY
	public static double probability(MatrizComplex ket, int x) {
		double normaKet = MatrixCalculator.norMatriz(ket);
		double probabilidad = Math.pow(ket.getPosition(x, 0).setModule(), 2) / Math.pow(normaKet, 2);
		return probabilidad;
	}

	// ESTADO INICIAL AL FINAL
	public static Complex probabilityTwoKets(VectorComplex ket1, VectorComplex ket2) {
		return MatrixCalculator.innerTwoMatriz(ket2, ket1);
	}

	public static Complex variance(MatrizComplex mat1, VectorComplex ket) {
		if (!MatrixCalculator.isHermitian(mat1)) {
			System.out.println("La matriz no es Hermitian");
			return null;
		} else {
			MatrizComplex meanComplex = MatrixCalculator.scalarMatrix(mean(mat1, ket),
					MatrixCalculator.matIden(mat1.getFilas(), mat1.getColumnas()));
			MatrizComplex deltaObs = MatrixCalculator.sumMatrix(mat1, MatrixCalculator.inverMatriz(meanComplex));
			MatrizComplex deltaObs2 = MatrixCalculator.mulMatriz(deltaObs, deltaObs);
			Complex varianza = MatrixCalculator.innerTwoMatriz(MatrixCalculator.actionMatrix(deltaObs2, ket), ket);
			return varianza;

		}

	}

	public static Complex mean(MatrizComplex mat1, VectorComplex ket) {
		if (!MatrixCalculator.isHermitian(mat1)) {
			System.out.println("La matriz no es Hermitian");
		} 
			//System.out.println(ket.toString());
		    VectorComplex accion = MatrixCalculator.actionMatrix(mat1, ket);
			Complex media = MatrixCalculator.innerTwoMatriz(accion, ket);
			return media;
		
	}
	
	public static VectorComplex valProp(MatrizComplex mat1) throws IOException {
        HttpConnection httpConnection = new HttpConnection();
        List<Double> response = httpConnection.getResponse(MatrixCalculator.stringMatriz(mat1));
        VectorComplex valProps = new VectorComplex(response.size());
        for (int i = 0; i < response.size(); i++) {
        	valProps.addToMatrix(i, new Complex(response.get(i), 0));
        }
        return valProps;
    }
	
	 public static VectorComplex dinamica(int times, VectorComplex ket, MatrizComplex sequence) {
	        VectorComplex finalState = ket;
	        for (int i = 0; i < times; i++) {
	            finalState = MatrixCalculator.actionMatrix(sequence, finalState);
	        }
	        return finalState;
	    }
}
