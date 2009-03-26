Groovy Jersey mix
==================

This is a project that outlines how simple it is to integrate Groovy into Jersey.  I had been
looking at what Chad Gallemore had done in doing this [exact same thing][1] but I had not been
able to recreate it successfully.

Well, I have done just that.

To get this project working, perform the minimum steps in Maven:

  1. $ mvn groovy:generateStubs
  2. $ mvn groovy:compile
  3. $ mvn install

and you will have a packaged war that should work great.

I have implemented this using NetBeans, so there are some customizations that were included.
Feel free to disregard those, unless you plan on using NetBeans for your development.


