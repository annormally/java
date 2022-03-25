# Java Data Types

Data types are divided into two groups:

* Primitive data types - includes `byte` , `short`, `int`, `long`, `float`, `double`, `boolean` and `char`.
* Non-primitive data type - such as `String`, `Arrays` and `Classes`.

## Primitive Data Type

A primitive data type specifies the size and type of variable values, and it has no additional methods.

| Data Type   | Size        | Description                                                                           |
|-------------|-------------|---------------------------------------------------------------------------------------|
|    byte     | 1 byte      | Stores whole numbers from `-128` to `127`                                             |
|    short    | 2 byte      | Stores whole numbers from `-32,768` to `32,767`                                       |
|    int      | 4 byte      | Stores whole numbers from `-2,147,483,648` to `2,147,483,647`                         |
|    long     | 8 byte      | Stores whole numbers from `-9,223,372,036,854,775,808` to `9,223,372,036,854,775,807` |
|    float    | 4 byte      | Stores fractional numbers. Sufficient for storing `6` to `7`decimal digits            |
|    double   | 8 byte      | Stores fractional numbers. Sufficient for storing `15` decimal digits                 |
|    boolean  | 1 bit       | Stores `true` or `false`                                                              |
|    char     | 2 byte      | Stores a single `character/letter` or `ASCII` value                                   |

## Numbers

Primitive numbers types are divided into two groups:

* ### Integer types(`byte`,  `short`, `int` and `long`)
* ### Floating point types (`float` and `double`)

## Integer Types

### `Byte`, `Short`, `Int`, `Long`

## Floating Point Types

### `Float`, `Double`

## Scientific Numbers

A floating point number can also be a scientific number an `"e"` to indicate the power of `10`.

### <u>Booleans</u>

* Boolean values are mostly used for conditional testing.

### <u>Characters</u>

`Tip`: A list of all ASCII values can be found in [ASCII TAble](https://www.asciitable.com/).

### <u>Strings</u>

* The `String` type is so mush used and integrated in Java, that some call it "the special **ninth** type".
* A `String` in `Java` is actually a **<u>non-primitive</u>** data type, because it refers to an object.
* The `String` object has methods that are used to perform certain operation on strings.

## Non-Primitive Data Types
Non-primitive data types are called **reference types** because they refer to objects.

The main difference between **primitive** and **non-primitive** data types are:
* Primitive types are predefined (already defined) in Java. Non-primitive types are created by the programmer and is not defined by Java. (except for **String**).
* Non-Primitive types can be used to call methods to perform certain operations, while primitive types cannot.
* A primitive type has always a value, while non-primitive types can be **null**.
* A primitive type starts with a lowercase letter, while non-primitive types starts with an uppercase letter.
* The size of a primitive type depends on the data type, while non-primitive types have all the same size.

**Non-Primitive** type are <u>String, Arrays, Interface, ...</u>
