# JavaPassByValueOrPassByReference

### Fundamental
Java is **pass-by-value** (not **pass-by-reference**)

1) For *primitive type*: Java pass-by-value
2) For *object type*: Java pass the **copy reference** not the **same reference** (hence people say: Java pass the reference by value)
3) Java pass array by **pass copy reference** (like pass object)

#### When pass by value
If you change the value of variable in **callee** method, it **will not affect** variable in **caller** method (because this variable in callee is copy from caller)

#### When pass by copy reference
If you change the **REFERENCE** of variable in **callee** method, it **will not affect** variable in **caller** method.  (because the reference in callee is copy from caller)

However, if you change the **DATA** of variable in callee method, it **will affect** the varibale in **caller** method (because copy reference also point to same data in memory)
https://stackoverflow.com/a/12429953/5381331
### Definition

From https://stackoverflow.com/questions/373419/whats-the-difference-between-passing-by-reference-vs-passing-by-value

When a parameter is  **passed by VALUE**, the caller and callee have  **two independent variables**  with the same value (the callee will copy the variable from caller to use). If the callee modifies the parameter variable, the effect is not visible to the caller

When a parameter is  **passed by REFERENCE**, the caller and the callee  **use the same variable**  for the parameter. If the callee modifies the parameter variable, the effect is visible to the caller's variable.

### Reference
https://www.journaldev.com/3884/java-is-pass-by-value-and-not-pass-by-reference
https://stackoverflow.com/questions/40480/is-java-pass-by-reference-or-pass-by-value (also check some comment in accept answer)