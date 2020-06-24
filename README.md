# JARM 2.0
#### Fully recoded from scratch _without_ using MCreator
JARM 2.0 is JARM but for fabric, a lot of blocks are not present as its still in beta

## how to build
1. download or clone source
2. open a terminal or cmd and run `gradlew build`
3. go to `build/libs`
4. done! now just copy the appropriate .jar file!

## contributing

### guidelines:

#### organise the code well.
 adding a dimension? put it in the folder. adding more blocks? use `registerBlock` in the block file.
 
#### use Kotlin
Kotlin is less bug prone and is easier to read, unless you actually _can't_ use Kotlin try writing the file in java and use the _convert java to kotlin_ feature in IDEA.

#### make code readable
Try to make your code readable and easy to follow, that's the main thing