#### 2. Stream Creation

```declarative
2.1. Empty Stream
2.2. Stream of Collection
    * how to create "Collection<String> collection"
2.3. Stream of Array
    * An array can also be the source of a stream.
    * We can also create a stream out of an existing array or of part of an array.
2.4. Stream.builder()
    * build() method will create an instance of the Stream<Object> 
    * what should we specify for this ?
2.5. Stream.generate()
    * As the resulting stream is infinite, the developer should specify the desired size.
    * or the generate() method will work until it reaches the memory limit
2.6. Stream.iterate()
2.7. Stream of Primitives
2.8. Stream of String
2.9. Stream of File
```


#### 3. Referencing a Stream

```declarative
* (Executing a terminal operation makes a stream inaccessible.) 
* (Java 8 streams can’t be reused.)
* Create a stream with a filter.
* Call it two times and apply two terminal operations on the same stream.
* Make the previous code work properly.
```

#### 4. Stream Pipeline

```declarative  
* (source, intermediate operation(s) and a terminal operation.)
* (We can only use one terminal operation per stream.)
* create onceModifiedStream, twiceModifiedStream. one with many intermediate operations.
```

#### 5. Lazy Invocation

```declarative
* (Intermediate operations are lazy) 
* (This means that they will be invoked only if it is necessary for the terminal operation execution.)
* Write one without terminal operation and write one with terminal operation. 
```

#### 6. Order of Execution

```declarative
* (We need to keep methods such as skip(), filter(), and distinct() at the top of our stream pipeline) 
* Write one with right order and one without right order.
```

#### 7. Stream Reduction

```declarative
```