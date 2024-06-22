package exercicio;

public class Triangulo {
    public double a;
    public double b;
    public double c;

    public double semiperimetro(){
        return (this.a + this.b + this.c) / 2.0;
    }

    public double area(){
        return Math.sqrt(semiperimetro() * (semiperimetro() - this.a) * (semiperimetro() - this.b) * (semiperimetro() - this.c));
    }
}
