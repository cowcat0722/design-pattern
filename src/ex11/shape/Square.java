package ex11.shape;

import ex11.color.Color;

public class Square extends Shape {

    public Square(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("사각형을 그립니다.");
        color.setColor();
    }
}
