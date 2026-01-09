// If the package was not declared this class would belong to the unnamed package (empty string).
package org.ocp.imports;

import static java.lang.Math.PI;
import static java.lang.Math.*;

import java.io.File;

// Only one import statement per class name, so I can't import java.util.List
import org.ocp.extra.List;

// Unnecessary but technically you can import the "this" class.
import org.ocp.imports.Imports;

// This is redundant because it's included by default.
// Classes in package java.lang are implicitly imported, such as String.
import java.lang.*;

// This tries to import classes in the "org" package, which there are none.
// It does not recursively look through sub-packages and include those classes.
import org.*;

public class Imports {
    public static void main(String[] args) {
        // FQCN = Fully Qualified Class Name notation
        java.util.List<String> myList = java.util.List.of("one", "two");

        double twicePi = PI * 2;

        File file;

        // Imports "on demand." The use of abs() means the "*" in the import will import this static component.
        int absOfFive = abs(-5);

        String sam = "Sam";

        List.foo();
    }
}
