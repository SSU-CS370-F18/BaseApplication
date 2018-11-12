package ssu.groupname.baseapplication;

public class Domino {

    Domino(int _left, int _right) {
        this._left = _left;
        this._right = _right;
        _left_taken = false;
        _right_taken = false;
    }
    public void init() {

    }

    public boolean left_take() {
        return _left_taken;
    }

    public boolean right_taken() {
        return _right_taken;
    }

    public int getRightValue() {
        return _right;
    }

    public int getLeftValue() {
        return _left;
    }


    private int _right, _left;
    private boolean _left_taken, _right_taken;
}
