*Task*
======

Describe two different modules for exploiting concurrency Python, pointing out the strengths and weaknesses of each and of concurrency as a whole in Python.

*Answer*
======
> "In computer science, concurrency refers to the ability of different parts or units of a program, algorithm, or problem to be executed out-of-order or in partial order, without affecting the final outcome."[[0]](https://en.wikipedia.org/wiki/Concurrency_(computer_science))

* *Threading*:

    >"Threading in python is used to run multiple threads (tasks, function calls) at the same time."[[1]](https://en.wikibooks.org/wiki/Python_Programming/Threading)
  * Strengths[[2]](https://www.python-course.eu/threads.php):
    * Multithreaded programs can run faster on computer systems with multiple CPUs, because theses threads can be executed truly concurrent.
    * A program can remain responsive to input. This is true both on single and on multiple CPU
    * Threads of a process can share the memory of global variables. If a global variable is changed in one thread, this change is valid for all threads. A thread can have local variables.
    * Lightweight - low memory footprint
    * Shared memory - makes access to state from another context easier

  * Weaknesses [[3]](http://anuragjain67.github.io/writing/2016/01/15/problem-with-multithreading-in-python):
    * When context switch happens it block process, as process is maintaining threads so threads also block.
    * Multithreaded application cannot take advantage of multiprocessing
* *Multiprocessing*: 

    >"Multiprocessing is a package that supports spawning processes using an API similar to the threading module."[[4]](https://docs.python.org/3.4/library/multiprocessing.html?highlight=process)
  * Strengths
    * Separate memory space
    * Code is usually straightforward
    * Takes advantage of multiple CPUs & cores
    * Avoids GIL limitations for cPython
    * Eliminates most needs for synchronization primitives unless if you use shared memory (instead, it's more of a communication model for IPC)
    * Child processes are interruptible/killable
    * Python multiprocessing module includes useful abstractions with an interface much like threading.Thread
    * A must with cPython for CPU-bound processing
  * Weaknesses
    * IPC a little more complicated with more overhead (communication model vs. shared memory/objects)
    * Larger memory footprint