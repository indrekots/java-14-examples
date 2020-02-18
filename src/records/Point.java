package records;

record Point(double x, double y) {

    public static Point origin() {
        return new Point(0, 0);
    }

    public Point {
        if (x == -10 && y == 10) {
            throw new IllegalArgumentException();
        }
    }

    public double distanceTo(Point point) {
        return Math.sqrt(Math.pow(point.x - this.x, 2) + Math.pow(point.y - this.y, 2));
    }
}
