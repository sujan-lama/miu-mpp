We cannot use inheritance rule because Cylinder violates LSP rule.
Cylinder has access of computeArea() function. So, when this function is called, it gives area of circle.
Area of circle is not area of cylinder. So, it violates the rule.

Also, if we override computeArea() function in cylinder and give proper formula to calculate area of cylinder,
then our computeVolume() function formula will be incorrect as computeArea() function will give different value.