package com;

import java.util.Objects;

public class Direction {
  private final Directions directions;

  public Direction(Directions directions) { this.directions = directions;}

  public Directions turnRight() {
    return this.directions.turnRight();
  }

  public Directions turnLeft() {
    return this.directions.turnLeft();
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Direction direction = (Direction) o;
    return Objects.equals(directions, direction.directions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directions);
  }

  @Override
  public String toString() {
    return "Direction{direction=" + directions + '}';
  }

}


