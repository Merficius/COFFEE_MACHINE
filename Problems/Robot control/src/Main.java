 public static void moveRobot(Robot robot, int toX, int toY) {
        Direction direction = robot.getDirection();
        int x = robot.getX();
        int y = robot.getY();

        if (x != toX) {
            if (direction == Direction.UP) {
                if (toX > x) {
                    robot.turnRight();
                } else {
                    robot.turnLeft();
                }
            } else if (direction == Direction.DOWN) {
                if (toX > x) {
                    robot.turnLeft();
                } else {
                    robot.turnRight();
                }
            } else if (direction == Direction.LEFT) {
                if (toX > x) {
                    robot.turnRight();
                    robot.turnRight();
                }
            } else if (direction == Direction.RIGHT) {
                if (toX < x) {
                    robot.turnLeft();
                    robot.turnLeft();
                }
            }
        }

        for (int i = 0; i < Math.abs(toX - x); i++) {
            robot.stepForward();
        }

        direction = robot.getDirection();

        if (y != toY) {
            if (direction == Direction.UP) {
                if (toY < y) {
                    robot.turnRight();
                    robot.turnRight();
                }
            } else if (direction == Direction.DOWN) {
                if (toY > y) {
                    robot.turnRight();
                    robot.turnRight();
                }
            } else if (direction == Direction.LEFT) {
                if (toY > y) {
                    robot.turnRight();
                } else {
                    robot.turnLeft();
                }
            } else if (direction == Direction.RIGHT) {
                if (toY > y) {
                    robot.turnLeft();
                } else {
                    robot.turnRight();
                }
            }
        }

        for (int i = 0; i < Math.abs(toY - y); i++) {
            robot.stepForward();
        }
}
