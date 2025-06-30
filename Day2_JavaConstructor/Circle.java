package LocalRepo.Day2_JavaConstructor;

class Circle {
    double radius;

    Circle() {
        this(1.0);
    }

    Circle(double radius) {
        this.radius = radius;
    }
}

