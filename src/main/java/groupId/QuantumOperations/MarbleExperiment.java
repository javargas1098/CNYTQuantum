package groupId.QuantumOperations;

import Operations.Complex;
import Operations.MatrixCalculator;
import Operations.MatrizComplex;
import Operations.VectorComplex;

public class MarbleExperiment {

	int n;
	MatrizComplex booleanMatrix;
	VectorComplex stateVector;

	public MarbleExperiment(int n) {
		this.n = n;
		booleanMatrix = new MatrizComplex(n, n);
		stateVector = new VectorComplex(n);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				booleanMatrix.addComplex(i, j, new Complex(0, 0));
			}
		}
	}

	public void createStateVector(VectorComplex vector) {
		for (int i = 0; i < n; i++) {
			stateVector.addToMatrix(i, vector.getPosition(i, 0));
		}
	}

	public void setRelation(int i, int j) {
		if (booleanMatrix.getPosition(i, j).getReal() == 1) {
			booleanMatrix.addComplex(i, j, new Complex(0, 0));
		} else if (booleanMatrix.getPosition(i, j).getReal() == 0) {
			booleanMatrix.addComplex(i, j, new Complex(1, 0));
		}
	}

	public VectorComplex click() {
		stateVector = MatrixCalculator.actionMatrix(booleanMatrix, stateVector);
		return stateVector;
	}

	public VectorComplex click(int n) {
		for (int i = 0; i < n; i++) {
			stateVector = MatrixCalculator.actionMatrix(booleanMatrix, stateVector);
		}
		return stateVector;
	}
	 public VectorComplex clickBack() {
		 MatrizComplex transBooleanMatrix = MatrixCalculator.trasMatrix(booleanMatrix);
	        stateVector = MatrixCalculator.actionMatrix(transBooleanMatrix, stateVector);
	        return stateVector;
	    }

	    public VectorComplex clickBack(int n){
	    	MatrizComplex transBooleanMatrix = MatrixCalculator.trasMatrix(booleanMatrix);
	        for (int i = 0; i < n; i++) {
	            stateVector = MatrixCalculator.actionMatrix(transBooleanMatrix, stateVector);
	        }
	        return stateVector;
	    }

}
