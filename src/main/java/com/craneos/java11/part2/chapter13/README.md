# Java 11
## CHAPTER 12

### ANNOTATIONS
The purpose of an annotation is to assign metadata attributes to classes,
methods, variables, and other Java types.

- An annotation element cannot be declared with just any type. It must be a 
primitive type, a String, a Class, an enum, another annotation, or an array of any of these types.
```
public @interface Material {}

public @interface Fluffy {
    int cuteness();
    public abstract int softness() default 11;
    protected Material material(); // DOES NOT COMPILE
    private String friendly(); // DOES NOT COMPILE
    final boolean isBunny(); // DOES NOT COMPILE
}
```
- Annotation variables are implicitly:
  * public
  * static
  * final

- Annotations they can be applied to any Java declaration including the following:
  * Classes, interfaces, enums, and modules 
  * Variables ( static, instance, local)
  * Methods and constructors
  * Method, constructor, and lambda parameters
  * Cast expressions
  * Other annotations

- The following compiles, assuming the annotations referenced in it exist:
```
@FunctionalInterface interface Speedster {
    void go(String name);
}

@LongEars
@Soft @Cuddly public class Rabbit {
    @Deprecated public Rabbit(@NotNull Integer size) {}
    @Speed(velocity="fast") public void eat(@Edible String input) {
        @Food(vegetarian=true) String m = (@Tasty String)"carrots";
        Speedster s1 = new @Racer Speedster() {
            public void go(@FirstName @NotEmpty String name){
                System.out.print("Start! "+name);
            }
        };
        Speedster s2 = (@Valid String n) -> System.out.print(n);
    }
}
```

### TARGET

Values for the @Target annotation:

| ElementType Value     | Applies to |
| ----------- | ---------- |
| TYPE | Classes, interfaces, enums, annotations |
| FIELD | Instance and static variables, enum values |
| METHOD |Method declarations |
| PARAMETER | Constructor, method, and lambda parameters |
| CONSTRUCTOR | Constructor declarations |
| LOCAL_VARIABLE | Local variables |
| ANNOTATION_TYPE | Annotations |
| PACKAGE * | Packages declared in package‐info.java |
| TYPE_PARAMETER | Parameterized types, generic declarations |
| TYPE_USE | Able to be applied anywhere there is a Java type declared or used |
| MODULE | Modules |

### RETENTION

Values for the @Retention annotation:

| RetentionPolicy Value     | Description |
| ----------- | ---------- |
| SOURCE | Used only in the source file, discarded by the compiler |
| CLASS | Stored in the .class file but not available at runtime (default compiler behavior) |
| RUNTIME | Stored in the .class file and available at runtime |

### ANNOTATION SPECIFIC ANNOTATIONS

| Annotation | Marker annotation | Type of value() | Default compiler behaviour |
| ----------- | ---------- | ---------- | ---------- |
| TARGET | NO | Array of ElementType | Annotation able to be applied to all locations except TYPE_USE and TYPE_PARAMETER |
| RETENTION | NO | RetentionPolicy | RetentionPolicy.CLASS |
| DOCUMENTED | YES | - | Annotations are not included in the generated Javadoc. |
| INHERITED | YES | - | Annotations in supertypes are not inherited. |
| REPEATABLE | NO | Annotation | Annotation cannot be repeated. |


####EXAM
- Starts at page 785
- Review 827
- Solutions 1528

####ANSWERS