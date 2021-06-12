package SouthWind.s008;

public class square extends figure{
    private int width;
    private int lengh;
    private String colour;

    public square(int weith, int lengh, String colour) {
        this.width = weith;
        this.lengh = lengh;
        this.colour = colour;
    }

    @Override
    public int perimeter() {
        return (this.lengh+this.width)*2;
    }

    @Override
    public int area() {
        return this.width*this.lengh;
    }

    @Override
    public String colour(String colour) {
        this.colour=colour;
        return "染上了"+this.colour+"色！";
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLengh() {
        return lengh;
    }

    public void setLengh(int lengh) {
        this.lengh = lengh;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "square{" +
                "width=" + width +
                ", width=" + lengh +
                ", colour='" + colour + '\'' +
                '}';
    }
}
