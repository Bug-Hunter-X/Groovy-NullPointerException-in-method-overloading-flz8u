```groovy
def foo(a, b) {
  if (a == null) { 
    return b
  }
  return a + b
}

println foo(null, 5) // Output: 5
println foo(2, 3)   // Output: 5
println foo(null, null) //Output: null
```