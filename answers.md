Part 1

Questions:
1. The bug moves to a new location, only if the space in front of it is open, if not it turns 45 degrees.
2. The direction it's facing.
3. Turns 45 degrees clockwise.
4. A flower the color of the bug.
5. When a bug faces the edge, it will turn.  If it's not facing the edge it will react the same as any other time.
6. The bug can't move so it turns.
7. No.
8. It starts colorful and gets closer to black as the bug moves away.
9. Rocks don't move, but they block the bug's path.
10. Bugs can be on flowers on the same space.

Exercises:
1.
0 - North
45 - Northeast
90 - East
135 - Southeast
180 - South
225 - Southwest
270 - West
315 - Northwest
360 - North
2. Can move it wherever. If you try to move it off the grid, it doesn't move and gives an error.
3. setColor()
4. The bug disapeared 


Part 2

Questions:
1. Gives how many spaces the bug should move on each side.
2. It keeps track of how many spaces the bug has moved.
3. The bug needs to turn 90 degrees but turn() only moves the bug 45 degrees.
4. The move method is in Bug and BoxBug extends Bug.
5. Yes, length doesn't change after it is constructed. However, if the path isn't clear, the pattern will differ.
6. It can if there is an obstacle in the way of the path.
7. Right before a bug starts moving in a new direction.

5. Create new BoxBug object, and add it to the grid using world.add()


Part 3

Questions:
1. loc1.getRow()
2. false
3. (4, 4)
4. 135
5. Takes in a direction.

1. getOccupiedLocations(); (getRows() * getColumns) - getOccupiedLocations();
2. isValid(new Location(10,10));
3. Able to override with methods in child classes.
4. It's easier to store objects in ArrayLists

1. Location, Direction, Color
2. 0, red for bugs, black for rocks, color of the bug for flowers.
3. So it can have it's own properties and methods.
4. No. No. Yes but only adding and deleting in code not in the grid.
5. actor.setDirection(getDirection() + 90);

1. isValid(getAdjacentLocation(getDirection()));
2. getOccupiedAdjacentLocations();
3. isValid(), getOccupiedAdjacentLocation(); check if it's okay to move
4. isValid(), getOccupiedLocations();
5. move()
6. canMove is false so it doesn't move
7. It is better to just get a variable.
8. They are set to the color of the bug when they are created
9. No.
10. add(new Flower())
11. 4


