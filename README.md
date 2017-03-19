# EffectiveJavaItemSeries
Code samples to help learn the [EffectiveJava](http://www.amazon.in/Effective-Java-Joshua-Bloch/dp/0321356683?ie=UTF8&keywords=effective%20java&qid=1478141933&ref_=sr_1_1&s=books&sr=1-1) book item series

## Notes
**Item 1: Consider static factory methods instead of Constructors**

One advantage of static factory is the fact that unlike constructors they have names. In cases where a class seems to require multiple constructors with similar signature, replace the constructors with static factory methods with carefully chosen names to highlight the differences.
 
Unlike constructors, static factory methods are not required to create a new object each time the're invoked. Also they can return an object of any subtype of their return type.

But classes with only public static factory methods and no public or protected constructors cannot be subclassed. Also they are not readily distinguishable i.e. it is hard to figure out if a factory method will instantiate an object or not.

**Item 2: Consider a builder pattern instead of multi-parameter constructors**

Refer to code comments in `BuilderPattern.java`

**Item 3: Enforce the singleton property with a private constructor or an enum type**

Refer to code comments in `SingleElementEnumSingleton.java`

**Item 4: Enforce non-instantiability with private constructor**

Utils and Helper classes with only static fields & methods should have a private constructor to enforce non-instantiability. There is no need for these classes to be able to create objects.

**Item 5: Avoid creating unnecessary objects**

When dealing with objects whose values which do not change, instead of creating them every time the class is called create them as constants in static block and then reuse.
  
**Item 6: Eliminate obsolete object references**

In an example of stack implementation via Array, moving around the pointer to be used as the stack position leaks the item which are popped. Simple fix is to null out the references of objects which are not required any more.

Whenever a class manages its more memory, the programmer should be alert for memory leaks. Further examples are caches or listeners & callbacks.

