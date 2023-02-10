abstract class Shape {
    int value;

    public abstract double calculateArea();

    public Shape(int value){
        this.value=value;

    }

    public void setValue(int value){
        this.value=value;
    }

    public int getValue(){ return value;}
    
}
