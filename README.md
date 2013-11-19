Numerical Integration Library
=============================

A library in Java for Numerical Integration. It include's Euler's method, Quadratic, Simpson's etc.

The user needs to use this as a package for his benefit. 

To define the wanted function for integration one has to create a version of the interface Function:

  new Function() {
    //you can add more than one double numbers; since it's an interface 
    //it is easy to overwrite
        public double fun(double n) {
          //sample function. change it to the wanted
          return n*Math.sqrt(1-n);
        }
      }
      
Disclaimer
==========

Most of the code is NOT mine. I, however, have changed the code to make it more readable and to be able to run with my configuration. I include the source at the beginning of each class


