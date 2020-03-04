# Roborally   [![Codacy Badge](https://api.codacy.com/project/badge/Grade/3a812c6b77f84733afdb06d7e86e79b8)](https://www.codacy.com/manual/SindrKristensen/wobbly_blues?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=SindrKristensen/wobbly_blues&amp;utm_campaign=Badge_Grade)

## How to play
When a win- or lose condition is met, the program closes and a will print if you've won or lost.

##### Key binds:
* Arrow keys => Move UiB-Owl.

##### Win condition:
* UiB-Owl steps on a flag.

##### Lose conditions:
* UiB-Owl steps in a hole.
* UiB-Owl steps outside the board.

## How to run
run Main inside src/main/java/classes/run/

application primarily uses classes 

## Testing
test classes are inside src/test/java/run 

some tests use the GdxTestRunner class to work, inside src/test/java/testrunner 

## Known bugs
Currently throws "WARNING: An illegal reflective access operation has occurred", 
when the java version used is >8. This has no effect on function or performance, and is just a warning.

## Sources
GdxTestRunner: https://github.com/TomGrill/gdx-testing

