package creator;

public class Bike {

    private Wheel frontWheel, backWheel;
    private Frame frame;

    /* Finish the Bike class. You should be able create a Bike
    object with two Wheel objects and a Frame object*/

    //public Bike() {
    //};

    public Bike(float frontWheelWidth, float backWheelWidth, float frameLength) {
        this.frontWheel = new Wheel(frontWheelWidth);
        this.backWheel = new Wheel((backWheelWidth));
        this.frame = new Frame(frameLength);
    }

    public float getFrontWheel() {
        return frontWheel.getWidth();
    }

    public float getBackWheel() {
        return backWheel.getWidth();
    }

    public float getFrame() {
        return frame.getLength();
    }

    @Override
    public String toString() {
        return "Bike{" +
                "frontWheel=" + frontWheel.getWidth() +
                ", backWheel=" + backWheel.getWidth() +
                ", frame=" + frame.getLength() +
                '}';
    }
}
