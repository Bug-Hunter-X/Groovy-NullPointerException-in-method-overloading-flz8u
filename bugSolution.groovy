```groovy
def foo(a, b) {
  a = a ?: 0 // Assign 0 to 'a' if it's null
  b = b ?: 0 // Assign 0 to 'b' if it's null
  return a + b
}

println foo(null, 5) // Output: 5
println foo(2, 3) // Output: 5
println foo(null, null) // Output: 0

// Alternative solution using the Elvis operator for conciseness
def foo2(a, b) {
  return (a ?: 0) + (b ?: 0) 
}
println foo2(null,5) //Output: 5
println foo2(null, null) // Output: 0
```