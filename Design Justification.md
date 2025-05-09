# Design Justification
For this project, we designed a text-based adventure game inspired by Candy Land, where players journey through a series of themed challenges — Lollipop Castle, Frosted Palace, Nana’s Nuthouse, and finally, King Kandy’s Castle.

 Each location is implemented as a class extending from a common superclass (Castle or Paths), allowing us to structure the game using inheritance and encapsulation.

We broke our code into separate classes so it was easier to manage and fix, and so each person could work on their part without getting in each other’s way. Each castle or location had its own challenge logic (e.g., a jumping challenge in Lollipop Castle, a number guessing game in Frosted Palace), which helped isolate bugs and made testing individual components easier. We also made sure the main method acted more as a narrative controller rather than duplicating logic.

# Alternative Considered
One design alternative we discussed was using cards instead of a spinning wheel — or even incorporating both — to determine player movement. While the spinning wheel was simpler to implement programmatically using random numbers, incorporating cards could have added an element of memory or strategy but it was more time consuming to configure. If we had more time, we might have explored a hybrid mechanic that combines randomness with player choice.


