class Complex {

    double real;
    double image;

    public void add(Complex c){
        real += c.real;
        image += c.image;
    }

    public void subtract(Complex c){
        real -= c.real;
        image -= c.image;
    }
}