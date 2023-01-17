package Bilet21;

public class Search1 implements ISearch {
    public int value;

    public Search1(int value) {
        this.value = value;
    }
    @Override
    public int getValue() {
        return value;
    }
}
