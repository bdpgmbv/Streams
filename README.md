The Java Stream API Tutorial

> Stream Creation 

1. Empty Stream
2. Stream of Collection (how to create "Collection<String> collection")
3. Stream of Array
      1. An array can also be the source of a stream.
      2. We can also create a stream out of an existing array or of part of an array.
4. Stream.builder()
      1. build() method will create an instance of the Stream<Object> - what should we specify for this ?
5. Stream.generate()
      1. As the resulting stream is infinite, the developer should specify the desired size, or the generate() method will work until it reaches the memory limit
6. Stream.iterate()
7. Stream of Primitives
8. Stream of String
9. Stream of File


> Referencing a Stream