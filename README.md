

# Complex Numbers

## Getting Started
En este proyecto desarrollado en Java tiene como funcion el resolver  distintas operaciones con números complejos y a su vez la interacción de estos en distintos ambientes como lo son matrices y vectores.
## Prerrequisitos

Qué cosas necesitas para instalar el Software:

- Maven
- Java 8+


### Instalando y corriendo

A continuación veras los pasos a seguir para la instalación del software

1. Clona el proyecto en tu maquina.

```
git clone https://github.com/javargas1098/CNYTQuantum

```

2. Entra al directorio recién clonado.

3. Ejecuta los siguientes comandos:
	- Compila nuestro código. De los .java genera los .class.  
    `mvn compile`
	-   Compila las pruebas.  
    `mvn test-compile`
	-   Ejecuta las pruebas.  
    `mvn test`
4. How to use the test

 - Con este fracgmento de codigo podemos ver las pruebas de coeficiente boleanos

```  
		void  clickTest() {

MarbleExperiment  marblesExperiment  =  new  MarbleExperiment(6);

marblesExperiment.setRelation(2, 1);

marblesExperiment.setRelation(2, 5);

marblesExperiment.setRelation(3, 3);

marblesExperiment.setRelation(4, 2);

marblesExperiment.setRelation(5, 0);

marblesExperiment.setRelation(5, 4);

  

VectorComplex  stateVector  =  new  VectorComplex(6);

stateVector.addToMatrix(0, new  Complex(6, 0));

stateVector.addToMatrix(1, new  Complex(2, 0));

stateVector.addToMatrix(2, new  Complex(1, 0));

stateVector.addToMatrix(3, new  Complex(5, 0));

stateVector.addToMatrix(4, new  Complex(3, 0));

stateVector.addToMatrix(5, new  Complex(10, 0));

  

marblesExperiment.createStateVector(stateVector);

  

VectorComplex  answer  =  marblesExperiment.click();

  

VectorComplex  answerExpected  =  new  VectorComplex(6);

answerExpected.addToMatrix(0, new  Complex(0, 0));

answerExpected.addToMatrix(1, new  Complex(0, 0));

answerExpected.addToMatrix(2, new  Complex(12, 0));

answerExpected.addToMatrix(3, new  Complex(5, 0));

answerExpected.addToMatrix(4, new  Complex(1, 0));

answerExpected.addToMatrix(5, new  Complex(9, 0));

  

assertEquals(answerExpected, answer);

  

}
```

 - Con este fracgmento de codigo podemos ver las pruebas del experimento ed la doble rendija 

```  
	MatrizComplex  mat1  =  new  MatrizComplex(8, 8);

  

// math1

Complex  c1  =  new  Complex(0.5, 0);

Complex  c2  =  new  Complex(0, 0);

Complex  c3  =  new  Complex(1, 0);

Complex  c4  =  new  Complex(0.3333333432674408, 0);

// add

  

mat1.addComplex(0, 0, c2);

mat1.addComplex(0, 1, c1);

mat1.addComplex(0, 2, c1);

mat1.addComplex(0, 3, c2);

mat1.addComplex(0, 4, c2);
 ....
mat1.addComplex(7, 5, c2);

mat1.addComplex(7, 6, c2);

mat1.addComplex(7, 7, c3);

  

MatrizComplex  mathfinal  =  ExperimentSlits.slitsProb(2);
```
----------------------------------------------------------------------------

 - fragmento del experimento de probabilidad

```  
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

```

 - Fragmento del experimento de los observables

```  
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
```

 - Fragmento del experimento de la varianza

```  
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
```

 - Fragmento del experimento de valores propios 

```  
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
```
 	
## Built With

* [Java](https://www.java.com/es/) - Lenguaje de programación


## Authors

* **Javier Vargas** - *ECI*
## License

Este proyecto está licenciado bajo GNU  License v3.0 - ver [LICENSE](LICENSE) para más detalles.
