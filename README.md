Numerical Library
=============================

A library in Java for various auxiliary functions and utilities. Includes Math, Trees, Sorting, Searching and more fun stuff to be added.

Why another Util library you say?
---------------------------------

  First, because I want to. Second, it's a way for me to have some of the stuff I need in one place. Second, I think we(I) have been using all these nice algorithms and data structures and we have lost completely contact with how they actually work. For me to learn something I *program* it.
  
Is there not better and built - in functionality in Java already?
-----------------------------------------------------------------

See above


Math
======
To define the wanted function (e.g. for integration) one has to create a Class implementing the interface Function:

      new Function() {
            public double function(double n) {
              //sample function. change it to the wanted
              return n*Math.sqrt(1-n);
            }
          }
      

TODO
====

1. Search
2. Sort
3. Trees
4. Documentation
5. Unit tests
6. Builds
7. ~~Write this~~

Disclaimer
-----------

Some of the code is NOT mine. I, however, have changed the code to make it more readable and to my preferred style. I include the source at the beginning of each class. Intending to add docs in the future.
