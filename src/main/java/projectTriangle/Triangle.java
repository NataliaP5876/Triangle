package projectTriangle;

/**
 * Created by Vol4onka on 03.04.2018.
 */
public class Triangle {
    public double sideA;
    public double sideB;
    public double sideC;

    public Triangle(){
        this.sideA = 3;
        this.sideB = 4;
        this.sideB = 5;
    }

    public Triangle(double a, double b, double c) {
        if(existTriangle(a,b,c) ) {
            this.sideA = a;
            this.sideB = b;
            this.sideC = c;
        }
        else
            throw new IllegalArgumentException("Такого треугольника не существует");
    }

    public Triangle(Triangle triangle){
        this.sideA = triangle.sideA;
        this.sideB = triangle.sideB;
        this.sideC = triangle.sideC;
    }

    @Override
    public String toString() {
        return "a = " + this.sideA + ", b = " + this.sideB + ", c = " + this.sideC;
    }

    @Override
    public boolean equals(Object obj){
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Triangle triangle = (Triangle)obj;
        return (sideA == triangle.sideA && sideB == triangle.sideB && sideC == triangle.sideC) ? true :false;
    }

    public boolean existTriangle(double a, double b, double c) {
        return (a + b > c && a + c > b && b + c > a) ? true : false;
    }

    public boolean rightTriangle() {
        return (Math.pow(this.sideA,2) == Math.pow(this.sideB,2) + Math.pow(this.sideC,2) || Math.pow(this.sideB,2) == Math.pow(this.sideA,2) + Math.pow(this.sideC,2) || Math.pow(this.sideC,2) == Math.pow(this.sideA,2) + Math.pow(this.sideB,2)) ? true :  false;
    }
}
